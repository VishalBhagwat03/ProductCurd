<html>
<head>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="./base.jsp"%>
</head>
<body>
	

	<div class="container">
		<table class="table">
			<thead>
				<tr>
					<th scope="col">Id</th>
					<th scope="col">Name</th>
					<th scope="col">Description</th>
					<th scope="col">Price</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach items="${products }" var="p">
				<tr>
					<td>${p.pid }</td>
					<td>${p.name }</td>
					<td>${p.description }</td>
					<td>${p.price }</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
