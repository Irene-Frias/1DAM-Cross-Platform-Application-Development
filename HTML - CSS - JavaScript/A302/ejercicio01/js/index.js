var contador;

function iniciar(){
    contador = 0;
    mostrarContador();
}

function mostrarContador(){
    let parrafor = document.getElementById('salida');
    parrafor.innerHTML = contador;
}

function actualizar(){
    contador++;
    mostrarContador();
}