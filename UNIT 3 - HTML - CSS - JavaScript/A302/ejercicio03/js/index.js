var contador = 0;

function iniciar() {
  mostrarContador();
}

function aumentar() {
  contador++;
  mostrarContador();
}

function mostrarContador() {
  let cont = document.getElementById("contadores");
  let elemento = document.createElement("div");

  elemento.innerHTML = contador;
  cont.appendChild(elemento)
}