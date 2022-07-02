<%@ include file="head.jspf"%>
<%@ include file="navBar.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<div class="container">
    <h1>Contact techy</h1>
	<form:form method="post" modelAttribute="contact">
		<form:label path="name">Name</form:label>
		<form:input type="text" path="name"/>
		<form:label path="phoneno">Phone Number</form:label>
		<form:input path="phoneno"/>
		<form:label path="email">Email Id</form:label>
		<form:input path="email"/>
		<form:button>Submit</form:button>
	</form:form>
</div>
<%@include file="end.jspf"%>