async function buscar() {
    // Construye la URL incluyendo el texto de búsqueda
    let textoBusqueda = document.getElementById("busqueda").value;
    let url = "https://www.omdbapi.com/?t=" + textoBusqueda + "&apikey=6bd47da3";

    // Realiza la petición y la promesa al JSON
    let promesa = await fetch(url);
    let objJson = await promesa.json();
    
    // Rellenar los campos con los valores del JSON
    if (objJson.Response == "True") {
        document.getElementById("titulo").innerHTML = objJson.Title;
        document.getElementById("anyo").innerHTML = objJson.Year;
        document.getElementById("duracion").innerHTML = objJson.Runtime;
        document.getElementById("poster").src = objJson.Poster;
    } else {
        document.getElementById("titulo").innerHTML = "Error, título no encontrado";
        document.getElementById("anyo").innerHTML = " ";
        document.getElementById("duracion").innerHTML = " ";
    }
}
buscar();