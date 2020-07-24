<%-- 
    Document   : estado
    Created on : 20/06/2020, 01:25:25 PM
    Author     : oscar sanabria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="vista/css/bootstrap-grid.min.css">
        <link rel="stylesheet" type="text/css" href="vista/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="vista/css/estilo.css">
        <link rel="stylesheet" type="text/css" href="vista/css/estado_estilo.css">
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
                        <strong>Estados</strong>
                    </h5>



                    <form action="">


                        <center>
                            <label for="idActividad"><b>Codigo estado</b></label>
                            <input type="text" id="idActividad" class="form-control" placeholder="El sistema asigna automaticamente el codigo">
                            <label for="idEstado"><b>Departamento</b></label>
                            <select class="browser-default custom-select mb-4" id="idEstado">
                                <option value="" disabled="" selected="">Selecione el estado</option>
                                <option value="1">x</option>
                                <option value="2">x</option>
                                <option value="3">x</option>
                            </select>  

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

