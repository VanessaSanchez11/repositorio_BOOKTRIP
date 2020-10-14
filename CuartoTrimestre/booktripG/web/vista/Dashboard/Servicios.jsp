

<div class="container-fluid">

    <!-- Page Heading -->

    <div class="d-sm-flex align-items-center justify-content-between mb-4">

        <a href="indexListaServicios.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de servicio</a>
        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm"> Consultar servicio</a>
        <a href="indexServiciosCrear.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Crear servicio</a>


    </div>

    <div class="contenedor">

        <section class="main">
            <div class="imagen">
                <img src="imagenes/servicios.jpg"/>
                <section class="Posts">
                    <article>

                        <p></p> 
                    </article>
                </section>
        </section>
        <!-- agregar barra lateral -->
        <aside>
            <form class="user" action="/booktripG/registerServices" method="post" onsubmit="return validarInformacionServicio()"> 
                <div class="modulo">

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">

                            <input type="text" class="form-control " name ="nombre" id="txtNombre" placeholder="Nombre">
                        </div>

                    </div>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <input type="text" class="form-control " name ="descripcion" id="txtdescripcion" placeholder="Descripcion">
                        </div>
                    </div>

                    <div class="col-12 py-3">
                        <input class="d-none" id="txtBandera" type="text" name="BanderaRegistro" > 

                    </div>

                    <input  type="submit" class="btn btn-dark" value="Enviar">
                </div>
            </form>
        </aside>

    </div>
    <script src="../js/jquery-1.11.0.min.js"></script>
    <script src="../js/gestionarServicios.js"></script>
</div>







