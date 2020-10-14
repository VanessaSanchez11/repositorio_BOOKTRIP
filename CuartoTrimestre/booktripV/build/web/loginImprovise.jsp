<%-- 
    Document   : loginImprovise
    Created on : 20/08/2020, 10:01:54 PM
    Author     : vanessa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

        <title>JSP Page</title>
    </head>
    <body class="bg-dark">
        <br>
        
        <div class="container bg-light m-auto p-4" style="width: 1000px">
            <h1 style="text-align: center" class="text-dark">Login </h1>
        
        <form class="user" action="login" method="post">
            <div class="form-group m-4">
                <input type="email" class="form-control form-control-user" name="email" id="exampleInputEmail" aria-describedby="emailHelp" placeholder="Email">
            </div>
            <div class="form-group m-4">
                <input type="password" class="form-control form-control-user" name="password" id="exampleInputPassword" placeholder="Contraseña">
            </div>
            <input type="submit" class="btn btn-primary btn-user btn-block m-auto" value="Login" style="width: 30%">
            <!-- <a href="index.html" class="btn btn-primary btn-user btn-block"> Login </a>-->
            <hr>

        </form>
            </div>
    </body>
</html>
