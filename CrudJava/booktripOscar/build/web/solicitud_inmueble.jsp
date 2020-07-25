

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" type="text/css" href="vista/bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" type="text/css" href="vista/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="vista/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="vista/bootstrap/css/estilo.css">
        <link rel="stylesheet" type="text/css" href="vista/css/solicitud_inmueble.css">
       <!-- <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">-->
        
    </head>
    <body>
    <center>
        <div class="principal">
            <div class="cajita">
                <center>
                    <img src="vista/imagenes/logo.png">
                    <br>
                </center>                    

                <div class="card">

                    <h5 class="card-header info-color white-text text-center py-4">
                        <strong>Solicitud inmueble</strong>
                    </h5>



                    <form action="">


                        <center>
                            <label for="idSolicitud"><b>Codigo solicitud</b></label><br>
                            <input type="text" id="idSolicitud" class="form-control" placeholder="El sistema asigna automaticamente el codigo">
                            <br>
                            <label for="idInmueble"><b>Inmueble</b></label><br>
                             <select class="browser-default custom-select mb-4" id="idInmueble">
                                <option value="" disabled="" selected="">Selecione el inmueble</option>
                                <option value="1">x</option>
                                <option value="2">x</option>
                                <option value="3">x</option>
                            </select> <br> 
                          
                            <label for="idUsuario"><b>Usuario</b></label><br>
                              <select class="browser-default custom-select mb-4" id="idUsuario">
                                <option value="" disabled="" selected="">Selecione el usuario</option>
                                <option value="1">x</option>
                                <option value="2">x</option>
                                <option value="3">x</option>
                            </select> <br> 
                            <label for="idEstado"><b>Estado</b></label><br>
                              <select class="browser-default custom-select mb-4" id="idEstado">
                                <option value="" disabled="" selected="">Selecione el estado</option>
                                <option value="1">x</option>
                                <option value="2">x</option>
                                <option value="3">x</option>
                            </select> <br> 
                            <br>
                            <label for="fecha"><b>Fecha</b></label><br>
                            <input type="text" id="fecha" class="form-control" placeholder="el sistema asigna la fecha automáticamente">

                            <button class="btn btn-success btn-block" type="submit">Registrar actividad</button>
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
