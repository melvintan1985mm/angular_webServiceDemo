var app = angular.module('mainApp',[]);

app.controller('productController', function($scope, $http){
	
		$http.get('http://localhost:8080/WebServices/api/products/findAllProducts')
		//$http.get('test.JSON')
			.then(function(response){
				//$scope.aaa = response.data;
				$scope.listProducts =  response.data;
			});
		
		$http.get('http://localhost:8080/WebServices/api/infos/test')
		.then(function(response){
				$scope.aaa = response.data;
			});
		
		
});