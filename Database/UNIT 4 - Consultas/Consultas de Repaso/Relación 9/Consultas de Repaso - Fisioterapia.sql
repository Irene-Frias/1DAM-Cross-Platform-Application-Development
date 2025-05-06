# 1
SELECT * 
FROM fisioterapeutas
WHERE estado LIKE 'Trabajando';

# 2
SELECT p.nombre, p.apellidos, c.fecha, c.hora
FROM pacientes p
JOIN citas c
USING(id_paciente);

SELECT p.nombre, p.apellidos, c.fecha, c.hora
FROM pacientes p, citas c
WHERE p.id_paciente = c.id_paciente;

# 3
SELECT f.*, p.telefono
FROM fisioterapeutas f
JOIN profesionales p 
ON f.numero_trabajador_fisio = p.numero_trabajador;

SELECT f.*, p.telefono
FROM fisioterapeutas f, profesionales p 
WHERE f.numero_trabajador_fisio = p.numero_trabajador;

# 4
SELECT *
FROM pacientes
WHERE YEAR(CURDATE()) - YEAR(fecha_nacimiento) > 60;

# 5
SELECT * 
FROM citas
ORDER BY fecha ASC, hora ASC;

# 6
SELECT DISTINCT p.nombre
FROM fisioterapeutas f
JOIN profesionales p 
ON f.numero_trabajador_fisio = p.numero_trabajador
JOIN citas c 
ON f.numero_trabajador_fisio = c.numero_trabajador_fisio ;

SELECT DISTINCT p.nombre
FROM fisioterapeutas f, profesionales p, citas c
WHERE f.numero_trabajador_fisio = p.numero_trabajador
AND f.numero_trabajador_fisio = c.numero_trabajador_fisio 
AND c.id_cita IS NOT NULL;

# 7
SELECT p.nombre, c.fecha 
FROM pacientes p, citas c
WHERE p.id_paciente = c.id_paciente;

SELECT p.nombre, c.fecha 
FROM pacientes p
JOIN citas c
USING(id_paciente);

# 8
SELECT p.*, SUM(monto) AS 'Monto'
FROM pacientes p
JOIN pagos pago
USING(id_paciente)
GROUP BY p.id_paciente;

# 9
SELECT f.*, COUNT(*) 
FROM fisioterapeutas f 
JOIN citas c 
ON f.numero_trabajador_fisio = c.numero_trabajador_fisio
GROUP BY f.numero_trabajador_fisio;

# 10
SELECT *
FROM fisioterapeutas f
LEFT JOIN citas c 
ON f.numero_trabajador_fisio = c.numero_trabajador_fisio
WHERE c.id_cita <= 0;

SELECT *
FROM fisioterapeutas f, citas c 
WHERE f.numero_trabajador_fisio = c.numero_trabajador_fisio
AND c.id_cita <= 0;

# 11
SELECT COUNT(*) AS 'Número de citas' 
FROM fisioterapeutas f 
JOIN citas c 
ON f.numero_trabajador_fisio = c.numero_trabajador_fisio;

# 12
SELECT COUNT(*) AS 'Citas del mes'
FROM fisioterapeutas f
JOIN citas c 
ON f.numero_trabajador_fisio = c.numero_trabajador_fisio
WHERE MONTH(c.fecha) = MONTH(CURRENT_DATE());

# 13 
SELECT *
FROM pacientes p
JOIN pagos pago 
USING(id_paciente)
WHERE pago.monto > 200;

SELECT *
FROM pacientes p, pagos pago 
WHERE p.id_paciente = pago.id_paciente
AND pago.monto > 200;

# 14
SELECT SUM(pago.monto) AS 'Cantidad de dinero', pago.metodo_pago
FROM pacientes p
JOIN pagos pago 
USING(id_paciente)
GROUP BY pago.metodo_pago;

SELECT SUM(pago.monto) AS 'Cantidad de dinero', pago.metodo_pago
FROM pacientes p, pagos pago 
WHERE p.id_paciente = pago.id_paciente
GROUP BY pago.metodo_pago;

# 15
SELECT pr.nombre, pr.apellidos, MAX(c.duracion)
FROM fisioterapeutas f
JOIN citas c 
ON f.numero_trabajador_fisio = c.numero_trabajador_fisio
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY pr.nombre, pr.apellidos;

# 16
SELECT p.*
FROM pacientes p 
JOIN pagos pago 
USING(id_paciente)
WHERE pago.monto <= 0;

SELECT p.*
FROM pacientes p, pagos pago 
WHERE p.id_paciente = pago.id_paciente
AND pago.monto <= 0;

# 17 
SELECT pr.*
FROM fisioterapeutas f
JOIN citas c 
ON f.numero_trabajador_fisio = c.numero_trabajador_fisio
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
WHERE c.id_cita >= 1;

SELECT pr.*
FROM fisioterapeutas f, citas c, profesionales pr 
WHERE f.numero_trabajador_fisio = c.numero_trabajador_fisio
AND f.numero_trabajador_fisio = pr.numero_trabajador
AND c.id_cita >= 1;

