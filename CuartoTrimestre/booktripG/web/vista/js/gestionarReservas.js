function validarInformacionReserva() {
    var resultado = 'correcto';
    var Usuario = $('#txtUsuario').val();
    var Inmueble = $('#txtInmueble').val();
    var Estado = $('#txtEstado').val();
    var FechaReserva = $('#txtFechaReserva').val();
    var CheckIn = $('#txtCheckIn').val();
    var CheckOut= $('#txtCheckOut').val();    

    console.log("informacion a validar");
    console.log("IdUsuario:" + Usuario);
    console.log("IdInmueble:" + Inmueble);
    console.log("IdEstado:" + Estado);
    console.log("FechaReserva:" + FechaReserva);
    console.log("CheckIn:" + CheckIn);
    console.log("CheckOut :" + CheckOut);
    
   
    if (Usuario=='') {
        alert('El Usuario no puede ser nulo');
        resultado='Error';
       
    }else if(Inmueble==''){
        alert('El Inmueble no puede ser nulo');
        resultado='Error';
       
    }else if(Estado==''){
        alert('El Estado no puede ser nulo');
        resultado='Error';
       
    }else if(FechaReserva==''){
        alert('La FechaReserva no puede ser nulo');
        resultado='Error';
       
    }else if(CheckIn==''){
        alert('El CheckIn no puede ser nulo');
        resultado='Error';
       
    }else if(CheckOut==''){
        alert('El CheckOut no puede ser nulo');
        resultado='Error';
       
    }
    
    
    else{
        resultado='correcto';
    }
    $('#txtBandera').val(resultado);
    console.log("resultado:"+ $('#txtBandera').val());
    if (resultado=='correcto') {
        return true;
    }else{
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
    function setIdEstado(){
      var x =document.getElementById("selectIdEstado").value;
     document.getElementById("txtEstado").value=x;
        
    }