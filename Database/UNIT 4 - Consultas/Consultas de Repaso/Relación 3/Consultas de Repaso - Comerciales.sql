# 1
SELECT codigo, localidad
FROM oficinas;

# 2
SELECT nombre, fNacimiento
FROM comerciales
WHERE hijos >= 1;

# 3
SELECT nombre, descripcion
FROM productos
WHERE precio < 50;

# 4
SELECT * 
FROM vehiculos
ORDER BY nKilometros DESC;

# 5
SELECT referencia, nombre, descripcion
FROM productos
WHERE descuento NOT IN (0, 10, 15);

# 6
SELECT nombre
FROM comerciales
WHERE salario >= 1100 
AND hijos >= 1
ORDER BY nombre ASC;

# 7
SELECT nombre, descripcion
FROM productos
WHERE referencia LIKE 'CC%'
AND descripcion LIKE '%Color%';

# 8
SELECT COUNT(*) AS 'Total de productos'
FROM productos;

### 9
SELECT nombre, salario, (salario * 0.8) AS '20% más al salario'
FROM comerciales
WHERE codigo IN (111, 333, 777);

# 10
SELECT nombre, descripcion, (precio + descuento) AS 'Con descuento'
FROM productos
ORDER BY precio ASC;

# 11
SELECT marca, COUNT(*) AS 'Cantidad de vehículos'
FROM vehiculos
GROUP BY marca;

# 12
SELECT hijos, MAX(salario) AS 'Salario Máximo', MIN(salario) AS 'Salario Mínimo',
AVG(salario) AS 'Salario Medio'
FROM comerciales
GROUP BY hijos
ORDER BY hijos ASC;

# 13
SELECT c.nombre, o.direccion, o.localidad, c.*
FROM comerciales c, oficinas o 
WHERE c.codOficina = o.codigo
AND c.fNacimiento > '1971-01-01'
ORDER BY o.provincia ASC;

SELECT c.nombre, o.direccion, o.localidad, c.*
FROM comerciales c
JOIN oficinas o 
ON c.codOficina = o.codigo
WHERE c.fNacimiento > '1971-01-01'
ORDER BY o.provincia ASC;

# 14
SELECT c.codigo, c.nombre
FROM comerciales c, vender v 
WHERE c.codigo = v.codComercial
GROUP BY v.codComercial
HAVING SUM(v.cantidad) BETWEEN 125 AND 175;

SELECT c.codigo, c.nombre
FROM comerciales c
JOIN vender v 
ON c.codigo = v.codComercial
GROUP BY v.codComercial
HAVING SUM(v.cantidad) BETWEEN 125 AND 175;

# 15
SELECT c.nombre, v.matricula
FROM comerciales c, vehiculos v
WHERE c.vehiculoAsig = v.matricula
AND TIMESTAMPDIFF(YEAR, v.fRevision, CURDATE()) >= 6;

SELECT c.nombre, v.matricula
FROM comerciales c
JOIN vehiculos v ON c.vehiculoAsig = v.matricula
WHERE TIMESTAMPDIFF(YEAR, v.fRevision, CURDATE()) >= 6;

###### 16
SELECT p.nombre, MAX(v.precio) AS 'Precio Máximo', MIN(v.precio) AS 'Precio Mínimo'
FROM productos p, vender v 
WHERE p.referencia = v.refProducto
GROUP BY p.nombre
HAVING (MAX(v.precio) - MIN(v.precio)) > 50;

SELECT p.nombre, MAX(v.precio) AS 'Precio Máximo', MIN(v.precio) AS 'Precio Mínimo'
FROM productos p, vender v
WHERE p.referencia = v.refProducto
GROUP BY p.nombre
HAVING (MAX(v.precio) - MIN(v.precio)) > 50;

# 17
SELECT c.nombre, DATE_FORMAT(v.fecha, '%d/%m/%y') AS 'Fecha de venta'
FROM comerciales c, vender v 
WHERE c.codigo = v.codComercial
AND YEAR(v.fecha) = 2011 
AND MONTH(v.fecha) BETWEEN 1 AND 3;

SELECT c.nombre, DATE_FORMAT(v.fecha, '%d/%m/%y') AS 'Fecha de venta'
FROM comerciales c
JOIN vender v 
ON c.codigo = v.codComercial
WHERE YEAR(v.fecha) = 2011 
AND MONTH(v.fecha) BETWEEN 1 AND 3;

# 18
SELECT nombre, salario
FROM comerciales
WHERE salario = (SELECT MAX(salario) FROM comerciales)
   OR salario = (SELECT MIN(salario) FROM comerciales);

# 19
SELECT c.nombre, SUM(cantidad) AS 'Cantidad Total'
FROM comerciales c, vender v
WHERE c.codigo = v.codComercial 
AND c.fNacimiento = (SELECT MAX(fNacimiento) FROM comerciales)
GROUP BY c.nombre ASC;

SELECT c.nombre, SUM(cantidad) AS 'Cantidad Total'
FROM comerciales c
JOIN vender v
ON c.codigo = v.codComercial 
WHERE c.fNacimiento = (SELECT MAX(fNacimiento) FROM comerciales)
GROUP BY c.nombre ASC;

# 20
SELECT c.nombre, o.*
FROM vender v, comerciales c, oficinas o
WHERE v.codComercial = c.codigo
AND c.codOficina = o.codigo
GROUP BY c.nombre; 
