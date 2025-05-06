# 1
SELECT DATE(v.fecha_hora) AS 'Fecha cliente'
FROM venta v
WHERE v.nif_cliente IN (SELECT c.nif FROM cliente c
						WHERE c.nombre LIKE 'Manolo' 
						AND c.apellidos LIKE 'Montoro');

SELECT DATE(v.fecha_hora) AS 'Fecha cliente' 
FROM cliente c, venta v
WHERE v.nif_cliente = c.nif 
AND c.nombre LIKE 'Manolo' 
AND c.apellidos LIKE 'Montoro';

# 2 
SELECT v.* 
FROM venta v
WHERE YEAR(v.fecha_hora) < 2000
ORDER BY v.fecha_hora; 

SELECT v.*
FROM venta v
WHERE YEAR(v.fecha_hora) IN (SELECT YEAR(v.fecha_hora)
							 WHERE YEAR(v.fecha_hora) < 2000);

# 3
SELECT c.direccion 
FROM cliente c
WHERE 1 < COUNT(*);

SELECT c.direccion 
FROM cliente c
WHERE 1 < (SELECT COUNT(*) FROM cliente cl
           WHERE cl.direccion = c.direccion);
           
# 4
SELECT m.fabricante, COUNT(*) AS 'Motos vendidas'
FROM venta v JOIN modelo m
ON v.bastidor_modelo = m.bastidor
GROUP BY m.fabricante;

SELECT m.fabricante, COUNT(*) AS 'Motos vendidas'
from modelo m
WHERE m.bastidor in (SELECT v.bastidor_modelo
					 FROM venta v)
GROUP BY m.fabricante;

# 5
SELECT c.apellidos, c.nombre
FROM modelo m, venta v, cliente c
WHERE v.bastidor_modelo = m.bastidor
AND v.nif_cliente = c.nif
AND m.tipo LIKE 'Scooter';

# 6
SELECT co.*
FROM comercial co
WHERE co.nif in (SELECT cl.nif
				 FROM cliente cl);

# 7
SELECT AVG(m.precio) AS 'Precio Medio'
FROM modelo m, venta v
WHERE v.bastidor_modelo = m.bastidor
AND m.tipo LIKE 'Scooter';

SELECT AVG(m.precio) AS 'Precio Medio'
FROM modelo m
WHERE m.tipo LIKE 'Scooter'
AND m.bastidor IN (SELECT v.bastidor_modelo FROM venta v);

# 8
SELECT DISTINCT m.*
FROM modelo m
WHERE m.precio > (SELECT AVG(precio) FROM modelo);

# 9
SELECT m.*
FROM modelo m
WHERE m.bastidor IN (SELECT m.bastidor FROM modelo m
					WHERE m.fabricante LIKE 'KTM');

# 10
SELECT m.*
FROM modelo m
WHERE m.bastidor IN (SELECT m.bastidor FROM modelo m
					WHERE m.fabricante LIKE 'KTM');

# 11
SELECT DISTINCT DATE(v.fecha_hora) AS 'Día'
FROM venta v
WHERE 1 < (SELECT COUNT(*) FROM venta ve
           WHERE v.fecha_hora = ve.fecha_hora);

