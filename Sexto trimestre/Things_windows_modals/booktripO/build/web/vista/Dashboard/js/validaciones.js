alert("Bienvenidos a BookTrip probando people");



$(function validarEstado(){
    var nombre;
    $(".btnRegistrar").on('click', function(){
        nombre=$("#txtNom").val();
        if (nombre.length==0){
            alert('El campo no puede ir vacio')
            return false;
        }else{
           alert('Registro exitoso')
        }
    });
});
// v tipo inmueble

 $(function validarTipoInmueble(){
    var nombre;
    $(".btnGuardar").on('click', function(){
        nombre=$("#txtNom").val();
        if (nombre.length==0){
            alert('El campo no puede ir vacio')
            return false;
        }else{
           alert('Registro exitoso')
        }
    });
});
//solicitud
$(function validarSolicitud(){
    var tipo,usuario, estado, fecha;
    $(".btnGuardar").on('click', function(){
        tipo=$("#txtTipo").val();
         usuario=$("#txtUsuario").val();
          estado=$("#txtEstado").val();
           fecha=$("#txtFecha").val();
           
        if (tipo.length==0){
            alert('El campo no puede ir vacio')
            return false;
        }if (usuario.length==0){
            alert('El campo no puede ir vacio')
            return false;
        }if (estado.length==0){
            alert('El campo no puede ir vacio')
            return false;
        }if (fecha.length==0){
            alert('El campo no puede ir vacio')
            return false;
        }else{
           alert('Registro exitoso')
        }
    });
});
