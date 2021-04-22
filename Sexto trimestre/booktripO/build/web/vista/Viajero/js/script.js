

//function confirmacion() {
//    if(confirm("Realmente desea eliminar?"))
//    {
//        return true;
//    }
//    return false;
//  
//}
//
//function VolverAEstados(){
// window.location.href="/booktripO/vista/Dashboard/indexListaEstado.jsp";    
//}
function VolverATipoInmuebles(){
 window.location.href="/booktripO/vista/Dashboard/indexListaTipoInmueble.jsp";    
}





function init(){
	var x = document.getElementById("Listado");
    var y = document.getElementById("Registrar");
    var z = document.getElementById("Actualizar");
    x.style.display = "block";
    y.style.display = "none";
 z.style.display = "none";
}

function myFunctionB1() {
    var x = document.getElementById("Listado");
    var y = document.getElementById("Registrar");
     var z = document.getElementById("Actualizar");
    if (x.style.display === "none") {
        x.style.display = "block";
        y.style.display = "none";
        z.style.display = "none";
  } else {
        y.style.display = "none";
        z.style.display = "none";  
    }
    
}

function myFunctionB2() {
    var x = document.getElementById("Listado");
    var y = document.getElementById("Registrar");
    var z = document.getElementById("Actualizar");
    
    if (y.style.display === "none") {
       y.style.display = "block";
        x.style.display = "none";
        z.style.display = "none";
  } else {
        x.style.display = "none";
        z.style.display = "none";  
    }
    
}
//function myFunctionB3() {
//    var x = document.getElementById("Listado");
//    var y = document.getElementById("Registrar");
//    var z = document.getElementById("Actualizar");
//    
//    if (z.style.display === "none") {
//        z.style.display = "block";
//        x.style.display = "none";
//         y.style.display = "none";
//    } else {
//        x.style.display = "none";
//        y.style.display = "none";      
//    }
//}
//
//
//
init();