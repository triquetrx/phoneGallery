<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar.jspf"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<c:if test="${empty cartList}">
		<h3 class="text-secondary">Your List is Empty</h3>
	</c:if>
	<c:if test="${not empty cartList}">
		<h3 class="text-secondary">Here are all your items</h3>
		<c:forEach items="${cartList}" var="items">
			<table class="card" style="margin: 1rem; padding: 0.5rem" id="card">
				<tr>
					<td style="width: 100px;"><img src="${items.getUrl()}"
						height="120rem" style="padding: 1.2rem;"></td>
					<td style="width: 16rem">
						<h4 style="margin-bottom: 0px;">${items.getProductName()}</h4>
						<p class="text-secondary" style="margin-top: 0px;">${items.getDesc()}</p>
					</td>
					<td style="width: 22rem;"></td>
					<td style="width: 18rem;"><a href="" class="btn btn-primary"
						style="margin: 0.33rem">Pay &#8377; ${items.getPrice()}</a> <a
						href="/delete-from-cart?id=${items.getId()}"
						class="btn btn-primary"
						style="background-color: #AD2831; border-color: #AD2831; margin: 0.33rem">Remove</a></td>
				</tr>
			</table>
		</c:forEach>
	</c:if>
</div>

<%@include file="commons/end.jspf"%>