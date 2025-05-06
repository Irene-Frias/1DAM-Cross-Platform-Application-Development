USE cuidatucuerpo;

# CONSULTA 1
SELECT * 
FROM cliente;


# CONSULTA 2
SELECT nombre, stock
FROM productos
WHERE stock < 50 
ORDER BY stock ASC;


# CONSULTA 3
SELECT nombre, apellidos, hora_inicio, hora_fin
FROM profesionales
WHERE hora_inicio >= '15:00';


# CONSULTA 4
SELECT *
FROM cliente
WHERE baja LIKE 'si'
AND descuento > 40;


# CONSULTA 5
SELECT c.fecha, c.hora, cl.nombre, cl.apellidos, f.numero_trabajador_fisio
FROM cita c 
JOIN fisioterapeuta f 
ON c.numero_fisio = f.numero_trabajador_fisio
JOIN cliente cl 
ON cl.DNI = c.DNI_cliente
WHERE c.a_domicilio LIKE 'si'
ORDER BY c.fecha ASC, c.hora ASC;

SELECT c.fecha, c.hora, cl.nombre, cl.apellidos, f.numero_trabajador_fisio
FROM cita c, fisioterapeuta f, cliente cl 
WHERE c.numero_fisio = f.numero_trabajador_fisio
AND cl.DNI = c.DNI_cliente
AND c.a_domicilio LIKE 'si'
ORDER BY c.fecha ASC, c.hora ASC;


# CONSULTA 6
SELECT nombre, precio
FROM productos
WHERE precio >= (SELECT MAX(precio) FROM productos)
UNION
SELECT nombre, precio
FROM productos
WHERE precio <= (SELECT MIN(precio) FROM productos);


# CONSULTA 7
SELECT pr.estado, COUNT(*) AS 'Cantidad de profesores'
FROM profesor_pilates p
JOIN profesionales pr
ON p.numero_trabajador_pilates = pr.numero_trabajador
GROUP BY pr.estado;

SELECT pr.estado, COUNT(*) AS 'Cantidad de profesores'
FROM profesor_pilates p, profesionales pr
WHERE p.numero_trabajador_pilates = pr.numero_trabajador
GROUP BY pr.estado;


# CONSULTA 8
SELECT MONTHNAME((fecha)) AS 'Mes', COUNT(*) AS 'Citas 22'
FROM cita
WHERE YEAR(fecha) = '2022'
GROUP BY Mes
HAVING COUNT(*) >= 1
ORDER BY COUNT(*) DESC;


# CONSULTA 9
SELECT numero_fisio, fecha, precio
FROM cita
WHERE DNI_cliente LIKE '27256987J';


# CONSULTA 10
SELECT DATE_FORMAT(c.fecha, '%d/%m/%y') AS 'Fecha', c.hora
FROM fisioterapeuta f
JOIN cita c
ON f.numero_trabajador_fisio = c.numero_fisio
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
WHERE NOT (hora_inicio > hora_fin AND hora_fin < hora_inicio);

SELECT DATE_FORMAT(c.fecha, '%d/%m/%y') AS 'Fecha', c.hora
FROM cita c, fisioterapeuta f, profesionales pr
WHERE c.numero_fisio = f.numero_trabajador_fisio
AND pr.numero_trabajador = f.numero_trabajador_fisio
AND NOT (pr.hora_inicio > c.hora AND pr.hora_fin < c.hora);


# CONSULTA 11
SELECT DISTINCT c.fecha, cl.nombre, cl.apellidos
FROM cita c
JOIN cliente cl
ON c.DNI_cliente = cl.DNI
WHERE LAST_DAY(c.fecha)
ORDER BY LAST_DAY(c.fecha);

SELECT DISTINCT c.fecha, cl.nombre, cl.apellidos
FROM cita c, cliente cl
WHERE c.DNI_cliente = cl.DNI
AND LAST_DAY(c.fecha)
ORDER BY LAST_DAY(c.fecha);


# CONSULTA 12
SELECT pr.nombre, pr.apellidos, pr.estado, COUNT(*) AS 'Clases'
FROM profesor_pilates p
JOIN profesionales pr
ON p.numero_trabajador_pilates = pr.numero_trabajador
WHERE pr.estado NOT IN ('Despedido', 'Ausente')
GROUP BY p.numero_trabajador_pilates 
ORDER BY Clases;

