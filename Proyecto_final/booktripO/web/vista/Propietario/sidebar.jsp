 <!-- Sidebar -->
 <ul class="navbar-nav bg-gradient-primary sidebar sidebar-dark accordion" id="accordionSidebar">

     <!-- Sidebar - Brand -->
     <a class="sidebar-brand d-flex align-items-center justify-content-center" href="index1.php">
         <div class="sidebar-brand-icon rotate-n-15">
             <i class="fas fa-laugh-wink"></i>
         </div>
         <div class="sidebar-brand-text mx-3">Booktrip Places</div>
     </a>

     <!-- Divider -->
     <hr class="sidebar-divider my-0">

     <!-- Nav Item - Dashboard -->
     <li class="nav-item active">
         <a class="nav-link" href="index1.php">
             <i class="fas fa-fw fa-tachometer-alt"></i>
             <span>Propietario</span></a>
     </li>

     <!-- Divider -->
     <hr class="sidebar-divider">

     <!-- Heading -->
     <div class="sidebar-heading">
         Interface
     </div>

    
     <!-- Inmueble -->
     <li class="nav-item">
         <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseUtilities" aria-expanded="true" aria-controls="collapseUtilities">
             <i class="fa fa-building"></i>
             <span>Inmuebles</span>
         </a>
         <div id="collapseUtilities" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
             <div class="bg-white py-2 collapse-inner rounded">
                 <h6 class="collapse-header">Opciones</h6>
                 <a class="collapse-item" href="../Propietario/indexListaInmueble.jsp">Lista de inmuebles</a>
                
                
                
             </div>
         </div>
     </li>

     <li class="nav-item">
         <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseLugares" aria-expanded="true" aria-controls="collapseUtilities">
             <i class="fa fa-map-marked-alt"></i>
             <span>Lugares</span>
         </a>
         <div id="collapseLugares" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
             <div class="bg-white py-2 collapse-inner rounded">
                 <h6 class="collapse-header">Opciones</h6>
                 <a class="collapse-item" href="../Propietario/indexListaActividad.jsp">Actividades</a>
             </div>
         </div>
     </li>
    <!--  <li class="nav-item">
         <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseReserva" aria-expanded="true" aria-controls="collapseUtilities">
             <i class="fa fa-book"></i>
           <span>Reservas</span>
         </a>
         <div id="collapseReserva" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
             <div class="bg-white py-2 collapse-inner rounded">
                 <h6 class="collapse-header">Opciones</h6>
                 <a class="collapse-item" href="../Viajero/indexListaReserva.jsp">Lista de reservas</a>
                 <a class="collapse-item" href="../Viajero/indexListaPago.jsp">Pagos</a>
                 

             </div>
         </div>
         -->
     </li>
     <li class="nav-item">
         <a class="nav-link collapsed" href="#" data-toggle="collapse" data-target="#collapseInfo" aria-expanded="true" aria-controls="collapseUtilities">
             <i class="fa fa-city"></i>
             <span>Info propiedades</span>
         </a>
         <div id="collapseInfo" class="collapse" aria-labelledby="headingUtilities" data-parent="#accordionSidebar">
             <div class="bg-white py-2 collapse-inner rounded">
                 <h6 class="collapse-header">Opciones</h6>
                 <a class="collapse-item" href="../Propietario/indexListaServicio.jsp">Servicios</a>
             <!--    <a class="collapse-item" href="../Dashboard/indexListaPuntuacion.jsp">Puntuaciones</a>-->
                 

             </div>
         </div>
     </li>


     <!-- Divider -->
     <hr class="sidebar-divider">



     <!-- Sidebar Toggler (Sidebar) -->
     <div class="text-center d-none d-md-inline">
         <button class="rounded-circle border-0" id="sidebarToggle"></button>
     </div>

 </ul>