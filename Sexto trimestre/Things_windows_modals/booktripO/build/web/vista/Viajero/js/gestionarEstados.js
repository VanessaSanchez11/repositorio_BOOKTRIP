function validarInformacionEstado() {

    var Resultado = 'correcto';
    var Nombre = $('#txtNombre').val();
    console.log("informacion a validar");
    console.log("nombre:" + Nombre);
    if (Nombre == '') {

        alert('el nombre no puede estar vacio');
        Resultado = 'Error';

    } else {

        Resultado = 'correcto';
    }

    $('#txtBanderaReg').val(Resultado);
    console.log("Resultado: " + $('#txtBanderaReg').val());
    if (Resultado == 'correcto') {

        return true;
    } else {

        return false;
    }

}

// Asignacion del valor de consulta luego de presionar el boton en la lista de rol.

function SetIdEstado(x) {

    $('#txt_Id_Consultado').val(x);

    console.log("valor : " + x);

}

function SetIdEstado(x) {

    $('#txt_Id_Consultado').val(x);

    console.log("valor : " + x);

}

//Funcion que evalua cuando el input de consulta cambia su valor para realizar la consulta.

$('#txt_Id_Consultado').change(function () {

    console.log("Texto" + $('#txt_Id_Consultado').val());

});

//Funcion que realiza la busqueda mediante el parametro pasado por la URL.

function realizarBusqueda() {

    var textoBuscado = $('#txt_Id_Consultado').val();

    console.log("Texto: " + $('#txt_Id_Consultado').val());

    window.location.href = '/booktripPLaces/vista/Dashboard/listadoEstado.jsp?buscando='+textoBuscado.trim()+'&';

}

function DefinirFoco() {

    document.getElementById("txt_Id_Consultado").focus();

}

function MostrarSelector() {

    var Valor = $("#foo").val();

    console.log('Valor Selector: ' + Valor);

}

//Actualizar Informacion

function validarInformacionEstadoAct() {

    var resultado = 'correcto';

    var Nombre = $('#txtNombreAct').val();

    console.log(" -- Informacion a Validar -- ");

    console.log("Nombre : " + Nombre);

    if (Nombre == '') {

        alert("el nombre no puede ser nulo");

        resultado = 'Error';

    }

    $('#txtBanderaAct').val(resultado);

    console.log("Resultado: " + $('#txtBanderaAct').val());

    if (resultado == 'correcto') {

        return true;

    } else {

        return false;

    }

}

// FUNCIONES PARA VALIDAR EL SELECTOR EN ACTUALIZAR.

function setIdEstadoA(x) {

    $('#txtNombreAct').val(x);

    console.log("valor : " + x);

}