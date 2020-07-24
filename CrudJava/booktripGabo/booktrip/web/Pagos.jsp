<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      
        <link rel="stylesheet"   href="vistas/css/Pagos_estilo.css" />
        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
          <script src="bootstrap/js/bootstrap.min.js"></script>

         <title>Pagos</title>
    </head>
    <body>
        <div class="contenedor">
          <header>
              <nav>
                  <ul>
                      <li> <a href="#">Inicio</a> </li>
                      <li> <a href="#">Alojamientos</a> </li>
                      <li> <a href="#">Actividades</a> </li>
                      <li> <a href="#"> Contactenos</a> </li>
                 </ul>
            </nav>
       </header>
            
       <section class="main">
         <div class="imagen">
               <img src="vistas/imagenes/2.jpg"/>
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
               <h3 class="titulo">Seleccione Adjunto</h3>
               
                <div class="form-check">
                   <div class="custom-file">
                    <input type="file" class="custom-file-input" id="customFile">
                    <label class="custom-file-label" for="customFile"></label>
                    </div>
                </div>
                    
               
          </div>

        <div class="modulo">
            <h3 class="titulo">Detalle del Pago</h3>
            <div class="total">
            <h4>Total</h4>
            <span class="signo">$<b class="signo2">30000</b></span>
          </div>
        </div>
         
          <div class="modulo">
            <h3 class="titulo">Titular de la Actividad</h3>
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
                <button class="btn btn-primary" type="submit">Pagar</button>
              </form>
            
          
       </div>
     </aside>
     <footer>
          <p> CopyRight @gabrielbernal - Booktrip.co</p>
     </footer>
</div>
    </body>
</html>
