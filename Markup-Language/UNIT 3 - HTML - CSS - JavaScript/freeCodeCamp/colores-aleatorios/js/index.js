const boton = document.querySelector('button');
const color = document.getElementById('color');

function generarColorHexAleatorio() {
    let digitos = '0123456789ABCDEF';
    let colorHex = '#';
    
    for (let i = 0; i < 6; i++) {
        // Valores en hexadecimal (16)
        let indiceAleatorio = Math.floor(Math.random() * 16);
        // Introduce el valor en la variable y añade uno
        colorHex += digitos[indiceAleatorio];
    }
    return colorHex;
}

boton.addEventListener('click', function(){
    let colorAleatorio = generarColorHexAleatorio();
    // Actualizar el contenido del texto 
    color.textContent = colorAleatorio;
    // Actualizar el color de fondo
    document.body.style.backgroundColor = colorAleatorio;
});
