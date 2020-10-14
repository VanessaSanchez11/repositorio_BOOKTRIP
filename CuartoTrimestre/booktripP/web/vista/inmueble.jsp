<%-- 
    Document   : inmueble
    Created on : 20/06/2020, 12:59:33 PM
    Author     : oscar sanabria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inmueble</title>
        <link rel="stylesheet" type="text/css" href="vista/css/bootstrap-grid.min.css">
        <link rel="stylesheet" type="text/css" href="vista/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="vista/css/estilo.css">
        <link rel="stylesheet" type="text/css" href="vista/css/inmueble_estilo.css">
    </head>
    <body>
        <div class="principal">
            <div class="cajita">
                <center>
                    <img src="vista/imagenes/logo.png">
                    <br>
                </center>                    

                <div class="card">

                    <h5 class="card-header info-color white-text text-center py-4">
                        <strong>Registrar inmueble</strong>
                    </h5>



                    <form action="#">

                        <label for="idInmueble"><b>codigo inmueble</b></label>
                        <input type="text" id="idInmueble" class="form-control" placeholder="El sistema asigna automáticamente el coódigo">
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
                        <label for="nombre"><b>Nombre inmueble</b></label>
                        <input type="text" id="nombre" class="form-control" placeholder="">
                        
                        <label for="direccion"><b>Direccion</b></label>
                        <input type="text" id="direccion" class="form-control" placeholder="">
                        
                        <label for="capacidad"><b>Capacidad</b></label>
                        <input type="number" id="capacidad" class="form-control" placeholder="">
                        <div class="form-group">
                            <label for="descripcion"><b>Descripción</b></label>
                            <textarea class="form-control" id="descripcion" rows="3"></textarea>
                        </div>
                        <center>


                            <button class="btn btn-success btn-block" type="submit">Registrar inmueble</button>
                            <br>
                            <button class="btn btn-danger btn-block" type="submit">Cancelar</button>
                        </center>
                    </form>

                </div>

            </div>  
        </div>
    </center>

</body>
</html>
