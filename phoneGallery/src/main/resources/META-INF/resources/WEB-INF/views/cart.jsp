<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar.jspf"%>
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
	<c:if test="${empty cartList}">
		<h3 class="text-secondary">Your List is Empty, <a href="index">add products</a> now</h3>
	</c:if>
	<c:if test="${not empty cartList}">
		<div class="container">
			<div class="row">
				<div class="col-10">
					<h3 class="text-secondary">Here are all your items</h3>
				</div>
				<div class="col d-flex justify-content-end">
					<span class="badge badge-secondary" style="height:1.21rem;">x${cartList.size()}</span>					
				</div>
			</div>
		</div>
		
		<c:forEach items="${cartList}" var="items">
			<table class="card" style="margin: 1rem; padding: 0.5rem" id="card">
				<tr>
					<td style="width: 100px;"><img src="${items.getCartProduct().getImageUrl()}"
						height="120rem" style="padding: 1.2rem;"></td>
					<td style="width: 16rem">
						<h4 style="margin-bottom: 0px;">${items.getCartProduct().getProductName()}</h4>
						<p class="text-secondary" style="margin-top: 0px;">${items.getCartProduct().getDesc()}</p>
					</td>
					<td style="width: 22rem;"></td>
					<td style="width: 18rem;"><a href="" class="btn btn-primary"
						style="margin: 0.33rem">Pay &#8377; ${items.getCartProduct().getPrice()}</a> <a
						href="/delete-from-cart?id=${items.getCartItemId()}"
						class="btn btn-primary"
						style="background-color: #AD2831; border-color: #AD2831; margin: 0.33rem">Remove</a></td>
				</tr>
			</table>
		</c:forEach>
		<br/><hr/>
		<div class="container">
			<div class="text-secondary font-italic row">
				<h4 class="col-md-8 col">
					Total
				</h4>
				<h4 class="col-4 d-flex justify-content-end font-weight-bolder">				
				  &#8377;${(Math.round((total)*100))/100}
				</h4>
			</div>
		</div>
		<c:if test="${cartList.size()>=3}">
			<div class="container">
				<div class="text-secondary font-italic row">
					<h4 class="col-md-8 col">
						Discount
					</h4>
					<h4 class="col-4 d-flex justify-content-end font-weight-bolder">				
					  &#8377;${total*0.05}
					</h4>
				</div>
			</div>
			<div class="container">
			<div class="text-secondary font-italic row">
				<h4 class="col-md-8 col">
					Discounted Price
				</h4>
				<c:if test="${cartList.size()<3}">
					<h4 class="col-4 d-flex justify-content-end font-weight-bolder">				
					  &#8377;${(Math.round((total)*100))/100}
					</h4>
				</c:if>
				<c:if test="${cartList.size()>=3}">
				<h4 class="col-4 d-flex justify-content-end font-weight-bolder">				
				  &#8377;${(Math.round((total-(total*0.05))*100))/100}
				</h4>
				</c:if>
			</div>
		</div>
		</c:if>
	</c:if>
</div>

<%@include file="commons/end.jspf"%>