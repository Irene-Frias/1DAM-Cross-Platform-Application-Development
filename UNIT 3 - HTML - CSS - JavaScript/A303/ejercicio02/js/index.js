function actualizar() {
    limpiar();
    generarNum();
}

function limpiar() {
    var tabla = document.getElementById("numeros");
    tabla.innerHTML = ""; // Corregido
}

function generarNum() {
    let limite = Number(document.getElementById("limite").value);
    let tabla = document.getElementById("numeros");
    let fila;

    for (let i = 0; i <= limite; i++) {
        if (i % 9 === 0) { // Nueva fila cada 9 números
            fila = document.createElement("tr");
            tabla.appendChild(fila);
        }
        
        let celda = document.createElement("td");
        celda.innerHTML = i;

        // Si el número es primo
        if (esPrimo(i)) {
            celda.classList.add("primo");
        } else if (esPar(i)) {
            celda.classList.add("par");
        } else {
            celda.classList.add("impar");
        }

        fila.appendChild(celda);
    }
}

function esPrimo(numero) {
    if (numero < 2) 
        return false; // 0 y 1 no son primos
    for (let i = 2; i <= Math.sqrt(numero); i++) {  
        if (numero % i === 0) return false;    
    }
    return true;
}

function esPar(numero) {
    return numero % 2 === 0;
}