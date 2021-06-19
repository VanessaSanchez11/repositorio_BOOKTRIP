<div id="content-wrapper" class="d-flex flex-column">

            <!-- Main Content -->
            <div id="content">

                <!-- Topbar -->
                <nav class="navbar navbar-expand navbar-light bg-secondary topbar mb-4 static-top shadow">

                    <!-- Sidebar Toggle (Topbar) -->
                    <button id="sidebarToggleTop" class="btn btn-link d-md-none rounded-circle mr-3">
            <i class="fa fa-bars"></i>
          </button>

                    <!-- Topbar Search -->
                  
<div class="input-group">
                           
                            <div class="input-group-append">
                                
                                <a href="../seleccionarRol.jsp" style="font-family: Arial, Helvetica, Sans-serif;
  color: whitesmoke;
  font-size: 20px; 
  text-decoration: none;"> Ir a roles <button class="btn btn-primary" type="button">
                  <i class="fas fa-sign-out-alt fa-sm"></i>
                  
                </button></a>
                            </div>
                        </div>
                    <!-- Topbar Navbar -->
                    <ul class="navbar-nav ml-auto">

                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->
                        <li class="nav-item dropdown no-arrow d-sm-none">
                            <a class="nav-link dropdown-toggle" href="#" id="searchDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <i class="fas fa-search fa-fw"></i>
                            </a>
                            <!-- Dropdown - Messages -->
                            <div class="dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in" aria-labelledby="searchDropdown">
                                <form class="form-inline mr-auto w-100 navbar-search">
                                    <div class="input-group">
                                        <input type="text" class="form-control bg-light border-0 small" placeholder="Search for..." aria-label="Search" aria-describedby="basic-addon2">
                                        <div class="input-group-append">
                                            <button class="btn btn-primary" type="button">
                        <i class="fas fa-search fa-sm"></i>
                      </button>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </li>
                       
<!--<div class="input-group">
                           
                            <div class="input-group-append">
                                
                          <a href="../salir.jsp" style="font-family: Arial, Helvetica, Sans-serif;
                             margin-top: 15px;
                             border-radius: 7%;
  color: whitesmoke;
  font-size: 18px; 
  text-decoration: none;">      <input type="submit" value="Cerrar sesión" class="btn-primary">
               <!--   <i class="fas fa-sign-out-alt fa-sm"></i>-->
                   <!-- </a>
                            </div>
    
                        </div>
                        <div class="topbar-divider d-none d-sm-block"></div>-->

                       
                                    <!-- <li class="nav-item dropdown no-arrow">
                            <a class="nav-link dropdown-toggle" href="#" id="userDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <span class="mr-2 d-none d-lg-inline text-white-600 medium"></span>
                                <img class="img-profile rounded-circle" src="https://source.unsplash.com/QAB-WJcbgJk/60x60">
                            </a>
                            <!-- Dropdown - User Information -->
                            <!--   <div class="dropdown-menu dropdown-menu-right shadow animated--grow-in" aria-labelledby="userDropdown">
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-user fa-sm fa-fw mr-2 text-gray-400"></i> Perfil
                                </a>
                                <a class="dropdown-item" href="#">
                                    <i class="fas fa-cogs fa-sm fa-fw mr-2 text-gray-400"></i> Configuracion
                                </a>
                                
                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#" data-toggle="modal" data-target="#logoutModal">
                                    <i class="fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400"></i> Cerrar sesion
                                </a>
                            </div>
                        </li>-->

                    </ul>
                    
                    
<div class="dropdown mr-5" >
  <button class="btn btn-primary dropdown-toggle" type="button" id="dropdownMenuButton2" data-bs-toggle="dropdown" aria-expanded="false">
${nombre} ${apellido}
  </button>
  <ul class="dropdown-menu text-center dropdown-menu-dark float-md-right" aria-labelledby="dropdownMenuButton2">
              <li><a class="dropdown-item-text active" href="#">
                      <img src="../imagenes/logo.png" alt="100" width="100"/>
        
          </a></li>
         


    <li><a class="dropdown-item" href="#">${email} </a></li>
    <li><hr class="dropdown-divider"></li>
    <li><a class="dropdown-item" href="../salir.jsp" onclick="return confirm('¿Está seguro que desea cerrar la sesión?');">Salir</a></li>
  </ul>
</div>
           
                </nav>