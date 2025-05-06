# 1
SELECT codigo, localidad 
FROM oficinas;

# 2
SELECT nombre, fNacimiento
FROM comerciales
WHERE hijos >= 1;

# 3
SELECT nombre, descripcion, precio
FROM productos
WHERE precio < 50;

# 4
SELECT *
FROM vehiculos
ORDER BY nKilometros DESC;

# 5
SELECT nombre, descripcion
FROM productos
WHERE descuento NOT IN (0, 10, 15)
ORDER BY referencia ASC;

# 6
SELECT nombre
FROM comerciales
WHERE salario >= 1100 AND hijos >= 1
ORDER BY nombre ASC;

# 7
SELECT nombre, descripcion
FROM productos
WHERE referencia LIKE 'CC%' AND descripcion LIKE '%Color%';

# 8
SELECT COUNT(*) AS 'Total de productos'
FROM productos;

# 9 
SELECT nombre, salario, ((salario * 0.2) + salario) AS 'Añadiendo 20%'
FROM comerciales
WHERE codigo IN (111, 333, 777);

# 10
SELECT nombre, descripcion, ROUND(precio - (precio * descuento / 100), 2) AS 'Descuento'
FROM productos
ORDER BY precio ASC;

# 11
SELECT marca, COUNT(*) AS 'Vehículos'
FROM vehiculos
GROUP BY marca;

# 12
SELECT hijos, MAX(salario) AS 'Salario Máximo',
MIN(salario) AS 'Salario Mínimo', AVG(salario) AS 'Media del salario'
FROM comerciales
GROUP BY hijos
ORDER BY hijos ASC;
 
# 13 
SELECT c.nombre, o.direccion, o.localidad
FROM comerciales c, oficinas o
WHERE c.codOficina = o.codigo
AND c.fNacimiento > '1971-01-01'
ORDER BY o.provincia ASC;

SELECT c.nombre, o.direccion, o.localidad
FROM comerciales c
JOIN oficinas o
ON c.codOficina = o.codigo
WHERE c.fNacimiento > '1971-01-01'
ORDER BY o.provincia ASC;

# 14 
SELECT c.codigo, c.nombre, SUM(v.cantidad) AS 'Comercial'
FROM comerciales c, vender v
WHERE c.codigo = v.codComercial
GROUP BY c.codigo
HAVING SUM(v.cantidad) BETWEEN 125 AND 175
ORDER BY c.nombre;

SELECT c.codigo, c.nombre, SUM(v.cantidad) AS 'Agrupados por comercial'
FROM comerciales c
JOIN vender v
ON c.codigo = v.codComercial
GROUP BY c.codigo
HAVING SUM(v.cantidad) BETWEEN 125 AND 175
ORDER BY c.nombre;

# 15
SELECT c.nombre, v.matricula
FROM comerciales c, vehiculos v
WHERE c.vehiculoAsig = v.matricula
AND TIMESTAMPDIFF(YEAR, v.fRevision, CURDATE()) >= 6;

SELECT c.nombre, v.matricula
FROM comerciales c
JOIN vehiculos v ON c.vehiculoAsig = v.matricula
WHERE TIMESTAMPDIFF(YEAR, v.fRevision, CURDATE()) >= 6;

# 16 
SELECT c.nombre AS 'Nombre Comercial', 
       MAX(p.precio) AS 'Precio Máximo', 
       MIN(p.precio) AS 'Precio Mínimo'
FROM comerciales c
JOIN vender v ON c.codigo = v.codComercial
JOIN productos p ON v.refProducto = p.referencia
GROUP BY c.nombre
HAVING (MAX(p.precio) - MIN(p.precio)) > 50;

# 17
SELECT c.nombre, DATE_FORMAT(v.fecha, '%e %M %Y') AS 'Fecha de venta'
FROM comerciales c, vender v
WHERE c.codigo = v.codComercial
AND YEAR(v.fecha) = 2011 AND MONTH(v.fecha) BETWEEN 1 AND 3;

SET lc_time_names = "es_ES";		# Cambia de inglés a español (hasta el cierre de sesión)
SELECT c.nombre, DATE_FORMAT(v.fecha, '%e %M %Y') AS 'Fecha de venta'
FROM comerciales c
JOIN vender v
ON c.codigo = v.codComercial
WHERE YEAR(v.fecha) = 2011 AND MONTH(v.fecha) BETWEEN 1 AND 3;

# 18
SELECT nombre, salario
FROM comerciales 
WHERE salario = (SELECT MAX(salario) FROM comerciales)
   OR salario = (SELECT MIN(salario) FROM comerciales);

# 19
SELECT c.nombre, SUM(v.cantidad) AS 'Cantidad Vendida'
FROM vender v, comerciales c
WHERE v.codComercial = c.codigo
AND c.fNacimiento = (SELECT MAX(fNacimiento) FROM comerciales)
GROUP BY c.nombre;

SELECT c.nombre, SUM(v.cantidad) AS 'Cantidad Vendida'
FROM vender v
JOIN comerciales c
ON v.codComercial = c.codigo
WHERE c.fNacimiento = (SELECT MAX(fNacimiento) FROM comerciales)
GROUP BY c.nombre;

# 20
SELECT c.nombre, SUM(p.precio * v.cantidad) AS 'Cantidad Vendida', c.codOficina
FROM comerciales c
JOIN vender v ON c.codigo = v.codComercial
JOIN productos p ON v.refProducto = p.referencia
WHERE c.codOficina IN (
    SELECT o.codigo FROM oficinas o
    JOIN comerciales c2 ON o.codigo = c2.codOficina
    GROUP BY o.codigo
    HAVING COUNT(*) > 1
)
GROUP BY c.codigo, c.nombre, c.codOficina
ORDER BY 'Cantidad Vendida' DESC;

