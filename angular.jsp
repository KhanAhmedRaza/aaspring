<!DOCTYPE >
<html ng-app="">
<head>
<script src= "http://ajax.googleapis.com/ajax/libs/angularjs/1.2.26/angular.min.js"></script>
<script> 
function Hello($scope, $http) { 
         $http.get('http://localhost:8080/SpringAngualarJsIntegration/userdetail.json').
                 success(function(data) { 
                     $scope.user = data; 
                 }); 
         } 

         </script> 
<title>Spring MVC with Angular JS and JSON</title>
</head>
<body>
<div ng-controller="Hello"> 
             <h2>Spring MVC + AngularJS Demo</h2> 
             <p>EMail Id : {{user.emailId}}</p> 
         <p>User Name : {{user.userName}}</p> 
       </div> 
</body>
</html>

