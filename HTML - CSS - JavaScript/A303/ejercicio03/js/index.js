var operando_guardado = "";
var operando_actual = "";
var operacion = "";

function iniciar() {
    ac();
}

function agregar(numero) {
    if (numero === "." && operando_actual.includes(".")) return; // Evita múltiples puntos decimales
    operando_actual += numero;
    document.getElementById("numero").value = operando_actual;
}

function calcular(op) {
    if (operando_actual === "") return; // Evita errores

    if (operacion === '') {
        operando_guardado = operando_actual;
    } else {
        igual(); // Calcula antes de aplicar nueva operación
    }

    operacion = op;
    operando_actual = "";
}

function igual() {
    if (operando_actual === "") return; // Evita errores si el usuario presiona "=" sin segundo número

    let resultado;
    let num1 = parseFloat(operando_guardado);
    let num2 = parseFloat(operando_actual);

    switch (operacion) {
        case '+': resultado = num1 + num2; break;
        case '-': resultado = num1 - num2; break;
        case '*': resultado = num1 * num2; break;
        case '/': 
            if (num2 === 0) {
                alert("Error: División por cero");
                return ac();
            }
            resultado = num1 / num2; 
            break;
        default: return;
    }

    document.getElementById("numero").value = resultado;
    operando_guardado = resultado;
    operando_actual = "";
    operacion = "";
}

function ac() {
    operando_guardado = "";
    operando_actual = "";
    operacion = "";
    document.getElementById("numero").value = "0";
}