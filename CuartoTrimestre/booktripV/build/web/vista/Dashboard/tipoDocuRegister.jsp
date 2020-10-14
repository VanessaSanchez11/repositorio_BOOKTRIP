<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
        <!-- <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de usuarios</a>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm"> Consultar usuario</a>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar usuario</a>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"> Eliminar usuario  </a> -->
    </div>
    <div class="d-sm-flex align-items-center justify-content-between mb-4">

        <a href="indexListaTipoDocu.jsp" class="d-none d-sm-inline-block btn  btn-success shadow-sm"> Lista de tipo de documentos</a>
        
        

    </div>


    
    <div class="contenedor">

        <h1 class="tituloRol">Registrar tipo de documentos</h1>
        <hr>
        <form action="/booktripV/registerTipoD" id="form" class="formu" method="post" onsubmit=" return checkInputsNombre();">
        <label for="tipoD">Nombre del tipo de documentos</label>
            <div class="form-group col-sm-5">
                <input type="text" class="form-control" id="idNombre" placeholder="" name="nombre">
                <small>Error message</small>
                <br>
                <button type="submit" class="btn btn-primary btn-sm botonRegistro">Registrar</button>
            </div>
           
        </<form>

    </div>


</div>

