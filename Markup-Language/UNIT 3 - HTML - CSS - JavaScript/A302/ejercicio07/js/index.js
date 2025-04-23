function enviarFormulario(event) {
    let edadValor = document.getElementById('edad').value;
    // Si hay algo en el campo (no está vacío)
    if (edadValor.length > 0) {
      let edad = Number(edadValor);
      // Si no se puede convertir obtendremos el valor NaN
      if (!isNaN(edad) && edad > 0) {
        document.getElementById("mensajeEdad").innerHTML = "";
        return;
      }
    }
    // Si el campo de la edad no es correcta se muestra un mensaje 
    // y cancelamos el envío
    document.getElementById("mensajeEdad").innerHTML = "La edad debe ser un número entero mayor que cero";
    event.preventDefault();
}