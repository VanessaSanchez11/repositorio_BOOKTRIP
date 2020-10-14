
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="css/estilosUsuarios.css">
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="bootstrap/js/bootstrap.bundle.min.js"></script>

    <title>Registro usuarios</title>
</head>

<body>
    <h1>Registro de usuarios</h1>
    <div class="formulario">
        <form action="" method="">
            <div class="row">
                <div class="col">
                    <label for="">Nombre</label>
                    <input type="text" class="form-control" placeholder="Nombre">
                </div>
                <div class="col">
                    <label for="">Apellidos</label>
                    <input type="text" class="form-control" placeholder="Apellidos">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col">
                    <label for="inputState">Rol</label>
                    <select id="inputState" class="form-control">
                  <option selected>Viajero</option>
                  <option>Propietario</option>
                  <option>Administrador</option>
                </select>
                </div>
                <div class="col">
                    <label for="inputState">Tipo de documento</label>
                    <select id="inputState" class="form-control">
                      <option selected>Cedula</option>
                      <option>Tarjeta de identidad</option>
                      <option>Cedula de extranjeria</option>
                    </select>
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col">
                    <label for="">Direccion</label>
                    <input type="text" class="form-control" placeholder="Direccion">
                </div>
                <div class="col">
                    <label for="">Telefono</label>
                    <input type="text" class="form-control" placeholder="Telefono">
                </div>
            </div>
            <br>
            <div class="row">

                <div class="col">
                    <label for="">Fecha de nacimiento</label>
                    <input type="text" class="form-control" placeholder="Fecha de nacimiento">
                </div>
            </div>
            <br>
            <div class="row">
                <div class="col">
                    <label for="">Email</label>
                    <input type="text" class="form-control" placeholder="Email">
                </div>
                <div class="col">
                    <label for="">Contraseña</label>
                    <input type="text" class="form-control" placeholder="Contraseña">
                </div>
            </div>
            <input type="submit" class="btn btn-primary boton" value="Crear" onclick="envio();">
        </form>

    </div>
    
    
    
    <script src="js/script.js"></script>
</body>

</html>