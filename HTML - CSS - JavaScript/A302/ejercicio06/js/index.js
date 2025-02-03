function enviarFormulario(event) {
    let edadValor = document.getElementById('edad').value;
    // Si el campo tiene algo de valor, es decir está relleno
    if (edadValor.length > 0) {
        let edad = Number(edadValor);
        // Si no se puede convertir obtendremos el valor NaN
        if (!isNaN(edad) && edad > 0) {
        return;
        }
    }
    // Si el campo de la edad no es correcta se muestra un mensaje 
    // y cancelamos el envío
    alert("La edad introducida no es mayor que cero o es un algún otro caracter que no es un número de tipo entero.");
    event.preventDefault();
}