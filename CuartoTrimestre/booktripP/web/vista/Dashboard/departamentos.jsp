<%@page import="modelo.departamento"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.departamentosDAO"%>

<div class="container-fluid">

    <div class=" align-items-center justify-content-between mb-4">

        <a href="indexListaDepartamentos.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de Departamentos</a>



    </div>


    <div class="contenedor">

        <h1>REGISTRA EL DEPARTAMENTO</h1>
        <br>

        <form action="/booktripP/registerDepa" method="post" onsubmit="return checkDepa();" >




            <div class="form-group col-sm-5 ">

                <label class="label-titulo mt-3">Nombre del departamento</label>
                <input type="text" class="form-control" placeholder="Ej: Cundinamarca" name="nombre" id="IdNombreDepa">
                <p>Error</p>
                
                

                <br>
                <br>

                <button type="submit" class="btn btn-primary btn-sm botonRegistro mb-4">Registrar</button>
            </div>

        </form>

    </div>

</div>
