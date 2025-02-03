var contador = 0;

function iniciar() {
  mostrarContador();
}

function incrementar() {
  contador++;
  mostrarContador();
}

function mostrarContador() {
    // Tabla principal
    let tabla = document.getElementById("tabla");

    // Casillas de la tabla 
    let casilla1 = document.createElement("td");
    casilla1.innerHTML = contador;
    let casilla2 = document.createElement("td");
    casilla2.innerHTML = ++contador;

    // Creamos la fila y le añadimos las dos casillas
    let fila = document.createElement("tr");
    fila.appendChild(casilla1);
    fila.appendChild(casilla2);

    // Añade la fila a la tabla
    tabla.appendChild(fila);
}