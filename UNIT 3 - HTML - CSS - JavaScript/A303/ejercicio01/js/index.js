function iniciar() {
    console.log("Calculadora lista.");
}

function obtenerOperandos() {
    let op1 = parseFloat(document.getElementById("operando-1").value);
    let op2 = parseFloat(document.getElementById("operando-2").value);
    
    if (isNaN(op1) || isNaN(op2)) {
        alert("Introduce números válidos.");
        return null;
    }

    return { op1, op2 };
}

function mostrarResultado(resultado) {
    document.getElementById("resultado").textContent = resultado;
}

function sumar() {
    let operandos = obtenerOperandos();
    if (operandos) {
        mostrarResultado(operandos.op1 + operandos.op2);
    }
}

function restar() {
    let operandos = obtenerOperandos();
    if (operandos) {
        mostrarResultado(operandos.op1 - operandos.op2);
    }
}

function multiplicar() {
    let operandos = obtenerOperandos();
    if (operandos) {
        mostrarResultado(operandos.op1 * operandos.op2);
    }
}

function dividir() {
    let operandos = obtenerOperandos();
    if (operandos) {
        if (operandos.op2 === 0) {
            alert("No se puede dividir por cero.");
            mostrarResultado("Error, vuelve a intentarlo");
        } else {
            mostrarResultado(operandos.op1 / operandos.op2);
        }
    }
}
