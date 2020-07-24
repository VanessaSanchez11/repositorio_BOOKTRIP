

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet"   href="vistas/css/Reserva_estilo.css" />
        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>

        <title>Reservas</title>
    </head>
    <body>
        <div class="contenedor">
            <header>
                <nav>
                    <ul>
                        <li> <a href="#">Inicio</a> </li>
                        <li> <a href="#">Alojamientos</a> </li>
                        <li> <a href="#">Actividades</a> </li>
                        <li> <a href="#">Contactenos</a> </li>
                    </ul>
                </nav>
            </header>

            <section class="main">
                <div class="imagen">
                    <img src="vistas/imagenes/4.jpg"/>
                    <section class="Posts">
                        <article>
                            <h2>BIENVENIDO A BOOKTRIP</h2>
                        </article>
                    </section>
            </section>
            <!-- agregar barra lateral -->
            <aside>
                <div class="modulo">
                    <h3 class="titulo">RESERVE AQUI</h3>

                    <div class="form-check">
                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <label class="input-group-text" for="inputGroupSelect01">Ciudad</label>
                            </div>
                            <select class="custom-select" id="inputGroupSelect01">
                                <option selected>Seleccione</option>
                                <option value="1">Bogota</option>
                                <option value="2">Silvania</option>
                                <option value="3">Melgar</option>
                                <option value="3">Girardot</option>
                                <option value="3">Flandes</option>
                                <option value="3">Prado</option>
                            </select>
                        </div>

                        <div class="input-group mb-3">
                            <select class="custom-select" id="inputGroupSelect02">
                                <option selected>Seleccione</option>
                                <option value="1">Hotel</option>
                                <option value="2">Finca</option>
                                <option value="3">finca hotel</option>
                                <option value="3">Apartemento</option>
                                <option value="3">Camping</option>
                            </select>
                            <div class="input-group-append">
                                <label class="input-group-text" for="inputGroupSelect02">Alojamiento</label>
                            </div>
                        </div>

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <button class="btn btn-outline-secondary" type="button">CheckIn</button>
                            </div>
                            <div class="col">
                                <input type="date" class="form-control" >
                            </div>
                        </div>

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <button class="btn btn-outline-secondary" type="button">CheckOut</button>
                            </div>
                            <div class="col">
                                <input type="date" class="form-control" >
                            </div>
                        </div>
                    </div>


                </div>


                <div class="modulo">
                    <h3 class="titulo">Titular de la Reserva</h3>
                    <form>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="validationServer01">Nombres</label>
                                <input type="text" class="form-control is-valid" id="validationServer01" value="" required>
                                <div class="valid-feedback">

                                </div>
                            </div>
                            <div class="col-md-6 mb-3">
                                <label for="validationServer02">Apellidos</label>
                                <input type="text" class="form-control is-valid" id="validationServer02" value="" required>
                                <div class="valid-feedback">

                                </div>
                            </div>
                        </div>
                        <div class="form-row">
                            <div class="col-md-6 mb-3">
                                <label for="validationServer03">Ciudad</label>
                                <input type="text" class="form-control is-invalid" id="validationServer03" required>
                                <div class="invalid-feedback">

                                </div>
                            </div>

                            <div class="col-md-3 mb-3">
                                <label for="validationServer05">Email</label>
                                <input type="text" class="form-control is-invalid" id="validationServer05" required>

                                <div class="invalid-feedback">

                                </div>
                                </>
                                <div class="invalid-feedback">

                                </div>
                            </div>
                        </div>


                        <div class="form-group">
                            <div class="form-check">
                                <input class="form-check-input is-invalid" type="checkbox" value="" id="invalidCheck3" required>
                                <label class="form-check-label" for="invalidCheck3">
                                    Aceptar terminos y condiciones
                                </label>
                                <div class="invalid-feedback">

                                </div>
                            </div>
                        </div>
                        <button class="btn btn-primary" type="submit">Reservar</button>
                    </form>


                </div>
            </aside>
            <footer>
                <p> CopyRight @gabrielbernal - Booktrip.co</p>
            </footer>
        </div>
    </body>
</html>
