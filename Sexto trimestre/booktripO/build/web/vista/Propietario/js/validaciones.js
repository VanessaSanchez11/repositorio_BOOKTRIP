
alert("Bienvenidos a BookTrip");

function validar(){
    var nombre = document.getElementById('txtNombre').value;
    var descripcion = document.getElementById('txtDescripcion').value;

    if (nombre === "") {
        alert("EL campo es obligatorio");
        return false;
    }if (descripcion === "") {
        alert("EL campo es obligatorio");
        return false;
    }else{
      alert("registro exitoso");
    }
   
}
    
