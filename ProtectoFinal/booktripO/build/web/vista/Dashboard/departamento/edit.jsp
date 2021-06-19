
<
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/estilosBooktrip.css">
     <link rel="stylesheet" href="css/estiloValidacion.css">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <title>Actulizar departamento</title>
  </head>
  <body style="background-image: linear-gradient(180deg, #ade5ff 0, #7dcefb 25%, #3cb5f2 50%, #009ce9 75%, #0085e0 100%);">
      <div class="principal">
 
<center>
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar departamento</h3>
        <hr>
        <br>
        <form action="/booktripO/controllerDepartamento" method="POST"  onsubmit="return validarDepartamento()" >
            <label>Nombres:</label>
            <input type="text" name="txtNombre" value="${dato.getNombre()}">
           
            <input type="hidden" name="id" value="${dato.getIdDepartamento()}">
          
            <div col-md-6>
                <div col-md-3><input type="submit" name="accion" value="Actualizar"  class="btn btn-success btn-block mt-1" onclick="VolverAEstados()" ></div>
                    <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4" onclick="VolverAEstados()" ></div>
                </div>
        </form>
     </center>
            </div>
            </div>

     </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>

  </body>
</html>