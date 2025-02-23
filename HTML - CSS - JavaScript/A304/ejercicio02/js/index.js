const URL = "https://api.open-meteo.com/v1/forecast?latitude=36.702&longitude=-4.4203&timezone=Europe%2FBerlin&current=temperature_2m,rain,precipitation,wind_speed_10m";

async function actualizar() {
    // Realiza la petición y la promesa al JSON
    let promesa = await fetch(URL);
    let objJson = await promesa.json();
    
    // Rellenar los campos requeridos según los valores del JSON aportados
    document.getElementById("temperatura").innerHTML = objJson.current.temperature_2m;
    document.getElementById("lluvia-actual").innerHTML = objJson.current_units.rain;
    document.getElementById("duracion").innerHTML = objJson.current.precipitation;
    document.getElementById("velocidad-viento").innerHTML = objJson.current.wind_speed_10m;
    document.getElementById("dia-actual").innerHTML = objJson.current.time;
    
    // Visualización por consola
    console.log("Lluvia:", objJson.current.rain);
    console.log("Precipitación:", objJson.current.precipitation);
    console.log("Temperatura:", objJson.current.temperature_2m);
    console.log("Viento:", objJson.current.wind_speed_10m);

    // Cambiar imagen según el tiempo 
    let imagen = "img/default.png";

    if (parseFloat(objJson.current.rain) > 0 || parseFloat(objJson.current.precipitation) > 0) {
        imagen = "img/lluvia.png";  // Si llueve o hay precipitación
    } else if (parseFloat(objJson.current.temperature_2m) > 20) {
        imagen = "img/soleado.png"; // Si hace calor
    } else if (parseFloat(objJson.current.wind_speed_10m) > 25) {
        imagen = "img/viento.png";  // Si hace viento fuerte
    } else if (parseFloat(objJson.current.temperature_2m) < 10) {
        imagen = "img/frio.png";    // Si hace frío
    }    

    // Rellenar el campo con la imagen
    document.getElementById("representacion").src = imagen;
}
actualizar();