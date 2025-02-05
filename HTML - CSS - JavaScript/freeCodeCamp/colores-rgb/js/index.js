// Constantes principales para coger el 'id' de cada color 
const inputRojo = document.getElementById('rojo');
const inputVerde = document.getElementById('verde');
const inputAzul = document.getElementById('azul');

// Texto que representa   
const textoRojo = document.getElementById('texto-rojo');
const textoVerde = document.getElementById('texto-verde');
const textoAzul = document.getElementById('texto-azul');

// Especificar el color 'rgb' para recoger el valor
let rojo = inputRojo.value;
let verde = inputVerde.value;
let azul = inputAzul.value;

// Actualizar el texto 
textoRojo.innerText = rojo;
textoVerde.innerText = verde;
textoAzul.innerText = azul;

function actualizarColor (rojo, verde, azul) {
    const colorRGB = `rgb(${rojo}, ${verde}, ${azul})`;
    document.body.style.backgroundColor = colorRGB;
}

// Actualizar el color 'rojo'
inputRojo.addEventListener('change', (e) => {
    rojo = e.target.value;
    textoRojo.innerText = rojo;
    actualizarColor(rojo, verde, azul);
});

// Actualizar el color 'verde'
inputVerde.addEventListener('change', (e) => {
    verde = e.target.value;
    textoVerde.innerText = verde;
    actualizarColor(rojo, verde, azul);
});

// Actualizar el color 'azul'
inputAzul.addEventListener('change', (e) => {
    azul = e.target.value;
    textoAzul.innerText = azul;
    actualizarColor(rojo, verde, azul);
});