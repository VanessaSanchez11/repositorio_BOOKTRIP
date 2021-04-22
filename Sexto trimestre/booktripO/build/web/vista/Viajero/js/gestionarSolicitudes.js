function  validarInformacionSolicitud(){
    var resultado = 'correcto';
    var Inmueble = $('#txtInmueble').val();
    var Usuario = $('#txtUsuario').val();
    var Estado = $('#txtEstado').val();
    var Fecha = $('#txtFecha').val();
   

    console.log("informacion a validar");
    console.log("Inmueble:" + Inmueble );
    console.log("Usuario:" + Usuario);
    console.log("Estado:" + Estado);
    console.log("Fecha:" + Fecha);
    
    
    if (Inmueble=='') {
        alert('El inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Usuario==''){
        alert('El usuario no puede ser nulo');
        resultado='Error';
        
    }else if(Estado==''){
        alert('El estado no puede ser nulo');
        resultado='Error';
        
    }else if(Fecha==''){
        alert('La fecha no puede ser nula');
        resultado='Error';
        
    }else{
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

function setIdInmueble(){
      var x =document.getElementById("selectIdInmueble").value;
     document.getElementById("txtInmueble").value=x;
        
    }
     function setIdUsuario(){
      var x =document.getElementById("selectIdUsuario").value;
     document.getElementById("txtUsuario").value=x;
        
    }
     function setIdEstado(){
      var x =document.getElementById("selectIdEstado").value;
     document.getElementById("txtEstado").value=x;
        
    }



 $('#txt_Id_Consultado').change(function(){
console.log("Texto" + $('#txt_Id_Consultado').val());
});
//Funcion que realiza la busqueda mediante el parametro pasado por la URL.

function DefinirFoco(){
document.getElementById("txt_Id_Consultado").focus();
}
function MostrarSelector(){
var Valor = $("#foo").val();
console.log('Valor Selector: ' +Valor);
}     
    //Funcion que realiza la busqueda mediante el parametro pasado por la URL.
   
function realizarBusquedaBook()
{   var textoBuscado = $('#txt_Id_Consultado').val();
    console.log("Texto: " + $('#txt_Id_Consultado').val());
    window.location.href = '/booktripPLaces/vista/Dashboard/listadoSolicitudInmueble.jsp?buscando='+ textoBuscado.trim()+'&';
} 