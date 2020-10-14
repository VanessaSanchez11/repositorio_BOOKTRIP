

function visualizaOculta(Dato){
    console.log("Viene " + Dato);
    if (Dato == "Registrar"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Actualizar"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Listado"){
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }
}


function realizarBusqueda()
{ var textoBuscado = $('#txt_Id_Consultado').val();
console.log("Texto: " + $('#txt_Id_Consultado').val());
window.location.href = '/booktripG/vista/Dashboard/indexListaPagos.jsp?buscando='+textoBuscado.trim()+'&';
}

//----------------------Funciones puntuaciones

function visualizaOcultaPuntuaciones(Dato){
    console.log("Viene " + Dato);
    if (Dato == "Registrar"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Actualizar"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Listado"){
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }
}


function realizarBusquedaPuntuaciones()
{ var textoBuscado = $('#txt_Id_Consultado').val();
console.log("Texto: " + $('#txt_Id_Consultado').val());
window.location.href = '/booktripG/vista/Dashboard/indexListaPuntuaciones.jsp?buscando='+textoBuscado.trim()+'&';
}

//----------------------Funciones reservas

function visualizaOcultaReservas(Dato){
    console.log("Viene " + Dato);
    if (Dato == "Registrar"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Actualizar"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Listado"){
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }
}


function realizarBusquedaReservas()
{ var textoBuscado = $('#txt_Id_Consultado').val();
console.log("Texto: " + $('#txt_Id_Consultado').val());
window.location.href = '/booktripG/vista/Dashboard/indexListaReserva.jsp?buscando='+textoBuscado.trim()+'&';
}

//----------------------Funciones servicios


function visualizaOcultaServicios(Dato){
    console.log("Viene " + Dato);
    if (Dato == "Registrar"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Actualizar"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listado").addClass('d-none');
    } else if (Dato == "Listado"){
        $("#Listado").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }
}


function realizarBusquedaServicios()
{ var textoBuscado = $('#txt_Id_Consultado').val();
console.log("Texto: " + $('#txt_Id_Consultado').val());
window.location.href = '/booktripG/vista/Dashboard/indexListaServicios.jsp?buscando='+textoBuscado.trim()+'&';
}

//-----