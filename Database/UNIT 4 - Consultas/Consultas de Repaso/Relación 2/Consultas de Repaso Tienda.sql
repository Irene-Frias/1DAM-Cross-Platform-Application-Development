# 1
SELECT nombre AS 'Productos' 
FROM producto;

# 2 
SELECT nombre AS 'Productos', precio 
FROM producto;

# 3
SELECT nombre AS nombre_producto, precio AS Euros, ROUND(precio * 1.14344, 2) AS Dólares	# 'FORMAT' también sirve para redondear 
FROM producto; 

# 4
SELECT UPPER(nombre) AS 'Productos', precio 
FROM producto;

# 5
SELECT LOWER(nombre) AS 'Productos', precio 
FROM producto;

# 6
SELECT nombre, UPPER((substring(nombre, 1, 2))) AS 'Primeros caracteres'	# O 'left(nombre, 2)' se obtiene de la misma forma los caracteres
FROM fabricante;

# 7
SELECT nombre, TRUNCATE(precio, 0) AS 'Precio'
FROM producto;

# 8
SELECT DISTINCT codigo_fabricante
FROM producto
WHERE codigo_fabricante IS NOT NULL;

# 9
SELECT codigo, nombre
FROM producto
GROUP BY codigo;

# 10
SELECT nombre
FROM fabricante
ORDER BY nombre asc;

# 11
SELECT nombre
FROM fabricante
ORDER BY nombre desc;

# 12
SELECT nombre
FROM producto
WHERE codigo_fabricante = '2';

# 13
SELECT nombre
FROM producto
WHERE precio <= '120';

# 14
SELECT nombre
FROM producto
WHERE precio >= '400';

# 15
SELECT nombre
FROM producto
WHERE NOT precio >= '400';

# 16
SELECT *
FROM producto
WHERE precio >= 80 AND precio <= 300;

# 17
SELECT *
FROM producto
WHERE precio BETWEEN 60 AND 200;

# 18
SELECT * 
FROM producto 
WHERE precio > 200 AND codigo_fabricante LIKE '6';

# 19
SELECT *
FROM producto
WHERE codigo_fabricante = '1' OR codigo_fabricante = '3' OR codigo_fabricante = '5';

# 20
SELECT *
FROM producto
WHERE codigo_fabricante IN (2, 4, 6);

# 21
SELECT nombre, round(precio * 100) AS 'Precio en Céntimos'
FROM producto;

# 22
SELECT nombre
FROM fabricante
WHERE nombre LIKE 'S%';

# 23 
SELECT nombre
FROM fabricante
WHERE nombre LIKE '%e';

# 24 
SELECT nombre
FROM fabricante
WHERE nombre LIKE '%w%';

# 25 
SELECT nombre
FROM fabricante
WHERE nombre LIKE '____';

# 26
SELECT nombre
FROM producto
WHERE nombre LIKE '%Portátil%';

# 27
SELECT nombre
FROM producto
WHERE nombre LIKE '%Monitor%' 
AND precio < '215';

# 28
SELECT nombre, precio
FROM producto
WHERE precio >= 180 
ORDER BY precio desc, nombre asc;

# 29
SELECT COUNT(*) AS 'Total de productos'
FROM producto;

# 30
SELECT COUNT(*) AS 'Total de fabricantes'
FROM fabricante;

# 31
SELECT COUNT(*) AS 'Fabricantes'
FROM producto;

# 32
SELECT ROUND(AVG(precio), 2) AS 'Media de precios'
FROM producto;

# 33
SELECT MIN(precio) AS 'Precios más barato'
FROM producto;

# Si además quiero saber el nombre del producto:
SELECT nombre, precio AS 'Precios más barato'
FROM producto
WHERE precio = (SELECT MIN(precio) FROM producto);

# 34
SELECT MAX(precio) AS 'Precios más caro'
FROM producto;

# 35
SELECT SUM(precio) AS 'Precio total'
FROM producto;

# 36
SELECT COUNT(nombre) AS 'Número de productos'
FROM producto
WHERE codigo_fabricante = 1;

# 37
SELECT AVG(precio) AS 'Media de productos Asus'
FROM producto
WHERE nombre LIKE 'Asus';

# 38
SELECT MIN(precio) AS 'Precio más barato'
FROM producto
WHERE nombre LIKE 'Asus';

# 39
SELECT MAX(precio) AS 'Precio más caro'
FROM producto
WHERE nombre LIKE 'Asus';

# 40
SELECT MIN(precio) AS 'Precio mínimo', MAX(precio) AS 'Precio máximo', AVG(precio) AS 'Precio medio', 
COUNT(*) AS 'Número Total Productos' 
FROM producto
WHERE codigo_fabricante = '6';

# 41
SELECT codigo_fabricante, COUNT(*) AS 'Cantidad de productos'
FROM producto
GROUP BY codigo_fabricante
ORDER BY codigo_fabricante desc;

# 42
SELECT codigo_fabricante, MIN(precio) AS 'Precio mínimo', MAX(precio) AS 'Precios máximo', AVG(precio) AS 'Precio medio'
FROM producto
GROUP BY codigo_fabricante;

# 43
SELECT codigo_fabricante, MIN(precio) AS 'Precio mínimo', MAX(precio) AS 'Precios máximo', AVG(precio) AS 'Precio medio', 
COUNT(*) AS 'Número Total Productos' 
FROM producto
GROUP BY codigo_fabricante 
HAVING AVG(precio) > 200;

# 44
SELECT codigo_fabricante, COUNT(*) AS 'Total productos'
FROM producto
WHERE precio >= 180
GROUP BY codigo_fabricante;

# 45
SELECT fabricante.nombre, COUNT(producto.nombre) AS 'Cantidad'
FROM fabricante, producto
WHERE precio >= 220 AND fabricante.codigo = codigo_fabricante
GROUP BY fabricante.nombre 
HAVING cantidad > 1;

# 46
SELECT codigo_fabricante, SUM(precio) AS 'Total de precios'
FROM producto
GROUP BY codigo_fabricante
HAVING SUM(precio) > 100 AND SUM(precio) > 500;

# Si queremos poner el nombre del fabricante en la tabla:  
SELECT codigo_fabricante, SUM(precio) AS 'Total de precios', f.nombre
FROM producto p, fabricante f
WHERE p.codigo_fabricante = f.codigo 
GROUP BY codigo_fabricante
HAVING SUM(precio) > 100 AND SUM(precio) > 500; 

