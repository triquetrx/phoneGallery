<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar-admin.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<h4 class="text-secondary">Add New Product</h4>
	<br />
	<c:if test="${isProductAdded}">
		<div class="alert alert-success" role="alert">
			Added new product successfully <a href="/index-admin">Click here to check it out</a>
		</div>
	</c:if>
	<form:form method="POST" modelAttribute="product">
		<div class="form-group">
			<form:label path="productName">Product Name</form:label>
			<form:input cssClass="form-control" path="productName" />
			<form:errors cssClass="text-warning" path="productName" />
		</div>
		<div class="form-group">
			<form:label path="productType">Product Type</form:label>
			<form:select class="form-control" path="productType"
				items="${productList}" />
			<form:errors cssClass="text-warning" path="productType" />
		</div>
		<div class="form-group">
			<form:label path="desc">Product Description</form:label>
			<form:textarea class="form-control" path="desc" />
			<form:errors cssClass="text-warning" path="desc" />
		</div>
		<div class="form-group">
			<form:label path="price">Product Price</form:label>
			<form:input class="form-control" path="price" />
			<form:errors cssClass="text-warning" path="price" />
		</div>
		<div class="form-group">
			<form:label path="imageUrl">Product Image URL</form:label>
			<form:input class="form-control" path="imageUrl" />
			<form:errors cssClass="text-warning" path="imageUrl" />
		</div>
		<br />
		<form:button class="btn btn-primary">Add Product</form:button>
	</form:form>
</div>
<%@include file="commons/footer.jspf"%>
<%@include file="commons/end-admin.jspf"%>