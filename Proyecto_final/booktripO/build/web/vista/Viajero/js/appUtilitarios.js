function visualizaOculta(Dato){
    console.log("Viene " + Dato);
    if (Dato == "registroInmueble"){ 
        $("#Registrar").removeClass('d-none');
        $("#Actualizar").addClass('d-none');
        $("#Listar").addClass('d-none');
    } else if (Dato == "actualizarInmueble"){
        $("#Registrar").addClass('d-none');
        $("#Actualizar").removeClass('d-none');
        $("#Listar").addClass('d-none');
    } else if (Dato == "consultarInmueble"){
        $("#Listar").removeClass('d-none');
        $("#Registrar").addClass('d-none');
        $("#Actualizar").addClass('d-none');
    }
}
function Volver()
{
    window.location.href = '/booktripPLaces/login.jsp';
}