<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>


<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>

	<nav class="navbar navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"> <img alt=""
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				width="80" height="50" class="d-inline-block align-text-top">
			</a>
			<!-- <a href="index.jsp">Home</a>	 -->

			<ul>
				<li style="display: inline-block; padding: 20px;">
					<!-- 	<a href="Display.jsp" class="col-lg-2 col-sm-2">Display</a>  -->
					<a href="index.jsp"><button type="button"
							class="btn btn-warning btn-lg">
							Home <span class="glyphicon glyphicon-ok"></span>
						</button></a>
				<li style="display: inline-block;">
			</ul>
		</div>
	</nav>
	<h1> Valentine Special</h1>
	
	<c:forEach items="${errors}" var="e">
	<br>
	<span style="color: red;">${e.message}</span>
	</c:forEach>
	
	<form action="Valentine" method="post">
		<pre>
	<div class="mb-3"> 
    Name : <input type="text" placeholder=" Name" name="name"> 
    
    Valentine Name : <input type="text" placeholder=" Valentine Name"
					name="valentineName"> 
	
	Places : <select name="place">
	<option value="">SELECT</option>   <!-- Giving data as Dynamic i.e, in java code -->
	<c:forEach items="${places }" var="p">
	<option value="${p }">${p }</option> 
	</c:forEach>
	</select>
		
	Gift : <select name="gift">
	<option value="">SELECT </option>  <!-- Giving data as Dynamic i.e, in java code -->
	<c:forEach items="${gifts }" var="g">
	<option value="${g }">${g }</option>
	</c:forEach>
	</select>
	
	    <input type="submit" value="Save" class="btn btn-success" />
		
</div>
	</pre>
	</form>

</body>
</html>