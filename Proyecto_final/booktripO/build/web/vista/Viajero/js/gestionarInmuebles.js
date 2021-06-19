function validarInformacionInmueble() {
    var resultado = 'correcto';
    var Tipo = $('#txtTipo').val();
    var Departamento = $('#txtDepartamento').val();
    var Usuario = $('#txtUsuario').val();
    var Estado = $('#txtEstado').val();
    var Nombre = $('#txtNombre').val();
    var Direccion = $('#txtDireccion').val();
    var Capacidad = $('#txtCapacidad').val();
    var Descripcion = $('#txtDescripcion').val();
    var Precio = $('#txtPrecio').val();
    var Adjunto = $('#txtAdjunto').val();

    console.log("informacion a validar");
    console.log("TipoInmueble:" + Tipo);
    console.log("Departamento:" + Departamento);
    console.log("Usuario:" + Usuario);
    console.log("Estado:" + Estado);
    console.log("Nombre:" + Nombre);
    console.log(" Direccion:" + Direccion);
    console.log("Capacidad:" + Capacidad);
    console.log("Descripcion :" + Descripcion);
    console.log("Precio:" + Precio);
    console.log("Adjunto:" + Adjunto);
    
    if (Tipo=='') {
        alert('El  tipo inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Departamento==''){
        alert('El departamento no puede ser nulo');
        resultado='Error';
        
    }else if(Usuario==''){
        alert('El usuario no puede ser nulo');
        resultado='Error';
        
    }else if(Estado==''){
        alert('El estado no puede ser nulo');
        resultado='Error';
        
    }else if(Nombre==''){
        alert('El nombre del inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Direccion==''){
        alert('La direccion del inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Capacidad==''){
        alert('La capacidad del inmueble no puede ser nulo');
        resultado='Error';
        
    }
    else if(Descripcion==''){
        alert('La descripcion del inmueble no puede ser nulo');
        resultado='Error';
        
    }
    else if (Precio==''){
        alert('El precio del inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Adjunto==''){
        alert('El adjunto del inmueble no puede ser nulo');
        resultado='Error';
        
    }  else if (isNaN(Precio)) {
        
        alert("el valor debe ser numerico");
        resultado = 'Error';
        
    }else if(isNaN(Capacidad)){
        alert('La capacidad debe ser numerica');
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
 
    function setIdTipo(){
      var x =document.getElementById("selectIdTipo").value;
     document.getElementById("txtTipo").value=x;
        
    }
    function setIdDepartamento(){
      var x =document.getElementById("selectIdDepartamento").value;
     document.getElementById("txtDepartamento").value=x;
        
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
    window.location.href = '/booktripPLaces/vista/Dashboard/inmueble.jsp?buscando='+ textoBuscado.trim()+'&';
} 
    function validarInformacionInmuebleAct() {
    var resultado = 'correcto';
    var Tipo = $('#txtTipoAct').val();
    var Departamento = $('#txtDepartamentoAct').val();
    var Usuario = $('#txtUsuarioAct').val();
    var Estado = $('#txtEstadoAct').val();
    var Nombre = $('#txtNombreAct').val();
    var Direccion = $('#txtDireccionAct').val();
    var Capacidad = $('#txtCapacidadAct').val();
    var Descripcion = $('#txtDescripcionAct').val();
    var Precio = $('#txtPrecioAct').val();
    var Adjunto = $('#txtAdjuntoAct').val();

    console.log("informacion a validar");
    console.log("TipoInmueble:" + Tipo);
    console.log("Departamento:" + Departamento);
    console.log("Usuario:" + Usuario);
    console.log("Estado:" + Estado);
    console.log("Nombre:" + Nombre);
    console.log(" Direccion:" + Direccion);
    console.log("Capacidad:" + Capacidad);
    console.log("Descripcion :" + Descripcion);
    console.log("Precio:" + Precio);
    console.log("Adjunto:" + Adjunto);
    
    if (Tipo=='') {
        alert('El  tipo inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Departamento==''){
        alert('El departamento no puede ser nulo');
        resultado='Error';
        
    }else if(Usuario==''){
        alert('El usuario no puede ser nulo');
        resultado='Error';
        
    }else if(Estado==''){
        alert('El estado no puede ser nulo');
        resultado='Error';
        
    }else if(Nombre==''){
        alert('El nombre del inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Direccion==''){
        alert('La direccion del inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Capacidad==''){
        alert('La capacidad del inmueble no puede ser nulo');
        resultado='Error';
        
    }
    else if(Descripcion==''){
        alert('La descripcion del inmueble no puede ser nulo');
        resultado='Error';
        
    }
    else if (Precio==''){
        alert('El precio del inmueble no puede ser nulo');
        resultado='Error';
        
    }else if(Adjunto==''){
        alert('El adjunto del inmueble no puede ser nulo');
        resultado='Error';
        
    }  else if (isNaN(Precio)) {
        
        alert("el valor debe ser numerico");
        resultado = 'Error';
        
    }else if(isNaN(Capacidad)){
        alert('La capacidad debe ser numerica');
        resultado='Error';
        
    }else{
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
 
    
    


