function visualizaOculta(Dato){
    console.log("Viene " + Dato);
    if (Dato == "registroTipoInmueble"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listar").addClass('d-none');
    } else if (Dato == "actualizarTipoInmueble"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listar").addClass('d-none');
    } else if (Dato == "listarTipoInmueble"){
        $("#Listar").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }
}
function Volver()
{
    window.location.href = '/booktripPLaces/login.jsp';
}