SELECT pr.nombre, pr.apellidos, COUNT(*) 'Clases'
FROM profesor_pilates p, profesionales pr
WHERE p.numero_trabajador_pilates = pr.numero_trabajador
AND pr.estado NOT IN ('Despedido', 'Ausente')
GROUP BY p.numero_trabajador_pilates 
ORDER BY Clases;


# CONSULTA 13
SELECT p.nombre, SUM(v.cantidad) AS 'Total vendido'
FROM productos p
JOIN venden v
ON p.id = v.id_producto
GROUP BY p.nombre;

SELECT p.nombre, SUM(v.cantidad) AS 'Total vendido'
FROM productos p, venden v
WHERE p.id = v.id_producto
GROUP BY p.nombre;


# CONSULTA 14
SELECT pr.nombre, pr.apellidos, pr.telefono
FROM fisioterapeuta f
JOIN profesionales pr 
ON f.numero_trabajador_fisio = pr.numero_trabajador
WHERE estado LIKE 'Trabajando'
AND TIMESTAMPDIFF(HOUR, hora_inicio, hora_fin) < 5;

SELECT pr.nombre, pr.apellidos, pr.telefono
FROM fisioterapeuta f, profesionales pr 
WHERE f.numero_trabajador_fisio = pr.numero_trabajador
AND estado LIKE 'Trabajando'
AND TIMESTAMPDIFF(HOUR, hora_inicio, hora_fin) < 5;


# CONSULTA 15
SELECT s.nombre, i.fecha, i.hora, COUNT(*) AS 'Numero de profesor'
FROM imparte i
JOIN salas s
ON i.codigo_sala = s.codigo 
GROUP BY s.nombre, i.fecha, i.hora; 

SELECT s.nombre, i.fecha, i.hora, COUNT(*) AS 'Numero de profesor'
FROM imparte i, salas s
WHERE i.codigo_sala = s.codigo 
GROUP BY s.nombre, i.fecha, i.hora; 


# CONSULTA 16
SELECT c.numero_fisio, ROUND(AVG(precio), 2) AS 'Precio Medio 2022'
FROM cita c
JOIN profesionales p
ON c.numero_fisio = p.numero_trabajador
WHERE p.estado LIKE 'Trabajando'
AND YEAR(fecha) = 2022
GROUP BY c.numero_fisio;

SELECT c.numero_fisio, ROUND(AVG(precio), 2) AS 'Precio Medio 2022'
FROM cita c, profesionales p
WHERE c.numero_fisio = p.numero_trabajador
AND p.estado LIKE 'Trabajando'
AND YEAR(fecha) = 2022
GROUP BY c.numero_fisio;


# CONSULTA 17
SELECT s.nombre, pr.nombre, pr.apellidos, COUNT(*) AS 'Veces'
FROM salas s
JOIN imparte i  
ON s.codigo = i.codigo_sala
JOIN profesor_pilates p
ON p.numero_trabajador_pilates = i.numero_trabajador_pilates
JOIN profesionales pr 
ON p.numero_trabajador_pilates = pr.numero_trabajador
GROUP BY i.numero_trabajador_pilates, s.nombre
HAVING veces >= 2;

SELECT s.nombre, pr.nombre, pr.apellidos, COUNT(*) AS 'Veces'
FROM salas s, profesor_pilates p, imparte i, profesionales pr
WHERE s.codigo = i.codigo_sala
AND p.numero_trabajador_pilates = i.numero_trabajador_pilates
AND p.numero_trabajador_pilates = pr.numero_trabajador
GROUP BY i.numero_trabajador_pilates, s.nombre
HAVING veces >= 2;


# CONSULTA 18
SELECT cl.DNI, cl.nombre, SUM(precio) AS total_gastado
FROM cliente cl
JOIN cita c 
ON cl.DNI = c.DNI_cliente
GROUP BY cl.DNI
HAVING total_gastado > (SELECT AVG(precio) FROM cita);

SELECT cl.DNI, cl.nombre, SUM(precio) AS total_gastado
FROM cliente cl, cita c 
WHERE cl.DNI = c.DNI_cliente
GROUP BY cl.DNI
HAVING total_gastado > (SELECT AVG(precio) FROM cita);

