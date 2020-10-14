function validarInformacionPagos() {
    var resultado = 'correcto';
    var Usuario = $('#txtUsuario').val();
    var Inmueble = $('#txtInmueble').val();
    var Adjunto = $('#txtAdjunto').val();
    var Monto = $('#txtMonto').val();
    var FechaPago = $('#txtFechaPago').val();
    var FechaPago2 = $('#txtFechaPago2').val();


    console.log("informacion a validar");
    console.log("Usuario:" + Usuario);
    console.log("Inmueble:" + Inmueble);
    console.log("Adjunto:" + Adjunto);
    console.log("Monto:" + Monto);
    console.log("FechaPago:" + FechaPago);
    console.log("FechaPago2:" + FechaPago2);

    if (Usuario == '') {
        alert('El usuario no puede ser nulo');
        resultado = 'Error';

    } else if (Inmueble == '') {
        alert('El inmueble no puede ser nulo');
        resultado = 'Error';

    /*} else if (Adjunto == '') {
        alert('El adjunto no puede ser nulo');
        resultado = 'Error';*/

    } else if (Monto == '') {
        alert('El monto no puede ser nulo');
        resultado = 'Error';

    } else if (FechaPago == '') {
        alert('La fechaPago no puede ser nulo');
        resultado = 'Error';

    } else if (FechaPago2 == '') {
        alert('La fechaPago2 no puede ser nulo');
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
//----
   function setIdUsuario(){
      var x =document.getElementById("selectIdUsuario").value;
     document.getElementById("txtUsuario").value=x;
        
    } 
    
    function setIdInmueble(){
      var x =document.getElementById("selectIdInmueble").value;
     document.getElementById("txtInmueble").value=x;
        
    }