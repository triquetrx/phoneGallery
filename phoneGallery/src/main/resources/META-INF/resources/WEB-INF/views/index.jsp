<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar.jspf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<h3 class="text-secondary">New Arrivals</h3>
	<br />
	<c:set var="count" scope="page" value="0" />
	<c:forEach begin="1" end="${productList.getProducts().size()/3}"
		var="i">
		<div class="row d-flex justify-content-center">
			<c:forEach begin="0" end="2" var="j">
				<div class="card col-md" style="width: 18rem;" id="card">
					<img class="card-img-top" style="padding: 2rem"
						src="${productList.getProducts().get(count).url}"
						alt="${productList.getProducts().get(count).productName}">
					<div class="card-body">
						<h5 class="card-title">${productList.getProducts().get(count).productName}</h5>
						<h5 class="card-title">
							<b>&#8377; ${productList.getProducts().get(count).price}</b>
						</h5>
						<p class="card-text text-secondary" style="height: 5rem;">${productList.getProducts().get(count).desc}</p>
						<div class="row">
							<a href="/addToCart?id=${count+1}" type="submit"
								class="btn btn-primary col" style="margin: 0.33rem">Add to
								cart</a> <a
								href="https://www.google.com/search?q=${productList.getProducts().get(count).productName}"
								class="btn btn-primary col"
								style="background-color: #AD2831; border-color: #AD2831; margin: 0.33rem">More
								Details</a>
						</div>
					</div>
				</div>
				<c:set var="count" value="${count+1}" scope="page" />
			</c:forEach>
		</div>
	</c:forEach>
</div>
<%@include file="commons/footer.jspf"%>
<%@include file="commons/end.jspf"%>