
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="vista/bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" type="text/css" href="vista/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" type="text/css" href="vista/css/estilos.css">
        <link rel="stylesheet" type="text/css" href="vista/css/tipoinmueble_estilo.css">
        <title>Tipo de inmueble</title>
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
                        <strong>Tipo de inmueble</strong>
                    </h5>
                    <form action="">

                        <center>
                            <label for="idTipo"><b>Codigo tipo de inmueble</b></label>
                            <input type="text" id="idTipo" class="form-control" placeholder="El sistema asigna automaticamente el codigo"><br>
                            <label for="nombre"><b>Tipo de inmueble</b></label><br>
                            <input type="text" id="nombre" class="form-control" placeholder="ingresa el tipo de inmueble"><br>

                            <button class="btn btn-primary btn-block" type="submit">Guardar tipo de inmueble</button>
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
