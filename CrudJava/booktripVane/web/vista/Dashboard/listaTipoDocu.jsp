<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
        <!-- <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de usuarios</a>
    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm"> Consultar usuario</a>
    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar usuario</a>
    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"> Eliminar usuario</a> -->

    </div>
    <div class=" justify-content-end align-items-center justify-content-between mb-4">
        <a href="indexListaTipoDocu.jsp" class="d-none d-sm-inline-block btn  btn-primary shadow-sm btnListaRol"> Lista de documentos</a>
        <a href="indexTipoDocuRegister.jsp" class="d-none d-sm-inline-block btn btn-success shadow-sm"> Crear tipo de documento</a>

    </div>


    <div class="contenedor">

        <h1>Lista</h1>

        <div class="card shadow mb-4">
            <div class="card-header py-3">
                <h6 class="m-0 font-weight-bold text-primary">Lista de tipo de documentos Booktrip</h6>
            </div>
            <div class="card-body">
                <div class="table-responsive">
                    <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead>
                            <tr>
                                <th>Id</th>
                                <th>Nombre del tipo docu</th>
                                <th>Actualizar tipo docu</th>
                                <th>Eliminar tipo docu</th>

                            </tr>
                        </thead>
                        <tfoot>
                            <tr>
                                <th>Id</th>
                                <th>Nombre tipo docu</th>
                            </tr>
                        </tfoot>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>Cedula</td>
                                <td><a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar </a></td>
                                <td><a href="#" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"> Eliminar </a></td>
                            </tr>

                            <tr>
                                <td>2</td>
                                <td>Tarjeta de identidad</td>
                                <td><a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar </a></td>
                                <td><a href="#" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"> Eliminar </a></td>
                            </tr>

                            <tr>
                                <td>3</td>
                                <td>Cedula de extranjeria</td>
                                <td><a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar</a></td>
                                <td><a href="#" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"> Eliminar </a></td>
                            </tr>

                        </tbody>
                    </table>
                </div>
            </div>
        </div>


    </div>


</div>