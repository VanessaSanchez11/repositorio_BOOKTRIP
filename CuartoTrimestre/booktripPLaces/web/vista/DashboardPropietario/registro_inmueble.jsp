<%-- 
    Document   : registro_inmueble
    Created on : 24/07/2020, 11:31:24 AM
    Author     : oscar sanabria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar inmueble</title>
        <link href="vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
    <!-- Custom styles for this template-->
    <link href="css/sb-admin-2.min.css" rel="stylesheet">
    <!-- estilos de los estados-->
    <link rel="stylesheet" type="text/css" href="css/registro_inmueble.css">
     
    </head>
    <body>
         <center>
             <div  class="pagina">
       <div class="content">
    
<div class="cabecera">
            <center>
            <img src="img/logo.png">
            </center>
        </div>

        <div class="col-xs-12 container-xl principal_1 noPad">
                             

                <div class="card">

                    <h5 class="card-header info-color dark-text text-center py-4">
                        <strong>Registrar inmueble</strong>
                    </h5>



                    <form action="#">
                        
                        <div class="register_1 column col-xs-12">
                        <label for="idTipo"><b>Tipo inmueble</b></label>
                        <select class="browser-default custom-select mb-4" id="idTipo">
                            <option value="" disabled="" selected="">Selecione el tipo de inmueble</option>
                            <option value="1">x</option>
                            <option value="2">x</option>
                            <option value="3">x</option>
                        </select>
                        <label for="idDepartamento"><b>Departamento</b></label>
                        <select class="browser-default custom-select mb-4" id="idDepartamento">
                            <option value="" disabled="" selected="">Selecione el departamento</option>
                            <option value="1">x</option>
                            <option value="2">x</option>
                            <option value="3">x</option>
                        </select>
                        <label for="idUsuario"><b>Usuario</b></label>
                        <select class="browser-default custom-select mb-4" id="idUsuario">
                            <option value="" disabled="" selected="">ingrese su usuario</option>
                            <option value="1">x</option>
                            <option value="2">x</option>
                            <option value="3">x</option>
                        </select>
                        
                        <label for="idEstado"><b>Estado de la propiedad</b></label>
                        <select class="browser-default custom-select mb-4" id="idEstado">
                            <option value="" disabled="" selected="">Selecione el estado de la propiedad</option>
                            <option value="1">x</option>
                            <option value="2">x</option>
                            <option value="3">x</option>
                        </select>
                              </div>
                         <div class="register_2 column col-xs-12">
                     
                        <label for="nombre"><b>Nombre inmueble</b></label>
                        <input type="text" id="nombre" class="form-control" placeholder=""><br>
                        
                        <label for="direccion"><b>Direccion</b></label>
                        <input type="text" id="direccion" class="form-control" placeholder=""><br>
                        
                        <label for="capacidad"><b>Capacidad</b></label>
                        <input type="number" id="capacidad" class="form-control" autofocus required maxlength="6" size="6"><br>
                        <div class="form-group">
                            <label for="descripcion"><b>Descripción</b></label>
                            <textarea class="form-control" id="descripcion" rows="3"></textarea>
                        </div>
                         </div>
                        <center>


                            <button class="btn btn-primary btn-block" type="submit">Registrar inmueble</button>
                            <br>
                            <button class="btn btn-danger btn-block" type="submit">Cancelar</button>
                        </center>
                    </form>

                </div>

            </div>  
           <div class="principal_2"> 
               <img src="img/finca_1.jpg" width="540 px" height="580px">
</div>
        </div>
                 </div>
    </center>
    </body>
</html>
