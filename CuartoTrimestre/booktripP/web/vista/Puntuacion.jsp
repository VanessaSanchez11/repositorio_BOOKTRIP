<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <link rel="stylesheet"   href="css/Puntuacion_estilo.css" />
        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>

         <title>Puntuacion</title>
    </head>
    <body>
        <div class="contenedor">
       
       <section class="main">
         <div class="imagen">
               <img src="imagenes/2.jpg"/>
          <section class="Posts">
          <article>
               <h2>Recorrido en lancha por el Rio Magdalena</h2>
               <p>Recorrido en lancha por el Rio Magdalena, principal arteria fluvial del país y un atractivo natural e histórico de Girardot, en el que se pueden realizar actividades como navegación de contemplación, pesca artesanal y balneario. En décadas pasadas fue el soporte que permitió que Girardot constituyera uno de los principales puertos fluviales por donde desemboca el río Bogotá y llegaba mercancía enviada desde Barranquilla con destino a Bogotá y a través del cual se embarcaba el café de exportación proveniente del centro del país.</p> 
          </article>
          </section>
     </section>
     <!-- agregar barra lateral -->
     <aside>
          <div class="modulo">
               <h3 class="titulo">Seleccione la calificacion</h3>
               <ul>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="Excelente" checked>
                    <label class="form-check-label" for="">
                      EXCELENTE
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="Muy Bueno">
                    <label class="form-check-label" for="">
                      MUY BUENO
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3" value="Regular">
                    <label class="form-check-label" for="">
                      REGULAR
                    </label>
                  </div>
                  <div class="form-check">
                    <input class="form-check-input" type="radio" name="exampleRadios" id="exampleRadios3" value="Malo">
                    <label class="form-check-label" for="">
                      MALO
                    </label>
                     <br>  <br>
                   
                  </div>
                   
                   <div class="mb-3">
                    <label for="validationTextarea">Dejenos su Comentario</label>
                    <textarea class="form-control is-invalid" id="validationTextarea" placeholder="escriba aqui su comentario" required></textarea>
                    <div class="invalid-feedback">
                    
            </div>
                     <br>  <br> <br>
                    <button class="btn btn-primary" type="submit">ENVIAR</button>
  </div>
                    
      
                  
    </body>
</html>
