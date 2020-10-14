<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>


    </div>
    <div class="d-sm-flex align-items-center justify-content-between mb-4">

        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de estados</a>
        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm"> Consultar estados</a>


    </div>
</div>
<center>
<div class="principal">



    <div class="card">




        <form action="">

            <label for="nombre"><b>Ingrese un nuevo estado</b></label><br>
            <input type="text" id="idSolicitud" class="form-control" placeholder=""><br>
            <button class="btn btn-primary btn-block" type="submit">Registrar estado</button>
            <br>
            <button class="btn btn-danger btn-block" type="submit">Cancelar</button>

        </form>

    </div>
    <br>
    <h5>
        <strong>Estados</strong>
    </h5>

    <table class="table-striped" border="1px" with="200px">



        <tr>

            <td>Disponible</td>

            <td><button class="btn btn-warning btn-block" type="submit">Editar</button></td>

            <td><button class="btn btn-danger btn-block" type="submit">Eliminar</button></td>

        </tr>
        <tr>

            <td>No disponible</td>

            <td><button class="btn btn-warning btn-block" type="submit">Editar</button></td>

            <td><button class="btn btn-danger btn-block" type="submit">Eliminar</button></td>

        </tr>

        <tr>

            <td>Reservada</td>

            <td><button class="btn btn-warning btn-block" type="submit">Editar</button></td>

            <td><button class="btn btn-danger btn-block" type="submit">Eliminar</button></td>

        </tr>

        <tr>

            <td>No reservada</td>

            <td><button class="btn btn-warning btn-block" type="submit">Editar</button></td>

            <td><button class="btn btn-danger btn-block" type="submit">Eliminar</button></td>

        </tr>


    </table>
</div>  


</center>