# 18 
SELECT p.*
FROM pacientes p
JOIN pagos pago 
USING(id_paciente)
WHERE pago.metodo_pago IS NULL
OR pago.fecha_pago IS NULL;

SELECT p.*
FROM pacientes p, pagos pago 
WHERE p.id_paciente = pago.id_paciente
AND pago.metodo_pago IS NULL
OR pago.fecha_pago IS NULL;

# 19 
SELECT pr.*, (TIMESTAMPDIFF(SECOND, f.hora_inicio, f.hora_fin)) AS duracion_segundos
FROM fisioterapeutas f
JOIN profesionales pr
ON f.numero_trabajador_fisio = pr.numero_trabajador;

SELECT pr.*, (TIMESTAMPDIFF(SECOND, f.hora_inicio, f.hora_fin)) AS duracion_segundos
FROM fisioterapeutas f, profesionales pr
WHERE f.numero_trabajador_fisio = pr.numero_trabajador;

# 20 
SELECT p.nombre, p.apellidos, COUNT(*) AS cantidad_citas
FROM pacientes p 
JOIN citas c
USING(id_paciente)
GROUP BY p.nombre, p.apellidos
HAVING cantidad_citas > 3;

SELECT p.nombre, p.apellidos, COUNT(*) AS cantidad_citas
FROM pacientes p, citas c
WHERE p.id_paciente = c.id_paciente
GROUP BY p.nombre, p.apellidos
HAVING cantidad_citas > 3;

# 21
CREATE OR REPLACE VIEW Resumen_Citas AS;
SELECT p.nombre AS 'Paciente', c.fecha, pr.nombre AS 'Fisioterapeuta'
FROM citas c
JOIN fisioterapeutas f 
USING(numero_trabajador_fisio)
JOIN profesionales pr
ON f.numero_trabajador_fisio = pr.numero_trabajador
JOIN pacientes p 
USING(id_paciente);

# 22
CREATE OR REPLACE VIEW Top_Fisioterapeutas AS
SELECT pr.nombre, COUNT(*) AS Cantidad_de_citas
FROM fisioterapeutas f
JOIN citas c
USING(numero_trabajador_fisio)
JOIN profesionales pr
ON f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY f.numero_trabajador_fisio 
HAVING Cantidad_de_citas > 5;

# 23
CREATE OR REPLACE VIEW Resumen_Pagos AS
SELECT p.id_paciente, SUM(pago.monto) AS 'Total pagado'
FROM pacientes p
JOIN pagos pago 
USING(id_paciente)
GROUP BY p.id_paciente;

# 24
CREATE OR REPLACE VIEW Citas_Cortas AS
SELECT *
FROM citas
WHERE duracion < 120;

# 25
CREATE OR REPLACE VIEW Citas_Pendientes AS
SELECT p.*
FROM pacientes p
JOIN pagos pago 
USING(id_paciente)
WHERE pago.monto <= 0
AND pago.fecha_pago = CURRENT_DATE();

# 26 
SELECT pr.*
FROM fisioterapeutas f
JOIN profesionales pr
ON f.numero_trabajador_fisio = pr.numero_trabajador
WHERE f.estado LIKE 'Trabajando';

SELECT pr.*
FROM fisioterapeutas f, profesionales pr
WHERE f.numero_trabajador_fisio = pr.numero_trabajador
AND f.estado LIKE 'Trabajando';

# 27
SELECT nombre, apellidos
FROM pacientes
WHERE YEAR(CURDATE()) - YEAR(fecha_nacimiento) > 50;

# 28
SELECT *
FROM citas
WHERE fecha = CURDATE()
ORDER BY hora ASC;

# 29
SELECT p.*, COUNT(monto) AS 'Cantidad_monto'
FROM pacientes p
JOIN pagos pago
USING(id_paciente)
GROUP BY p.id_paciente
HAVING Cantidad_monto > 2
AND nombre LIKE 'A%';

SELECT p.*, COUNT(monto) AS 'Cantidad_monto'
FROM pacientes p, pagos pago
WHERE p.id_paciente = pago.id_paciente
GROUP BY p.id_paciente
HAVING Cantidad_monto > 2
AND nombre LIKE 'A%';

# 30 
SELECT pr.*
FROM fisioterapeutas f
JOIN profesionales pr
ON f.numero_trabajador_fisio = pr.numero_trabajador
WHERE hora_inicio > '18:00';

SELECT pr.*
FROM fisioterapeutas f, profesionales pr
WHERE f.numero_trabajador_fisio = pr.numero_trabajador
AND hora_inicio > '18:00';

# 31
SELECT p.nombre, MAX(c.fecha)
FROM pacientes p
JOIN citas c
USING(id_paciente)
GROUP BY p.nombre;

SELECT p.nombre, MAX(c.fecha)
FROM pacientes p, citas c
WHERE p.id_paciente = c.id_paciente
GROUP BY p.nombre;

# 32
SELECT pr.nombre, COUNT(*) AS 'Número de citas'
FROM fisioterapeutas f
JOIN citas c
USING(numero_trabajador_fisio)
JOIN profesionales pr
ON f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY pr.nombre;

