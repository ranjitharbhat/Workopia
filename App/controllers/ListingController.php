<?php

namespace App\Controllers;
use App\Controllers\ErrorController;


use Framework\Database;
use Framework\Session;
use Framework\Validation;
use Framework\Authorization;
use Framework\Middleware\Authorize;

class ListingController
{
    protected $db;
    public function __construct()
    {
        $config=require basePath('config/db.php');
$this->db= new Database($config);

    }
        public function index()
    {

        $listings =$this->db->query('SELECT * from listings ')->fetchAll();
        loadView('listings/index',[
        'listings'=>$listings
]);
 }

 public function create()
 {
    loadView('listings/create');
 }


 /**
  * show a single listing
  *
  *@param array $params
  *@return void
  */



 public function show($params){
    $id=$params['id'] ?? '';

$params=[
    'id'=>$id
];

$listing =$this->db->query('SELECT * FROM listings WHERE id= :id',$params)->fetch();


if(!$listing){
    ErrorController::notFound('listing not found');

return;
}


loadView('listings/show',[
    'listing'=>$listing
]);
 }

 /**
  * store data in database
  *
  *@return void
  */
    public function store(){
    $allowedFields = ['title', 'description', 'salary', 'tags', 'company', 'address', 'city', 'state', 'phone', 'email', 'requirements', 'benifits'];

    $newListingData = array_intersect_key($_POST, array_flip($allowedFields));

    $newListingData['user_id']=Session::get('user')['id'];

$newListingData= array_map('sanitize',$newListingData);

$requiredFields=[
    'title', 'description', 'city', 'state', 'email','salary' 
];

$errors=[];

foreach($requiredFields as $field){
    if(empty($newListingData[$field]) || !Validation::string($newListingData[$field])){
        $errors[$field]=ucfirst($field) . ' is required';
    }
}

  if(!empty($errors)){
loadView('listings/create',[
    'errors'=> $errors,
    'listing'=>$newListingData
]);
  }
  else{
    $feilds=[];

    foreach($newListingData as $field=>$value){
        $fields[]=$field;
    }
    $fields=implode(', ',$fields);

    $values=[];
    foreach($newListingData as $field=>$value)
    {
        if( $value===''){
            $newListingData[$field]=null;
        }
        $values[]=':'.$field;
    }

    $values=implode(', ',$values);
    
    $query="INSERT INTO listings ({$fields}) VALUES ({$values})";

    $this->db->query($query, $newListingData);

    Session::setFlashMessage('success_message', 'Listing created successfully');


    redirect('/listings');
  }
 
}
/**
 * Delete a listing
 * 
 * @param array $param
 * @return void
 */
public function destroy($params)
  {
    $id = $params['id'];

    $params = [
      'id' => $id
    ];

    $listing = $this->db->query('SELECT * FROM listings WHERE id = :id', $params)->fetch();

    // Check if listing exists
    if (!$listing) {
      ErrorController::notFound('Listing not found');
      return;
    }

    if (!Authorization::isOwner($listing->user_id)) {
        Session::setFlashMessage('error_message', 'You are not authoirzed to delete this listing');
        return redirect('/listings/' . $listing->id);
      }

    $this->db->query('DELETE FROM listings WHERE id=:id',$params);
    
    Session::setFlashMessage('success_message', 'Listing deleted successfully');
  
    redirect('/listings');
}

/**
  * show the listing edit
  *
  *@param array $params
  *@return void
  */



  public function edit($params){
    $id=$params['id'] ?? '';

$params=[
    'id'=>$id
];

$listing =$this->db->query('SELECT * FROM listings WHERE id= :id',$params)->fetch();


if(!$listing){
    ErrorController::notFound('listing not found');

return;
}

// Authorization
if (!Authorization::isOwner($listing->user_id)) {
    Session::setFlashMessage('error_message', 'You are not authoirzed to update this listing');
    return redirect('/listings/' . $listing->id);
  }

loadView('listings/edit',[
    'listing'=>$listing
]);
 }

 /**
  * update a listing
*
*@param array $params
*@return void
  */
  public function update($params)
  {
    $id=$params['id'] ?? '';

$params=[
    'id'=>$id
];

$listing =$this->db->query('SELECT * FROM listings WHERE id= :id',$params)->fetch();


if(!$listing){
    ErrorController::notFound('listing not found');

return;
}
   // Authorization
   if (!Authorization::isOwner($listing->user_id)) {
    Session::setFlashMessage('error_message', 'You are not authoirzed to update this listing');
    return redirect('/listings/' . $listing->id);
  }

$allowedFields = ['title', 'description', 'salary', 'tags', 'company', 'address', 'city', 'state', 'phone', 'email', 'requirements', 'benifits'];
$updateValues=[];
$updateValues = array_intersect_key($_POST, array_flip($allowedFields));
$updateValues= array_map('sanitize',$updateValues);
$requiredFields=[
    'title', 'description', 'city', 'state', 'email','salary' 
];

$errors=[];

foreach($requiredFields as $field){
    if(empty($updateValues[$field]) || !Validation::string($updateValues[$field])){
        $errors[$field]=ucfirst($field) . ' is required';
    }
}
    if(!empty($errors)){
        loadView('/listings/edit',[
            'listing'=> $listing,
            'error'=>$errors
        ]);
        exit;

    }else{
        $updateFields=[];

        foreach(array_keys($updateValues) as $field){
            $updateFields[]="{$field} = :{$field}";
        }
$updateFields=implode(',',$updateFields);

$updateQuery="UPDATE listings SET $updateFields WHERE id= :id";

$updateValues['id']=$id;
$this->db->query($updateQuery,$updateValues);

Session::setFlashMessage('success_message', 'Listing updated');

redirect('/listings/' . $id);

}

  }
  public function search()
  {
    $keywords = isset($_GET['keywords']) ? trim($_GET['keywords']) : '';
    $location = isset($_GET['location']) ? trim($_GET['location']) : '';

    $query = "SELECT * FROM listings WHERE (title LIKE :keywords OR description LIKE :keywords OR tags LIKE :keywords OR company LIKE :keywords) AND (city LIKE :location OR state LIKE :location)";

    $params = [
      'keywords' => "%{$keywords}%",
      'location' => "%{$location}%"
    ];

    $listings = $this->db->query($query, $params)->fetchAll();

    loadView('/listings/index', [
      'listings' => $listings,
      'keywords' => $keywords,
      'location' => $location
    ]);
  }
}