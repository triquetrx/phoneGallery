<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar-admin.jspf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<c:if test="${isRemoved}">
		<div class="alert alert-success alert-dismissible fade show" role="alert">
			Removed a product from the cart
			<button type="button" class="close" data-dismiss="alert" aria-label="Close">
    			<span aria-hidden="true">&times;</span>
  			</button>
		</div>
	</c:if>
	<c:if test="${empty custList}">
		<h3 class="text-secondary"><strong>YAY</strong>, no issues as of now</h3>
	</c:if>
	<c:if test="${not empty custList}">
		<div class="container">
			<div class="row">
				<div class="col-10">
					<h3 class="text-secondary">Here are all the people who contacted</h3>
				</div>
				<div class="col d-flex justify-content-end">
					<span class="badge badge-secondary" style="height:1.21rem;">x${custList.size()}</span>					
				</div>
			</div>
		</div>
		
		<c:forEach items="${custList}" var="items">
			<table class="card" style="margin: 1rem; padding: 2rem" id="card">
				<tr>
					<td style="width: 16rem">
						<h4 style="margin-bottom: 0px;">Name: ${items.getName()}</h4>
						<h6 class="text-secondary" style="margin-top: 0px;">Description: ${items.getDesc()}</h6>
					</td>
					<td style="width: 30rem;"></td>
					<td style="width: 18rem;"><a href="mailto:${items.getEmail()}" class="btn btn-primary"
						style="margin: 0.33rem">Contact: ${items.getName()} </a> <a
						href="/completed?id=${items.getId()}"
						class="btn btn-success"
						style="margin: 0.33rem">Completed</a></td>
				</tr>
			</table>
		</c:forEach>
		<br/><hr/>
		</c:if>
</div>

<%@include file="commons/end-admin.jspf"%>