function validarInformacionTipoInmueble() {
    var resultado = 'correcto';
    var Nombre = $('#txtNombreTipo').val();
   
   

    console.log("informacion a validar");
    console.log("Nombre:" + Nombre);
    
    
    
    if (Nombre=='') {
        alert('El nombre del tipo de inmueble  no puede ser nulo');
        resultado='Error';
        
    } else {
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
    function realizarBusqueda()
{   var textoBuscado = $('#txt_Id_Consultado').val();
    console.log("Texto: " + $('#txt_Id_Consultado').val());
    window.location.href = '/booktripPLaces/vista/Dashboard/listadoTipoInmueble.jsp?buscando='+ textoBuscado.trim()+'&';


} 








function validarInformacionTipoInmuebleAct() {
    var resultado = 'correcto';
    var Nombre = $('#txtNombreAct').val();
   
   

    console.log("informacion a validar");
    console.log("Nombre:" + Nombre);
    
    
    
    if (Nombre=='') {
        alert('El nombre del tipo de inmueble  no puede ser nulo');
        resultado='Error';
        
    } else {
        resultado='correcto';
        
    }
    $('#txtBanderaAct').val(resultado);
    console.log("resultado:"+ $('#txtBanderaAct').val());
    if (resultado=='correcto') {
        return true;
    }else{
        return false;
    }
}


function setIdRolA(x) {

    $('#txtNombreAct').val(x);

    console.log("valor : " + x);

}


