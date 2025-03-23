var planeta = "";
var gPlaneta = 0; 

var nombresPlanetas = ["Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno", "Plutón"];
var gravedades = [3.7, 8.87, 9.81, 3.71, 24.79, 10.44, 8.69, 11.15, 0.62];

function iniciar() {
    cambiarPlaneta();
}

function cambiarPlaneta() {    
    let planetaSel = document.getElementById("planeta").value;

    if (planetaSel === "seleccionar") {
        planeta = "";
        gPlaneta = 0;
        document.getElementById("imagenPlaneta").src = "";
    } else {
        let indice = Number(planetaSel);
        planeta = nombresPlanetas[indice];
        gPlaneta = gravedades[indice];
        document.getElementById("imagenPlaneta").src = "img/" + planeta.toLowerCase() + ".jpg";
    }
}

function actualizar() {
    let peso = calcularPeso();
    let bloqueError = document.getElementById("error");

    if (!isNaN(peso)) {
        bloqueError.style.display = "none";
        document.getElementById("nombrePlaneta").innerHTML = planeta;
        document.getElementById("tituloPeso").style.display = "inline";
        document.getElementById("pesoObjeto").innerHTML = peso.toFixed(2) + " N";
    } else {
        bloqueError.innerHTML = "La masa no es válida o no has seleccionado un planeta.";
        bloqueError.style.display = "block";
        document.getElementById("tituloPeso").style.display = "none";
        document.getElementById("pesoObjeto").innerHTML = "";
    }
}

function calcularPeso() {
    let masa = document.getElementById("peso").value;
    return masa.length > 0 && !isNaN(Number(masa)) ? Number(masa) * gPlaneta : NaN;
}
