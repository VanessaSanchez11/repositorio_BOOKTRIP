<!DOCTYPE html>
<html lang="en"> 

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <!-- <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css">
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">-->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <link rel="stylesheet" href="vista/css/style.css">
    <link href="https://fonts.googleapis.com/css2?family=PT+Serif:ital,wght@1,700&display=swap" rel="stylesheet">
    <script src="bootstrap/js/bootstrap.min.js"></script>
    <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
    <title>Booktrip</title>
</head>

<body>
    <header>
        <nav class="navbar navbar-light bg-primary justify-content-between">
            <a href="#"><img src="vista/imagenes/logo.JPG" alt=""></a>
            <h1 class="font-italic m-auto text-uppercase txt-title text-white ">Booktrip</h1>
            <form class="form-inline">
                <a href="vista/Dashboard/usuario/add.jsp" class="btn btn-outline-light mr-sm-4">Registrarse</a>
                <a href="vista/login.jsp" class="btn btn-outline-light mr-sm-4">Iniciar sesi�n</a>
                
            </form>
        </nav>
    </header>
    <div class="container">

        <div class="container">

            <div class="input-group mb-7 mt-5">
                <input type="text" class="form-control" placeholder="Busca tu destino" aria-label="Recipient's username" aria-describedby="basic-addon2">
                <div class="input-group-append">
                    <button class="btn btn-outline-primary" type="button">Buscar</button>
                </div>
            </div>
            <h1 class="font-italic  text-lg-left mt-4 mb-0">Destinos</h1>

            <hr class="mt-2 mb-5">

            <div class="row text-center text-lg-left mb-4">

                <div class="col-lg-4 col-md-4 col-6 mb-3">

                    <img class="img-fluid img-thumbnail" src="vista/imagenes/palmera.jpg" alt="">
                    <h5 class="mt-3 font-weight-bold text-info">San Andres</h5>

                </div>
                <div class="col-lg-4 col-md-4 col-6">

                    <img class="img-fluid img-thumbnail" src="vista/imagenes/desierto.jpg" alt="">
                    <h5 class="mt-3 font-weight-bold text-info">Desierto de la tatacoa</h5>
                </div>
                <div class="col-lg-4 col-md-4 col-6">

                    <img class="img-fluid img-thumbnail" src="vista/imagenes/arbol.jpg" alt="">
                    <h5 class="mt-3 font-weight-bold text-info">Tolima</h5>
                </div>
                <div class="col-lg-4 col-md-4 col-6">

                    <img class="img-fluid img-thumbnail" src="vista/imagenes/agua.jpg" alt="">
                    <h5 class="mt-3 font-weight-bold text-info">Cartagena</h5>
                </div>
                <div class="col-lg-4 col-md-4 col-6">

                    <img class="img-fluid img-thumbnail" src="vista/imagenes/mujer.jpg" alt="">
                    <h5 class="mt-3 font-weight-bold text-info">Santa Marta</h5>
                </div>
                <div class="col-lg-4 col-md-4 col-6">

                    <img class="img-fluid img-thumbnail" src="vista/imagenes/patineta.jpg" alt="">
                    <h5 class="mt-3 font-weight-bold text-info">Medellin</h5>
                </div>


            </div>

        </div>

        <section class="banner">
            <div class="contenedorTexto">
                <h2>BOGOT�</h2>
                <div class="btn">
                    <button type="button" class="btn btn-outline-dark">Ver Lugares</button>
                    <button type="button" class="btn btn-outline-dark">Reservar ahora</button>
                </div>
            </div>
        </section>
        <h1 class="font-weight-bold text-center text-lg-center mt-4 mb-5">Actividades</h1>
        <section class="actividades">

            <div class="card ">
                <img class="card-img-top" src="vista/imagenes/escalar.png" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Escalar</h5>
                    <p class="card-text">Es una pr�ctica deportiva que, en su modalidad cl�sica, consiste en subir o recorrer paredes de roca, laderas escarpadas u otros relieves naturales.</p>
                    <a href="#" class="btn btn-primary">Ir a la actividad</a>
                </div>
            </div>
            <div class="card">
                <img class="card-img-top" src="vista/imagenes/treaking.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Treaking</h5>
                    <p class="card-text">consiste en recorrer a pie largas distancias o zonas determinadas, generalmente de alta monta?a y poco frecuentadas por el turismo convencional.</p>
                    <a href="#" class="btn btn-primary">Ir a la actividad</a>
                </div>
            </div>
            <div class="card">
                <img class="card-img-top" src="vista/imagenes/rafting.jpeg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Rafting</h5>
                    <p class="card-text">Es una actividad deportiva y recreativa que consiste en recorrer el r�o en la direcci�n de la corriente (r�o abajo)</p>
                    <a href="#" class="btn btn-primary">Ir a la actividad</a>
                </div>
            </div>
            <div class="card ">
                <img class="card-img-top" src="vista/imagenes/futbol.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Futbol</h5>
                    <p class="card-text">Podras encontran canchas de futbol 5, futbol 8 y hasta futbol 11 , ideal para grupo de amigos o familia.</p>
                    <a href="#" class="btn btn-primary">Ir a la actividad</a>
                </div>
            </div>
            <div class="card">
                <img class="card-img-top" src="vista/imagenes/evento.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Eventos Especiales</h5>
                    <p class="card-text">Fiestas de 15 , matrimonio,despedida de 11, podra reservarlo para cualquier evento que desee.</p>
                    <a href="#" class="btn btn-primary">Ir a la actividad</a>
                </div>
            </div>
            <div class="card">
                <img class="card-img-top" src="vista/imagenes/billar.jpg" alt="Card image cap">
                <div class="card-body">
                    <h5 class="card-title">Billar</h5>
                    <p class="card-text">Es un deporte de precisi�n que se practica impulsando con un taco un n?mero variable de bolas .</p>
                    <a href="#" class="btn btn-primary">Ir a la actividad</a>
                </div>
            </div>

        </section>

    </div>
    <footer>
        <p>BOOKTRIP</p>
    </footer>

</body>

</html>