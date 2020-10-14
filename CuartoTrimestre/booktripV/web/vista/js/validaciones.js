
const form = document.getElementById('form');

//form.addEventListener('submit', e => {
   // e.preventDefault();
 //   checkInputs();
//});

function checkInputs() {
    
    //var identificacion = document.getElementById('idDocumento');
    //var rol = document.getElementById('idRoles');
    var nombre = document.getElementById('idNombre');
    var apellido = document.getElementById('idApellido');
    var direccion = document.getElementById('idDireccion');
    var telefono = document.getElementById('idTelefono');
    var fechaN = document.getElementById('idFecha');
   // var email = document.getElementById('idEmail');
    var password = document.getElementById('idPass');



    var nombreValue = nombre.value.trim();
    var apellidoValue = apellido.value.trim();
    var direccionValue = direccion.value.trim();
    var telefonoValue = telefono.value.trim();
    var fechaValue = fechaN.value.trim();
    //var emailValue = email.value.trim();
    var passwordValue = password.value.trim();


    if (nombreValue === '') {

        setErrorFor(nombre, 'No puede dejar el nombre vacio');
        return false;
    } else {

        setSuccessFor(nombre);
        console.log(nombre);
    }

    if (apellidoValue === '') {
        setErrorFor(apellido, 'No puede dejar el apellido vacio');
        return false;
    } else {
        setSuccessFor(apellido);
    }

    if (direccionValue === '') {
        setErrorFor(direccion, 'No puede dejar la direccion vacio');
         return false;
    } else {
        setSuccessFor(direccion);
    }

    if (telefonoValue === '') {
        setErrorFor(telefono, 'No puede dejar el telefono vacio');
         return false;
    } else {
        setSuccessFor(telefono);
    }

    if (fechaValue === '') {
        setErrorFor(fechaN, 'No puede dejarlo vacio');
         return false;
    } else {
        setSuccessFor(fechaN);
    }

    if (passwordValue === '') {
        setErrorFor(password, 'No puede dejar dejar este campo vacio');
         return false;
    } else {
        setSuccessFor(password);
    }

}

function checkInputsNombre(){
    
    var nombre = document.getElementById('idNombre');
    
    var nombreValue = nombre.value.trim();
    
    if (nombreValue === '') {

        setErrorFor(nombre, 'No puede dejar el nombre vacio');
        return false;
    } else {
        
        setSuccessFor(nombre);
        console.log(nombre);
    }
    
}
function setErrorFor(input, message) {
    const formGroup = input.parentElement;
    const small = formGroup.querySelector('small');
    formGroup.className = 'form-group error';
    small.innerText = message;
}
function setSuccessFor(input) {
    const formGroup = input.parentElement;
    formGroup.className = 'form-group success';
}
function setIdRoles(){
     var rol = document.getElementById("selectTipoRol").value;
    document.getElementById("idRoles").value = rol;
}
function setIdTipo(){
   var tipo = document.getElementById("selectTipoDocu").value;
  document.getElementById("idDocumento").value = tipo;
}

/////////////////////////////////////////////////////////////////


function VolverAlInicio()
{
    window.location.href = '/blackrawe/Pagina_Principal_Usuario.jsp';
}

//----------------------------SELECTS------------------------------------------------
function setIdTipoA(){
   var tipo = document.getElementById("selectTipoDocAct").value;
   document.getElementById("idDocumentoAct").value = tipo;
}
function setIdRol(){
     var rol = document.getElementById("selectTipoRolAct").value;
    document.getElementById("idRolesAct").value = rol;
}
//----------------usuarios-------------------------------------------------------
function visualizaOculta(Dato){
    console.log("Viene " + Dato);
    if (Dato === "Registrar"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Actualizar"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Listado"){
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }

}

function realizarBusqueda()
{ var textoBuscado = $('#txt_Id_Consultado').val();
console.log("Texto: " + $('#txt_Id_Consultado').val());
window.location.href = '/booktripV/vista/Dashboard/indexListaUsuario.jsp?buscando='+textoBuscado.trim()+'&';
}

function SetIdConsulta(x){
$('#txt_Id_Consultado').val(x);
console.log("valor : " + x);
}

function SetIdConsulta(x){
$('#txt_Id_Consultado').val(x);
console.log("valor : " + x);
}
//Funcion que evalua cuando el input de consulta cambia su valor para realizar la consulta.
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
//Actualizar Informacion


//------------------------------------------------------------------------------------
//ROL ----Funciones que se requieren para el consultar//act
//------------------------------------------------------------------------------------

function realizarBusquedaRol()
{ var textoBuscado = $('#idSearchRol').val();
console.log("Texto: " + $('#idSearchRol').val());
window.location.href = '/booktripV/vista/Dashboard/indexListaRol.jsp?buscando='+textoBuscado.trim()+'&';
}
function visualizaOcultaRol(Dato){
    console.log("Viene " + Dato);
    if (Dato === "Registrar"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Actualizar"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Listado"){
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }
}
function SetIdConsultaRol(x){
$('#idSearchRol').val(x);
console.log("valor : " + x);
}

function SetIdConsultaRol(x){
$('#idSearchRol').val(x);
console.log("valor : " + x);
}
//Funcion que evalua cuando el input de consulta cambia su valor para realizar la consulta.
$('#txt_Id_Consultado').change(function(){
console.log("Texto" + $('#txt_Id_Consultado').val());
});


//------------------------------------------------------------------------------------
//DOCUMENTO ----Funciones que se requieren para el consultar
//------------------------------------------------------------------------------------


function realizarBusquedaTipoD()
{ var textoBuscado = $('#idDocu').val();
console.log("Texto: " + $('#idDocu').val());
window.location.href = '/booktripV/vista/Dashboard/indexListaTipoDocu.jsp?buscando='+textoBuscado.trim()+'&';
}
function visualizaOcultaTipoD(Dato){
    console.log("Viene " + Dato);
    if (Dato === "Registrar"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Actualizar"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Listado"){
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }

}

function SetIdConsultaDocu(x){
$('#idDocu').val(x);
console.log("valor : " + x);
}

function SetIdConsultaDocu(x){
$('#idDocu').val(x);
console.log("valor : " + x);
}
//Funcion que evalua cuando el input de consulta cambia su valor para realizar la consulta.
$('#txt_Id_Consultado').change(function(){
console.log("Texto" + $('#txt_Id_Consultado').val());
});

