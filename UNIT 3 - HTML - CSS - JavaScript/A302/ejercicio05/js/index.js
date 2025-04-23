function iniciar() {
    actualizar();
}

// Pasar el contenido activo al elemento desactivado
function actualizar() {
    let contenido = document.getElementById("activo").value;
    document.getElementById("desactivado").value = contenido;
}