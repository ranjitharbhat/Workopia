<?php

namespace App\Controllers;


use Framework\Database;
class HomeController
{
    protected $db;
    public function __construct()
    {
        $config=require basePath('config/db.php');
$this->db= new Database($config);

    }
    public function index()
    {
        $listings =$this->db->query('SELECT * from listings limit 6')->fetchAll();



loadView('home',[
    'listings'=>$listings
]);
 }
}