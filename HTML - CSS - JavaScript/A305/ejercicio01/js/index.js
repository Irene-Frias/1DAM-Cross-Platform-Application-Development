async function buscar() {
    // Realiza la petición y la promesa al JSON
    let textoBusqueda = document.getElementById("busqueda").value;
    let url = "https://pokeapi.co/api/v2/pokemon/" + textoBusqueda;
    
    try {
        let promesa = await fetch(url);
        let objJson = await promesa.json();

        // Rellenar los campos requeridos según los valores del JSON aportados
        document.getElementById("nombre").innerHTML = objJson.name; 
        document.getElementById("representacion").src = objJson.sprites.front_default;
        document.getElementById("altura").innerHTML = objJson.height;
        document.getElementById("peso").innerHTML = objJson.weight;
        
        // Cambiar imagen según el peso del Pokémon
        let fondo = document.getElementById("peso").style.backgroundColor = "red";

        if (parseFloat(objJson.weight) <= 50) {
            fondo = document.getElementById("peso").style.backgroundColor = "green";  
        } else {
            fondo = document.getElementById("peso").style.backgroundColor = "red"; 
        } 

        // Visualización por consola
        console.log("Nombre:", objJson.name);
        console.log("Imagen:", objJson.sprites.front_default);
        console.log("Altura:", objJson.height);
        console.log("Peso:", objJson.weight);

        document.getElementById("mesg-error").innerHTML = "";

    } catch (error) {
        document.getElementById("mesg-error").innerHTML = "Error!! El pokémon no es encontrado";
        document.getElementById("nombre").innerHTML = "";
        document.getElementById("representacion").src = "";
        document.getElementById("altura").innerHTML = "";
        document.getElementById("peso").innerHTML = "";
        document.getElementById("peso").style.backgroundColor = "";
    }
}
