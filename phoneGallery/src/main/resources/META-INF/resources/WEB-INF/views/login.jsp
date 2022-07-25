<%@include file="commons/head.jspf" %>

<div class="container">
        <div class="container px-4 py-5 px-md-5 text-center text-lg-start my-5">
            <div class="row gx-lg-5 align-items-center mb-5">
              <div class="col-lg-6 mb-5 mb-lg-0" style="z-index: 10">
                <h1 class="my-5 display-5 fw-bold ls-tight text-left" style="color: #ad2831">
                  Welcome back<br />
                  <span style="color: #ad283198">login to continue</span>
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
                    <form class="form-signin" method="post">
                      <!-- Email input -->
                      <div class="form-outline mb-4">
                        <input type="text" id="username" name="username" class="form-control"
									placeholder="Username" required="required" />
                        <label class="form-label sr-only" for="username">Username</label> 
							</div>
        
                      <!-- Password input -->
                      <div class="form-outline mb-4">
                        <input type="password" id="password" class="form-control" name="password"
                         placeholder="Password" required="required"/>
                        <label class="form-label sr-only" for="password">Password</label>
                      </div>
        
                      <!-- Submit button -->
                      <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>  
                      <button type="submit" class="btn btn-primary btn-block mb-4">Sign in</button>
                    </form>
                    <div class="row">
                        <div class="col">
                            <a class="d-flex justify-content-start" href="#">Forgot Password</a>
                        </div>
                        <div class="col">
                            <a href="/signup" class="d-flex justify-content-end">
                                Create new account
                            </a>
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