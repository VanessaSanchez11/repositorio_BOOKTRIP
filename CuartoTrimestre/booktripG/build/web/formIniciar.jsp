<%-- 
    Document   : formIniciar
    Created on : 22/08/2020, 03:12:03 PM
    Author     : Giovanny
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <title>Booktrip</title>
    </head>
    <body>
        <form class="user" action="/login" method="post">
            <div class="form-group">
                <input type="usuario" class="form-control form-control-user" name="usuario" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Email">
            </div>
            <div class="form-group">
                <input type="password" class="form-control form-control-user" name="pass" id="exampleInputPassword" placeholder="Contraseña">
            </div>

          <input type="submit" class="btn btn-primary btn-user btn-block m-auto" value="Login" style="width: 30%">
            <hr>

        </form>
    </body>
</html>
