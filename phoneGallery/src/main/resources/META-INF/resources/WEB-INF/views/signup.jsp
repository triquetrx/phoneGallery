<%@include file="commons/head.jspf" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="container">
        <div class="container px-4 py-5 px-md-5 text-center text-lg-start my-5">
            <div class="row gx-lg-5 align-items-center mb-5">
              <div class="col-lg-6 mb-5 mb-lg-0" style="z-index: 10">
                <h1 class="my-5 display-5 fw-bold ls-tight text-left" style="color: #ad2831">
                  The best offer <br />
                  <span style="color: #ad283198">for your next device</span>
                </h1>
                <p class="mb-4 text-left" style="color: #0D0A0B">
                  Lorem ipsum dolor, sit amet consectetur adipisicing elit.
                  Temporibus, expedita iusto veniam atque, magni tempora mollitia
                  dolorum consequatur nulla, neque debitis eos reprehenderit quasi
                  ab ipsum nisi dolorem modi. Quos?
                </p>
              </div>
        
              <div class="col-lg-6 mb-5 mb-lg-0 position-relative">
                <div id="radius-shape-1" class="position-absolute rounded-circle shadow-5-strong"></div>
                <div id="radius-shape-2" class="position-absolute shadow-5-strong"></div>
        
                <div class="card bg-glass">
                  <div class="card-body px-4 py-5 px-md-5">
                    <form:form method="post" modelAttribute="newUser">
                      <!-- 2 column grid layout with text inputs for the first and last names -->
                      <div class="row">
                        <div class="col-md-6 mb-4">
                          <div class="form-outline">
                            <form:input type="text" path="userFirstName" class="form-control" placeholder="First Name" required="required"/>
                            <form:label class="form-label sr-only" path="userFirstName">First name</form:label>
                            <form:errors class="d-flex justify-content-start text-warning" path="userFirstName"/>
                          </div>
                        </div>
                        <div class="col-md-6 mb-4">
                          <div class="form-outline">
                            <form:input type="text" path="userLastName" class="form-control"
                             placeholder="Last Name" required="required"/>
                            <label class="form-label sr-only" path="userLastName">Last name</label>
                            <form:errors class="d-flex justify-content-start text-warning" path="userLastName"/>
                          </div>
                        </div>
                      </div>
        
                      <!-- Username input -->
                      <div class="form-outline mb-4">
                        <form:input type="text" path="username" class="form-control" placeholder="Username" required="required"/>
                        <form:label class="form-label sr-only" path="username">Username</form:label>
                        <form:errors class="d-flex justify-content-start text-warning" path="username"/>
                      </div>
        
                      <!-- Password input -->
                      <div class="form-outline mb-4">
                        <form:input type="password" path="user_password" class="form-control" placeholder="Password" required="required"/>
                        <form:label class="form-label sr-only" path="user_password">Password</form:label>
                        <form:errors class="d-flex justify-content-start text-warning" path="user_password"/>
                      </div>
        
                      <!-- Submit button -->
                      <button type="submit" class="btn btn-primary btn-block mb-4">
                        Sign up
                      </button>
                    </form:form>
                    <div class="row">
                    	<div class="col"></div>
                    	<div class="col d-flex justify-content-end">
                    		<a href="/login">Login instead</a>
                    	</div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </div>
    </div>
</body>
</html>