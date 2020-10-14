<%-- 
    Document   : formEjemplo
    Created on : 19/08/2020, 12:06:12 PM
    Author     : vanessa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>lISTA VANESSA!</h1>

        
        

        <div class="formulario">

            <form action="ejemplos" method="post">
                <label for="">Usuario</label>
                <input type="text" name="usuario" >   
                <label for="">Password</label>                      
                <input type="text" name="pass"> 
                <input type="submit" value="Iniciar sesion">
            </form> 


        </div>


    </body>
</html>