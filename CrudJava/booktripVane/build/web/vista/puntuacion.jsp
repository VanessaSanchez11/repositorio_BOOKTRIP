<%-- 
    Document   : puntuacion
    Created on : 12/06/2020, 02:20:24 PM
    Author     : oscar sanabria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Puntuacion</title>
         <link rel="stylesheet" type="text/css" href="css/puntuacion_estilo.css">
    </head>
    <body>
<div class="cajita">
            <center>
                <img src="imagenes/logo.png">
                <br>

                <center>
        <div class="formulario">

            <h1>Puntuación</h1><br>


            <form action="#" method="">
                <p class="letra"> Codigo Puntuación:<input type="number" name="codigo puntuación" placeholder="codigo putuacion" ></p>
                <br>
                <p class="letra"> Calificación:<select name="transporte">

<option value="1">Buena</option>

<option value="2">Regular</option>

<option value="3">Mala</option>

</select></p>
<br>
                <p class="letra"> Descrición:<textarea name="descripcion" placeholder="descripcion"></textarea></p>
                <p class="letra">Codigo Inmueble:<input type="number" name="codigo inmueble" placeholder="codigo inmueble" ></p>
                <p class="letra">Codigo Usuario:<input type="number" name="codigo usuario" placeholder="codigo usuario" ></p>
                 
                   <br>
                    <p class="btn"> <a href="#">Guardar Actividad</a></p>
                  <br>
                    <p class="btn2"> <a href="#">Cancelar</a></p>
                 <br>
            </form>
                 </div>
            </center>



        </div>


    </body>
</html>
