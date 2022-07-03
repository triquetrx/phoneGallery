<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
	<form:form method="POST" modelAttribute="contactData">
		<c:if test="${isSuccess}">
			<div class="alert alert-success" role="alert">
				Your form has been successfully submitted.
			</div>
		</c:if>
		<h4 class="text-secondary">Contact Us</h4>
		<br />
		<div class="form-group">
			<form:label path="name">Name</form:label>
			<form:input type="text" cssClass="form-control" path="name" />
			<form:errors class="text-warning" path="name" />
		</div>
		<div class="form-group">
			<form:label path="phoneno">Phone Number</form:label>
			<form:input path="phoneno" cssClass="form-control" />
			<form:errors class="text-warning" path="phoneno" />
		</div>
		<div class="form-group">
			<form:label path="email">Email Id</form:label>
			<form:input cssClass="form-control" path="email" />
			<form:errors class="text-warning" path="email" />
		</div>
		<div class="form-group">
			<form:label path="desc">Issue Description</form:label>
			<form:textarea cssClass="form-control" path="desc"/>
			<form:errors class="text-warning" path="desc" />
		</div>
		<div class="form-check">
			<form:checkbox cssClass="form-check-input" path="updates" id="updates"/>
			<form:label class="form-check-label" path="updates" for="updates">I want to receive updates on new product release</form:label>
		</div>
		<br/>
		<form:button class="btn btn-primary" id="btn">Submit</form:button>
	</form:form>
</div>
<%@include file="commons/end.jspf"%>