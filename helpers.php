<?php

/**
 * gets the base path
 * @param  string $path
 * @return string
 */

 function basePath($path='')
 {
    return __DIR__.'/'.$path;
 }


 /**
  *load a view
  *
  *@param string $name
  *@return void
  */

  function loadView($name,$data=[]){
    

    $viewPath = basePath("App/views/{$name}.view.php");

    if(file_exists($viewPath)){
      extract($data); 
        require $viewPath;

    }else{
        echo  "view '{$viewPath} not found!'";
    }
  }


   /**
  *load a view
  *
  *@param string $name
  *@return void
  */

  function loadPartial($name,$data=[]){
    $partialPath= basePath("App/views/partials/{$name}.php");
  
    if(file_exists($partialPath)){
      extract($data); 
        require $partialPath;

    }else{
        echo  "partial '{$name} not found!'";
    }}


    /**
     * 
     * inspect a value
     * 
     * @param mixed $value
     * @return void
     */

     function inspect($value){
        echo '<pre>';
        var_dump($value);
        echo '</pre>';
     }

      /**
     * 
     * inspect a value and di
     * 
     * @param mixed $value
     * @return void
     */

     function inspectAndDi($value){
        echo '<pre>';
       die(var_dump($value));
        
     }

     /**
      * sanitize data
      *
      *@param string $dirty
      *@return string
      */

      function sanitize($dirty){
        return filter_var(trim($dirty),FILTER_SANITIZE_SPECIAL_CHARS);
      }


      /**
       * 
       * redirect to a given url
       * @param string $url
       * @return void
       */
      function redirect($url)
      {
        header("Location: {$url}");
      }