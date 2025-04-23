var contador;

function iniciar(){
    contador = 0;
    mostrarContador();
}

function mostrarContador(){
    // Para usar una clase y buscar por ella querySelectorAll (".class"), 
    // no haría falta 'divs.innerHTML = contador;'
    // Esto muestra los impares dejando los pares con espacios y no visible.    
    // let divs = document.querySelectorAll(".impar"); 
    
    let divs = document.getElementsByTagName("div");
    divs.innerHTML = contador;

    for (let i = 0; i < divs.length; i++) {
        divs[i].textContent = contador;
    }
}

function actualizar(){
    contador++;
    mostrarContador();
}