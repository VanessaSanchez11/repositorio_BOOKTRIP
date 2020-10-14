function validarInformacionServicio() {
    var resultado = 'correcto';
    var Nombre = $('#txtNombre').val();
    var Descripcion = $('#txtDescripcion').val();


    console.log("informacion a validar");
    console.log("Nombre:" + Nombre);
    console.log("Descripcion:" + Descripcion);


    if (Nombre == '') {
        alert('El tipo de Nombre no puede ser nulo');
        resultado = 'Error';

    } else if (Descripcion == '') {
        alert('La Descripcion no puede ser nulo');
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


