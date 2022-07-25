<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar.jspf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<c:if test="${isAddedToCart}">
		<div class="alert alert-success alert-dismissible fade show" role="alert">
			Added a product to the cart
			<button type="button" class="close" data-dismiss="alert" aria-label="Close">
    			<span aria-hidden="true">&times;</span>
  			</button>
		</div>
	</c:if>
	<h3 class="text-secondary">New Arrivals</h3>
	<br />
	<c:set var="count" scope="page" value="0" />
	<c:forEach begin="1" end="${productList.getProducts().size()/3+productList.getProducts().size()%3}"
		var="i">
		<div class="row d-flex justify-content-center">
			<c:forEach begin="0" end="2" var="j">
			<c:if test="${count<productList.getProducts().size()}">
				<div class="card col-md" style="width: 18rem; height: 42rem" id="card">
					<img class="card-img-top" style="padding: 2.2rem"
						src="${productList.getProducts().get(count).imageUrl}"
						alt="${productList.getProducts().get(count).productName}">
					<div class="card-body">
						<h5 class="card-title">${productList.getProducts().get(count).productName}</h5>
						<h5 class="card-title">
							<b>&#8377; ${productList.getProducts().get(count).price}</b>
						</h5>
						<p class="card-text text-secondary" style="height: 5rem;">${productList.getProducts().get(count).desc}</p>
						<div class="row">
							<a href="/addToCart?id=${productList.getProducts().get(count).getId()}" type="submit"
								class="btn btn-primary col" style="margin: 0.33rem">Add to cart
								</a> 
								<a
								href="https://www.google.com/search?q=${productList.getProducts().get(count).productName}"
								class="btn btn-primary col"
								style="background-color: #AD2831; border-color: #AD2831; margin: 0.33rem">More
								Details</a>
						</div>
					</div>
				</div>
			</c:if>
			<c:set var="count" value="${count+1}" scope="page" />
			<c:if test="${count>productList.getProducts().size()}">
			<div class="col-md" style="width: 18rem;"></div>
			</c:if>
			</c:forEach>
		</div>
	</c:forEach>
</div>
<%@include file="commons/footer.jspf"%>
<%@include file="commons/end.jspf"%>