
<%@page import="modelo.municipios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.municipiosDAO"%>
<div class="container-fluid">
    <div class="d-sm-flex align-items-center justify-content-between mb-4">

        <a href="indexListaMunicipios.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de Municipios</a>


    </div>

    <body>

        <h1 class="parte3">REGISTRA EL MUNICIPIO</h1>
        <br>

        <div class="form-group col-sm-5 ">
            <br>

            <TABLE BORDER=2 class="ubicacion">
                <TR><TD>
                <MARQUEE> ¡PUEDES UBICARTE!</MARQUEE>
                </TD></TR>
            </TABLE>

            <br>
            <div class="mapa">
                <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d254508.51141489705!2d-74.107807!3d4.64829755!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1ses!2sco!4v1595012598872!5m2!1ses!2sco"
                        width="500" height="350" frameborder="0" style="border:2;" allowfullscreen="" aria-hidden="false" tabindex="0"></iframe>
            </div>       

            <form action="/booktripP/registrarMuni" method="post" class="formulario" onsubmit="return checkMuni();">

                <label class="label">SELECIONA EL DEPARTAMENTO</label>

                <div class="form-group">
                    <input id="idMuni" type="text" class="form-control d-none " name="departamento"  >
                    <%
                        municipiosDAO muniC = new municipiosDAO();
                        ArrayList<municipios> milistamunicipio = muniC.ConsularListaMunicipio("");
                        out.println("<select class='form-control' id='selectMuni' size='1' onchange='setIdMuni()'>");
                        out.println("<option value=''>" + "--Seleccione--" + "</option>");
                        for (municipios m : milistamunicipio) {
                            out.println("<option value='" + m.getIdDepartamento() + "'>" + m.getNombre() + "</option>");
                        }
                        out.println("</select>");

                    %>

                    <label for="name" class="label-titulo mt-3"> ESCRIBE EL MUNICIPIO </label>

                    <input type="text" class="form-control" placeholder="" name="municipio" id="idNombreMuni">
                    
                    <!--<small>Error</small>-->
                    <p>Error</p>
                    <br>
                 <button type="submit" class="btn btn-primary btn-sm botonRegistro mb-4">Enviar</button>
                </div>
                   
                
            
            </form>




        </div>
</div>