SELECT pr.nombre, COUNT(*) AS 'Número de citas'
FROM fisioterapeutas f, citas c, profesionales pr
WHERE f.numero_trabajador_fisio = c.numero_trabajador_fisio
AND f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY pr.nombre;

# 33
SELECT pr.nombre, SUM(pago.monto) AS 'Pagos'
FROM fisioterapeutas f
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
JOIN citas c 
ON f.numero_trabajador_fisio = c.numero_trabajador_fisio
JOIN pagos pago 
ON c.id_paciente = pago.id_paciente
GROUP BY pr.nombre;

# 34 
SELECT pr.nombre AS 'Fisioterapeuta', p.nombre AS 'Paciente'
FROM pacientes p
JOIN profesionales pr 
ON pr.numero_trabajador
GROUP BY pr.numero_trabajador, p.nombre;

SELECT pr.nombre AS 'Fisioterapeuta', p.nombre AS 'Paciente'
FROM pacientes p, profesionales pr 
GROUP BY pr.numero_trabajador, p.nombre;

# 35
SELECT pr.nombre AS 'Fisioterapeuta', p.nombre AS 'Paciente'
FROM pacientes p
JOIN citas c 
ON p.id_paciente = c.id_paciente
JOIN fisioterapeutas f 
ON c.numero_trabajador_fisio = f.numero_trabajador_fisio
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY pr.nombre, p.nombre;

# 36
SELECT SUM(pago.monto) AS 'Total pagado'
FROM pacientes p
JOIN pagos pago
USING(id_paciente)
WHERE pago.fecha_pago IS NOT NULL;

SELECT SUM(pago.monto) AS 'Total pagado'
FROM pacientes p, pagos pago
WHERE p.id_paciente = pago.id_paciente
AND pago.fecha_pago IS NOT NULL;

# 37
SELECT AVG(duracion) AS 'Promedio duración'
FROM citas; 

# 38
SELECT p.nombre, SUM(pago.monto)
FROM pagos pago 
JOIN pacientes p
USING(id_paciente)
WHERE pago.fecha_pago IS NOT NULL
GROUP BY p.nombre;

SELECT p.nombre, SUM(pago.monto)
FROM pagos pago, pacientes p
WHERE pago.id_paciente = p.id_paciente
AND pago.fecha_pago IS NOT NULL
GROUP BY p.nombre;

# 39
SELECT pr.especialidad, COUNT(*) AS 'Cantidad por especialidad'
FROM fisioterapeutas f 
JOIN profesionales pr
ON f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY pr.especialidad;

SELECT pr.especialidad, COUNT(*) AS 'Cantidad por especialidad'
FROM fisioterapeutas f, profesionales pr
WHERE f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY pr.especialidad;

# 40
SELECT p.*, pago.monto
FROM pacientes p
JOIN pagos pago 
ON p.id_paciente = pago.id_paciente
WHERE pago.monto = (SELECT MAX(monto) FROM pagos);

SELECT p.*, pago.monto
FROM pacientes p, pagos pago 
WHERE p.id_paciente = pago.id_paciente
AND pago.monto = (SELECT MAX(monto) FROM pagos);

# 41
CREATE OR REPLACE VIEW Resumen_Pacientes AS
SELECT p.nombre
FROM pacientes p
JOIN citas c
USING(id_paciente)
JOIN pagos pago
ON p.id_paciente = pago.id_paciente
WHERE c.fecha IS NOT NULL
AND c.fecha = (SELECT MAX(fecha) FROM citas)
AND pago.monto = (SELECT MAX(monto) FROM pagos)
GROUP BY p.nombre;

# 42
CREATE OR REPLACE VIEW Citas_Proximas AS
SELECT *
FROM citas;

# 43
SELECT p.*, pago.monto
FROM pacientes p, pagos pago 
WHERE p.id_paciente = pago.id_paciente
AND pago.monto = (SELECT AVG(monto) FROM pagos);

# 44
SELECT f.*, COUNT(*) AS 'Cantidad_citas'
FROM fisioterapeutas f 
JOIN citas c 
USING(numero_trabajador_fisio)
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY f.numero_trabajador_fisio;

# 45 
SELECT f.*
FROM fisioterapeutas f 
JOIN citas c 
USING(numero_trabajador_fisio)
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY f.numero_trabajador_fisio
HAVING c.id_cita IS NULL;

# 46
SELECT f.*, COUNT(*) AS 'Cantidad_citas'
FROM fisioterapeutas f 
JOIN citas c 
USING(numero_trabajador_fisio)
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
GROUP BY f.numero_trabajador_fisio
HAVING COUNT(*) > 10;

# 47
SELECT p.*
FROM pacientes p
JOIN pagos pago 
USING(id_paciente)
WHERE metodo_pago = 'Tarjeta';

SELECT p.*
FROM pacientes p, pagos pago 
WHERE p.id_paciente = pago.id_paciente
AND metodo_pago = 'Tarjeta';

# 48

# 49 

# 50

