<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Register-booktrip</title>

        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilosRegister.css">
        <link href="https://fonts.googleapis.com/css2?family=PT+Serif:ital,wght@1,700&display=swap" rel="stylesheet">
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>

    </head>

    <body class="bg-gradient-primary">

        <div class="container">
            <h1 class="row justify-content-center tituloBooktrip">Booktrip</h1>
            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                        <div class="col-lg-7">
                            <div class="p-5">

                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Crea una cuenta!</h1>
                                </div>
                                <form class="user" action="/booktripP/register" method="post">
                                    <div class="form-group row cajaCombobox">
                                        <div class="col-sm-6 mb-3 mb-sm-0">

                                            <select class="form-control select" name="idTipoDocumento" id="idTipoDocumento">
                                                <option selected value="1">Cedula</option>
                                                <option value="2">Tarjeta de identidad</option>
                                                <option value="3">Cedula de extranjeria</option>
                                            </select>
                                        </div>                   

                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <select class="form-control" name="idRol" id="idRol" >
                                                <option selected value="2">Viajero</option>
                                                <option value="1">Propietario</option>
                                                <option value="3">Administrador</option>
                                            </select>
                                        </div>
                                    </div>




                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control " id="" placeholder="Nombre" name="nombre" id="idNombre">
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control " id="" placeholder="Apellidos" name="apellido" id="idApellido">
                                        </div>
                                    </div>

                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control " id="" placeholder="Direccion" name="direccion" id="idDireccion">
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control " id="" placeholder="Telefono" name="telefono" id="idTelefono">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control " id="" placeholder="Email" name="email" id="idEmail">
                                    </div>

                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control " id="" placeholder="Fecha de nacimiento" name="fechaN" id="idFechaN">
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control " id="" placeholder="Contraseña" name="password" id="idPassword">
                                        </div>
                                    </div>
                                    <input type="submit" class="btn btn-primary btn-user btn-block" value="Registrar">
                                </form>
                                <hr>
                                <div class="text-center">
                                    <a class="small" href="#">Olvidaste tu contraseña?</a>
                                </div>
                                <div class="text-center">
                                    <a class="small" href="login.jsp">Ya tienes una cuenta Login!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>



    </body>

</html>