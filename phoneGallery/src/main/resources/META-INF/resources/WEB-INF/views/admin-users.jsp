<%@ include file="commons/head.jspf"%>
<%@ include file="commons/navBar-admin.jspf"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div class="container">
	<c:if test="${isUserCreated}">	
		<div class="alert alert-success alert-dismissible fade show" role="alert">
			<strong>Successfully added</strong> new admin user
			<button type="button" class="close" data-dismiss="alert" aria-label="Close">
	    		<span aria-hidden="true">&times;</span>
	 		 </button>
		</div>
	</c:if>
	<div class="container px-4 py-5 px-md-5 text-center text-lg-start my-5">
		<div class="row gx-lg-5 align-items-center mb-5">
			<div class="col-lg-6 mb-5 mb-lg-0" style="z-index: 10">
				<h1 class="my-5 display-5 fw-bold ls-tight text-left"
					style="color: #ad2831">
					Create new<br /> <span style="color: #ad283198">Admin user</span>
				</h1>
				<p class="mb-4 text-left" style="color: #0D0A0B">
					Provide the first name and last name also select a password as it
					cann't be changed for a time being. Also note the user will have <strong>ADMIN</strong>
					role only
				</p>
			</div>

			<div class="col-lg-6 mb-5 mb-lg-0 position-relative">
				<div id="radius-shape-1"
					class="position-absolute rounded-circle shadow-5-strong"></div>
				<div id="radius-shape-2" class="position-absolute shadow-5-strong"></div>

				<div class="card bg-glass">
					<div class="card-body px-4 py-5 px-md-5">
						<form:form method="post" modelAttribute="newAdminUser">
							<!-- 2 column grid layout with text inputs for the first and last names -->
							<div class="row">
								<div class="col-md-6 mb-4">
									<div class="form-outline">
										<form:input type="text" path="userFirstName"
											class="form-control" placeholder="First Name"
											required="required" />
										<form:label class="form-label sr-only" path="userFirstName">First name</form:label>
										<form:errors class="d-flex justify-content-start text-warning"
											path="userFirstName" />
									</div>
								</div>
								<div class="col-md-6 mb-4">
									<div class="form-outline">
										<form:input type="text" path="userLastName"
											class="form-control" placeholder="Last Name"
											required="required" />
										<label class="form-label sr-only" path="userLastName">Last
											name</label>
										<form:errors class="d-flex justify-content-start text-warning"
											path="userLastName" />
									</div>
								</div>
							</div>

							<!-- Username input -->
							<div class="form-outline mb-4">
								<form:input type="text" path="username" class="form-control"
									placeholder="Username" required="required" />
								<form:label class="form-label sr-only" path="username">Username</form:label>
								<form:errors class="d-flex justify-content-start text-warning"
									path="username" />
							</div>

							<!-- Password input -->
							<div class="form-outline mb-4">
								<form:input type="password" path="user_password"
									class="form-control" placeholder="Password" required="required" />
								<form:label class="form-label sr-only" path="user_password">Password</form:label>
								<form:errors class="d-flex justify-content-start text-warning"
									path="user_password" />
							</div>

							<!-- Submit button -->
							<button type="submit" class="btn btn-primary btn-block mb-4">
								Sign up</button>
						</form:form>

					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<%@include file="commons/footer.jspf"%>
<%@include file="commons/end.jspf"%>