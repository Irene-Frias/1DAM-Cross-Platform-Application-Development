// Seleccionar los botones.
const botonInicioPausa = document.querySelector('#boton-inicio-pausa');
const botonReiniciar = document.querySelector('#boton-reiniciar');

// Variables para almacenar los segundos, minutos y horas.
let [segundos, minutos, horas] = [0, 0, 0];

let intervaloDeTiempo;
let estadoCronometro = 'pausado';

// Actualizar el cronometro.
function actualizarCronometro() {
  segundos++;

  if (segundos / 60 === 1) {
    segundos = 0;
    minutos++;

    if (minutos / 60 === 1) {
      minutos = 0;
      horas++;
    }
  }

  // Agregar un cero a la izquierda si es necesario.
  const segundosConFormato = asignarFormato(segundos);
  const minutosConFormato = asignarFormato(minutos);
  const horasConFormato = asignarFormato(horas);

  // Actualizar el contenido del cronometro.
  const cronometro = document.getElementById('cronometro');
  cronometro.innerText = `${horasConFormato}:${minutosConFormato}:${segundosConFormato}`;
}

// Agregar un cero a la izquierda si se necesita.
function asignarFormato(unidadDeTiempo) {
  return unidadDeTiempo < 10 ? '0' + unidadDeTiempo : unidadDeTiempo;
}

botonInicioPausa.addEventListener('click', function() {
  if (estadoCronometro === 'pausado') {
    intervaloDeTiempo = window.setInterval(actualizarCronometro, 1000);
    document.getElementById('boton-inicio-pausa').innerHTML = `<i class="bi bi-skip-start-fill"></i>`;
    
    botonInicioPausa.classList.remove('iniciar');
    botonInicioPausa.classList.add('pausar');
    
    estadoCronometro = 'andando';
  } else {
    window.clearInterval(intervaloDeTiempo);
    
    document.getElementById('boton-inicio-pausa').innerHTML = `<i class="bi bi-play-fill" id="boton-inicio-pausa"></i>`;
    botonInicioPausa.classList.remove('pausar');
    botonInicioPausa.classList.add('iniciar');
    estadoCronometro = 'pausado';
  }
});

// Reiniciar el cronometro eliminando el intervalo de tiempo,...
botonReiniciar.addEventListener('click', function() {
  // Eliminar el intervalo.
  window.clearInterval(intervaloDeTiempo);

  // Segundos, minutos y horas.
  segundos = 0;
  minutos = 0;
  horas = 0;
  document.getElementById('cronometro').innerHTML = '00:00:00';

  // Botones
  document.getElementById('boton-inicio-pausa').innerHTML = `<i class="bi bi-play-fill" id="inicio"></i>`;
  botonInicioPausa.classList.remove('pausar');
  botonInicioPausa.classList.add('iniciar');

  estadoCronometro = 'pausado';
});