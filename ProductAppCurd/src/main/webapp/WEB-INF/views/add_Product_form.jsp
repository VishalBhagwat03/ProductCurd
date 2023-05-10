<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product Form</title>
<%@include file="./base.jsp"%>
</head>
<body>
	<h2>Add Product</h2>

	<form action="handel-product" method="post">
		<div class="form-group">
			<label for="exampleInputEmail1">Product Name</label> <input
				type="text" class="form-control" id="exampleInputEmail1" name="Name"
				aria-describedby="emailHelp" placeholder="Enter product name">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Product Description</label> <input
				type="text" class="form-control" id="exampleInputEmail1"
				name="Description" aria-describedby="emailHelp"
				placeholder="Enter product Description">
		</div>
		<div class="form-group">
			<label for="exampleInputEmail1">Product Price</label> <input
				type="text" class="form-control" id="exampleInputEmail1"
				name="Price" aria-describedby="emailHelp"
				placeholder="Enter product Price">
		</div>
		<a href="${pageContext.request.contextPath }">Back</a>
		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>