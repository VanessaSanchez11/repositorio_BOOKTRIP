<%-- 
    Document   : registroImprovise
    Created on : 23/08/2020, 09:59:42 AM
    Author     : vanessa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
   <body class="bg-dark">

    <div class="container">
        <h1 class="row justify-content-center text-white">Booktrip</h1>
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
                            <form class="user">
                                <div class="form-group row cajaCombobox">
                                    <div class="col-sm-6 mb-3 mb-sm-0 ">
                                        <select class="form-control  ">
                                            <option selected>Viajero</option>
                                            <option>Propietario</option>
                                            <option>Administrador</option>
                                      </select>
                                    </div>
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <select class="form-control select">
                                            <option selected>Cedula</option>
                                            <option>Tarjeta de identidad</option>
                                            <option>Cedula de extranjeria</option>
                                      </select>
                                    </div>
                                </div>
                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control " id="" placeholder="Nombre">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control " id="" placeholder="Apellidos">
                                    </div>
                                </div>

                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control " id="" placeholder="Direccion">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="text" class="form-control " id="" placeholder="Telefono">
                                    </div>
                                </div>
                                <div class="form-group">
                                    <input type="email" class="form-control " id="" placeholder="Email">
                                </div>

                                <div class="form-group row">
                                    <div class="col-sm-6 mb-3 mb-sm-0">
                                        <input type="text" class="form-control " id="" placeholder="Fecha de nacimiento">
                                    </div>
                                    <div class="col-sm-6">
                                        <input type="password" class="form-control " id="" placeholder="Contraseña">
                                    </div>
                                </div>
                                <a href="#" class="btn btn-primary btn-user btn-block"> Registrar</a>
                            </form>
                            <hr>
                            <div class="text-center">
                                <a class="small" href="#">Olvidaste tu contraseña?</a>
                            </div>
                            <div class="text-center">
                                <a class="small" href="login.jsp">Ya tienes una cuenta? Login!</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>



</body>
</html>
