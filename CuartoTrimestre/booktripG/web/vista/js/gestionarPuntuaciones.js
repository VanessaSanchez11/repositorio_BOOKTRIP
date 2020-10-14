function validarInformacionPuntuacion() {
    var resultado = 'correcto';
    var Usuario = $('#txtUsuario').val();
    var Inmueble = $('#txtInmueble').val();
    var FechaCreada = $('#txtFechaCreada').val();
    var Descripcion = $('#txtDescripcion').val();
    var Calificacion = $('#txtCalificacion').val();

    console.log("informacion a validar");
    console.log("Usuario:" + Usuario);
    console.log("Inmueble:" + Inmueble);
    console.log("FechaCreada:" + FechaCreada);
    console.log("Descripcion :" + Descripcion);
    console.log("Calificacion:" + Calificacion);


    if (Usuario == '') {
        alert('El usuario no puede ser nulo');
        resultado = 'Error';

    } else if (Inmueble == '') {
        alert('El Inmueble no puede ser nulo');
        resultado = 'Error';

    } else if (FechaCreada == '') {
        alert('La fechaCreada no puede ser nulo');
        resultado = 'Error';

    } else if (Descripcion == '') {
        alert('La descipcionno puede ser nulo');
        resultado = 'Error';

    } else if (Calificacion == '') {
        alert('La caliicacion no puede ser nulo');
        resultado = 'Error';

    } else {
        resultado = 'correcto';
    }
    $('#txtBandera').val(resultado);
    console.log("resultado:" + $('#txtBandera').val());
    if (resultado == 'correcto') {

        return true;
    } else {
        return false;
    }

}
    function setIdUsuario(){
      var x =document.getElementById("selectIdUsuario").value;
     document.getElementById("txtUsuario").value=x;
        
    } 
    
    function setIdInmueble(){
      var x =document.getElementById("selectIdInmueble").value;
     document.getElementById("txtInmueble").value=x;
        
    }