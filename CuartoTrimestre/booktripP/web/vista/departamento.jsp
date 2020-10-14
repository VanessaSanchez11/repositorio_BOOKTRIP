<%-- 
    Document   : Solicitud_Inmueble
    Created on : 14/06/2020, 07:11:23 AM
    Author     : 57321
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Departamentos-booktrip</title>

        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilosRegister.css">
        <link href="https://fonts.googleapis.com/css2?family=PT+Serif:ital,wght@1,700&display=swap" rel="stylesheet">
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>

    </head>
    <body>
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
                                    <h1 class="h4 text-gray-900 mb-4">REGISTRA EL DEPARTAMENTO</h1>
                                </div>
                                <form class="user" action="/booktripM/registroUsuario" method="post">
                                    <div class="form-group row cajaCombobox">

                                        <label class="label">SELECIONA EL DEPARTAMENTO</label>
                                        <select name="idDepartamento">
                                            <option>ELIGE UNA OPCION</option>
                                            <option>Cundinamarca</option>
                                            <option value="2">Tolima</option>
                                            <option value="8">Boyaca</option> 
                                            <option value="3">Guajira</option> 
                                            <option value="4">Meta</option> 
                                            <option value="7">Caldas</option> 
                                            <option value="11">Antioquia</option>
                                    </div>                   


                                    <input type="submit" class="btn btn-primary btn-user btn-block" value="Registrar">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>










    </body>
</html>
