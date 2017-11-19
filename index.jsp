<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="angular.js"></script>
<script type="text/javascript" src="controller.js"></script>
<style type="text/css"> 
	.tbl {border: 1px solid #ddd;}
</style>
</head>
<body ng-app="mainApp">
<div ng-controller="productController">
Message from Restful = {{ PpCount }}
<br/><br/>

filter: <input type="text" ng-model="prd">

<table>
	<tr>
		<td class="tbl">ID:</td>
		<td class="tbl">NAME:</td>
		<td class="tbl">PRICE:</td>
	</tr>
	<tr ng-repeat="p in listProducts | filter: prd">
		<td class="tbl">{{ p.id }}</td>
		<td class="tbl">{{p.name}}</td>
		<td class="tbl">{{p.price}}</td>
	</tr>
</table>
 {{ aaa }}
</div>
</body>
</html>