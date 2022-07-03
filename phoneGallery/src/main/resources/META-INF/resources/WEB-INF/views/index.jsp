<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar.jspf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<h1>Welcome to the Phone Gallery</h1>
	<br/>
	<c:forEach begin="1" end="5">
		<div class="card" style="width: 18rem;">
		<img class="card-img-top" src="..." alt="Card image cap">
		<div class="card-body">
			<h5 class="card-title">Card title</h5>
			<p class="card-text">Some quick example text to build on the card
				title and make up the bulk of the card's content.</p>
			<a href="#" class="btn btn-primary">Go somewhere</a>
		</div>
	</div>
	</c:forEach>
	
</div>
<%@include file="commons/end.jspf"%>