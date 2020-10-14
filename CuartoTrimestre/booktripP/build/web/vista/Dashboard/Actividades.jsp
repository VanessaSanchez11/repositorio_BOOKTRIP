
<div class="container-fluid">
<div class="d-sm-flex align-items-center justify-content-between mb-4">

    <a href="indexActividad.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de Actividades</a>
  
</div>

        <h1>REGISTRA LA ACTIVIDAD</h1>
        <br>
        <br>
        <form style:alaing-text:center action="/booktripM/Actividades" post="post">
            <div class="form-row">
                <div class="form-group col-md-6">
                    <label for="inputEmail4">NOMBRE DE LA ACTIVIDAD</label>
                    <input type="text" class="form-control" id="inputEmail4" name="nombre">
                </div>
                <br>
                <br>
                <div class="form-group col-md-6">
                    <label for="inputPassword4"> MUNICIPIO</label>
                    <select class="form-control form-control" name="Municipio">
                        <option  value="1">SILVANIA</option>
                        <option value="20">META</option>
                        <option value="21">SANTA MARTA</option>
                        <option value="22">AMAZONAS</option>
                      
                    </select>
                </div>
                <br>
                <br>
            </div>
            <div class="form-group">
                <label for="inputAddress">LUGAR</label>
                <input type="text" class="form-control" id="inputAddress" name="lugar">
            </div>
            <br>
                <br>
            <div class="form-group">
    <label for="exampleFormControlTextarea1">DESCRIPCION</label>
    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" name="Descripcion" ></textarea>
  </div>  <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" ></textarea>

     <button type="button" class="btn btn-primary btn-sm botonRegistro mb-4">Registrar</button>
</form>
</div>
