<%-- 
    Document   : Solicitud_Inmueble
    Created on : 14/06/2020, 07:11:23 AM
    Author     : 57321
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Solicitud inmueble</title>
        <link rel="stylesheet"  href="css/galeria.css">
    </head>
    <body>
        <div>
            <div id="pie">
                
                  <img src="imagenes/logo.JPG"> 
                                                                

        </div>
           
            <div id="formulario">
                <p id="titulo">SOLICITA TU INMUEBLE</p>
                <br>
                <br>
                <br>
                <p id="tabla">USUARIO <input id="aja" type="text" name="nombrecompleto" size="15" maxlength="15"  placeholder="usuario" </p>  
                <br>
                <p id="tabla">CONTRASEÑA <input id="aja" type="password" name="nombrecompleto" size="15" maxlength="15"  placeholder="hola...."</p> <br>
                <p id="tabla">NOMBRE DE LA PROPIEDAD <input id="aja" type="text" name="nombrecompleto" size="15" maxlength="15"  placeholder="Santa Barbara"><br>
                <p id="tabla">UBICACION <select><
                  
                  <option>Zipaquira</option>
                  <option>Fusagasuga</option>
                  <option>La calera</option> 
                  <option>Melgar</option> 
                  <option>Girardo</option> 
                  <option>Sasaima</option> 
                  
                      </select></p>
                   
                      <br>
                      
                      
                 <p id="tabla">COD_INMUEBLE<input id="aja" type="text" name="nombrecompleto" size="15" maxlength="15" </p>       
                  
                 <input id="boton" type="submit" value="SOLICITAR">
                 
                  
                
            </div>
            <br>
            <br>
            
    </body>
</html>
