//-------------------------------Validaciones Departamentos


function checkDepa(){
    
    var nombre = document.getElementById('IdNombreDepa');
   
    var nombreValue = nombre.value.trim();
    
    
    if(nombreValue === ''){
        setErrorFor(nombre, 'No puede dejar este campo vacio');
        return false;
    }else{
        setSuccessFor(nombre); 
    }
        
    

function setErrorFor(input, message) {
    var formGroup = input.parentElement;
    var p = formGroup.querySelector('p');
    formGroup.className = 'form-group error';
    p.innerText = message;
}
function setSuccessFor(input) {
    var formGroup = input.parentElement;
    formGroup.className = 'form-group success';
}

}

///////////////////////////////////////Validaciones Municipios


function checkMuni(){
    
    var idDepa = document.getElementById('idMuni');
    var nombreMuni = document.getElementById('idNombreMuni');
    
    
    var idDepaValue = idDepa.value.trim();
    var nombreMuniValue = nombreMuni.value.trim();
    
    
    if(idDepaValue === ''){
        setErrorFor(idDepa, 'No puede dejar este campo vacio');
        return false;
        
    }else{
        setSuccessFor(nombreMuni); 
    }
    
     if(nombreMuniValue === ''){
        setErrorFor(nombreMuni, 'No puede dejar el nombre campo vacio');
        return false;
     
    }else{
        setSuccessFor(nombreMuni); 
    }
     
}

function setErrorFor(input, message) {
    var formGroup = input.parentElement;
    var p = formGroup.querySelector('p');
    formGroup.className = 'form-group error';
    p.innerText = message;
}
function setSuccessFor(input) {
    var formGroup = input.parentElement;
    formGroup.className = 'form-group success';
}

///////////////////////////////////////////////validaciones actividades


function checkActi(){
    
    var actividad = document.getElementById('IdActividades');
    var place = document.getElementById('IdLugar');
    var descripcion = document.getElementById('IdDescripcion');
    
    var actividadValue = actividad.value.trim();
    var placeValue = place.value.trim();
    var descripcionValue = descripcion.value.trim();
    
    
    if(actividadValue === ''){
        setErrorFor(actividad, 'No puede dejar este campo vacio');
        return false;
        
    }else{
        setSuccessFor(place); 
    }
    
     if(placeValue === ''){
        setErrorFor(place, 'No puede dejar el nombre campo vacio');
        return false;
     
    }else{
        setSuccessFor(descripcion); 
    }
    if(descripcionValue === ''){
        setErrorFor(description, 'No puede dejar el nombre campo vacio');
        return false;
     
    }else{
        setSuccessFor(description); 
  }   
}

function setErrorFor(input, message) {
    var formGroup = input.parentElement;
    var p = formGroup.querySelector('p');
    formGroup.className = 'form-group error';
    p.innerText = message;
}
function setSuccessFor(input) {
    var formGroup = input.parentElement;
    formGroup.className = 'form-group success';
}

///////////////////////////////////validaciones galerias

function checkActi(){
    
    var imagen = document.getElementById('IdImagen');
    var url = document.getElementById('IdUrl');
   
    
    var imagenValue = imagen.value.trim();
    var urlValue = url.value.trim();
   
    
    
    if(imagenValue === ''){
        setErrorFor(imagen, 'No puede dejar este campo vacio');
        return false;
        
    }else{
        setSuccessFor(url); 
    }
    
     if(urlValue === ''){
        setErrorFor(url, 'No puede dejar el nombre campo vacio');
        return false;
     
    }else{
        setSuccessFor(url); 
    }
    
}

function setErrorFor(input, message) {
    var formGroup = input.parentElement;
    var p = formGroup.querySelector('p');
    formGroup.className = 'form-group error';
    p.innerText = message;
}
function setSuccessFor(input) {
    var formGroup = input.parentElement;
    formGroup.className = 'form-group success';
}



//------------------Selects---------------------------------

function setIdMuni() {
    var municipio = document.getElementById("selectMuni").value;
    document.getElementById("idMuni").value = municipio;
}



function setIdActi() {
    var actividad = document.getElementById("selectActi").value;
    document.getElementById("idActi").value = actividad;
}

function setIdGale() {
    var galeria = document.getElementById("selectGale").value;
    document.getElementById("idGale").value = galeria;
}



//------------------------------------------FUNCIONES DE MUNICIPIOS----------------------//


function visualizaOculta(Dato) {
    console.log("Viene " + Dato);
    if (Dato === "Registrar") {
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Actualizar") {
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Listado") {
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }

}

function realizarBusqueda()
{
    var textoBuscado = $('#idMuni').val();
    console.log("Texto: " + $('#idMuni').val());
    window.location.href = '/booktripP/vista/Dashboard/indexListaMunicipios.jsp?buscando=' + textoBuscado.trim() + '&';
}

//------------------------------------------FUNCIONES DE DEPARTAMENTO----------------------------------------//

function visualizaOcultaDepa(Dato) {
    console.log("Viene " + Dato);
    if (Dato === "Registrar") {
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Actualizar") {
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Listado") {
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }

}


function realizarBusquedaDepa()
{
    var textoBuscado = $('#idDepa').val();
    console.log("Texto: " + $('#idDepa').val());
    window.location.href = '/booktripP/vista/Dashboard/indexListaDepartamentos.jsp?buscando=' + textoBuscado.trim() + '&';
}
//------------------------------------------FUNCIONES DE GALERIA----------------------------------------//

function visualizaOcultaGale(Dato) {
    console.log("Viene " + Dato);
    if (Dato === "Registrar") {
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Actualizar") {
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Listado") {
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }

}
function realizarBusquedaGale()
{
    var textoBuscado = $('#idGale').val();
    console.log("Texto: " + $('#idGale').val());
    window.location.href = '/booktripP/vista/DashboardPropietario/indexListaGaleria.jsp?buscando=' + textoBuscado.trim() + '&';
}
//------------------------------------------FUNCIONES DE ACTIVIDADES----------------------------------------//



function visualizaOcultaActi(Dato) {
    console.log("Viene " + Dato);
    if (Dato === "Registrar") {
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Actualizar") {
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato === "Listado") {
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }

}

function realizarBusquedaActi()
{
    var textoBuscado = $('#idActi').val();
    console.log("Texto: " + $('#idActi').val());
    window.location.href = '/booktripP/vista/DashboardPropietario/indexListaActividad.jsp?buscando=' + textoBuscado.trim() + '&';
}


/////////////////////////////////actualizar Departamentos



    
