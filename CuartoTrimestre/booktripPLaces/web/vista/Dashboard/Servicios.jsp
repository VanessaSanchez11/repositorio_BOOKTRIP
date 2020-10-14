

<div class="container-fluid">

<!-- Page Heading -->
<div class="d-sm-flex align-items-center justify-content-between mb-4">
    <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
    <!-- <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de usuarios</a>
    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm"> Consultar usuario</a>
    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar usuario</a>
    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"> Eliminar usuario</a> -->

</div>
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
                    <h2>Seleccione el servicio</h2>
                    <p></p> 
                </article>
            </section>
    </section>
    <!-- agregar barra lateral -->
    <aside>
        <div class="modulo">
            <h3 class="titulo">Seleccione mas servicios</h3>
            <ul>
                <select class="custom-select custom-select-lg mb-3">
                    <option selected>Servicios</option>
                    <option value="1">Microondas</option>
                    <option value="2">Refrigerador</option>
                    <option value="3">Platos y Cubieros</option>
                    <option value="3">Almohadas y Mantas Adicionales</option>
                    <option value="3">Wi-Fi</option>
                </select>

        </div>

        <div class="mb-3 caja">
            <label for="validationTextarea" class="comment">No Encuentra El Servicio? deje su comentario</label>
            <textarea class="form-control is-invalid" id="validationTextarea" placeholder="escriba aqui su comentario" required></textarea>
            <div class="invalid-feedback">

            </div>
            <br>  <br> <br>
            <button class="btn btn-dark" type="submit">ENVIAR</button>
        </div>

        </ul>
</div>

</div>







