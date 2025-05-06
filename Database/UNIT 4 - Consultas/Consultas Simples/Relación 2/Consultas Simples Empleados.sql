# 1
SELECT id_fab, id_producto, descripcion, precio, ROUND((precio * 0.21), 2) AS 'Precio IVA'
FROM producto;

# 2
SELECT num_pedido, fab, producto, cantidad, importe
FROM pedido;

# 3
SELECT nombre, DATEDIFF(CURDATE(), contrato) AS 'Días Trabajados', YEAR(CURDATE())-edad AS 'Año Nacimiento'
FROM empleado;

# 4
SELECT *
FROM cliente
ORDER BY repclie, nombre;

# 5
SELECT * 
FROM oficina
ORDER BY region, ciudad, oficina desc;

# 6
SELECT * 
FROM pedido
ORDER BY fecha_pedido;

# 7
SELECT * 
FROM pedido
WHERE MONTH(fecha_pedido) = 3;

# 8
SELECT numempl AS 'Empleados con oficina'
FROM empleado
WHERE oficina IS NOT NULL;

# 9
SELECT oficina AS 'Oficinas sin Director'
FROM oficina
WHERE dir IS NULL;

# 10
SELECT * 
FROM oficina
WHERE region LIKE 'Este%'
OR region LIKE 'Norte%'
ORDER BY region desc;

# 11
SELECT *
FROM empleado
WHERE nombre LIKE 'Juan%';

# 12
SELECT *
FROM producto
WHERE id_producto LIKE '%x';

# 13
SELECT AVG(precio) AS 'Precio Medio'
FROM producto;

# 14
SELECT AVG(precio) AS 'Precio Medio'
FROM producto
WHERE existencias > 0;

# 15
SELECT AVG(precio) AS 'Precio Medio Fab(aci y bic)'
FROM producto
WHERE id_fab LIKE 'aci%' OR id_fab LIKE 'bic%' 
AND existencias > 0;

# 16
SELECT COUNT(*) AS 'Número de Oficinas'
FROM oficina;

# 17
SELECT COUNT(*) AS 'Número de Empleados > 150000'
FROM empleado
WHERE ventas > 150000;

# 18
SELECT COUNT(*) AS 'Empleados 101'
FROM cliente
WHERE repclie = 101;

# 19
SELECT MAX(limite_credito) AS 'Mayor crédito'
FROM cliente;

# 20
SELECT MAX(ventas) AS 'Mayor venta', MIN(ventas) AS 'Menor venta'
FROM empleado;

# 21
SELECT SUM(ventas) AS 'Total de ventas'
FROM empleado;

# 22
SELECT SUM(ventas) AS 'Total venta oficina(11, 12)'
FROM oficina
WHERE oficina IN (11, 12);

# 23
SELECT AVG(ventas) AS 'Media ventas', AVG(cuota) AS 'Media cuota'
FROM empleado;

# 24 
SELECT AVG(importe) AS 'Media importe', SUM(importe) AS 'Total importe', AVG(importe / cantidad) AS 'Precio por unidad'
FROM pedido;

# 25
SELECT AVG(precio) AS 'Media precios fab(aci)'
FROM producto
WHERE id_fab LIKE 'aci%';

# 26
SELECT SUM(importe) AS 'Importe total'
FROM pedido
WHERE rep = 105;

# 27
SELECT COUNT(*) AS 'Pedidos > 25000'
FROM pedido
WHERE importe > 25000;

