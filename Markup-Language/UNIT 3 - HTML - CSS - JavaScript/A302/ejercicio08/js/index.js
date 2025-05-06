function cambiarColor() {
  let colores = document.getElementById("color").value;
  let texto = document.getElementById("texto");

  // Según el color seleccionado
  switch(colores) {
    case 'azul':
      texto.style.backgroundColor = "blue";
      texto.style.color = "white";
      break;
    case 'rojo':
      texto.style.backgroundColor = "red";
      texto.style.color = "black";
      break;
    case 'verde':
      texto.style.backgroundColor = "green";
      texto.style.color = "white";
      break;
    case 'blanco':
      texto.style.backgroundColor = "white";
      texto.style.color = "black";
      break;
    case 'negro':
      texto.style.backgroundColor = "black";
      texto.style.color = "white";
      break;
  }
}
