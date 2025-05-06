 USE jardineria;

# CONSULTA 1
SELECT cl.codigo_cliente, cl.nombre_cliente, p.codigo_pedido
FROM cliente cl, pedido p
WHERE cl.codigo_cliente = p.codigo_cliente
AND cl.nombre_cliente LIKE 'Emmanuel';

SELECT cl.codigo_cliente, cl.nombre_cliente, p.codigo_pedido
FROM cliente cl
JOIN pedido p
USING(codigo_cliente)
WHERE cl.nombre_cliente LIKE 'Emmanuel';


# CONSULTA 2
SELECT e.nombre, COUNT(*) AS 'Pedidos'
FROM empleado e, pedido p
WHERE e.codigo_empleado = p.codigo_pedido
GROUP BY e.nombre
ORDER BY p.codigo_pedido ASC;

SELECT e.nombre, p.codigo_pedido
FROM empleado e
JOIN pedido p
ON e.codigo_empleado = p.codigo_pedido
ORDER BY p.codigo_pedido ASC;


# CONSULTA 3
SELECT DISTINCT cl.nombre_cliente
FROM cliente cl, pedido p
WHERE cl.codigo_cliente = p.codigo_cliente
AND p.codigo_pedido > 0
ORDER BY cl.nombre_cliente;

SELECT DISTINCT cl.nombre_cliente
FROM cliente cl
JOIN pedido p
ON cl.codigo_cliente = p.codigo_cliente
WHERE p.codigo_pedido > 0
ORDER BY cl.nombre_cliente;


# CONSULTA 4 
SELECT p.*, SUM(d.cantidad * d.precio_unidad) AS 'Importe Total'
FROM cliente cl, pedido p, detalle_pedido d
WHERE cl.codigo_cliente = p.codigo_cliente
AND p.codigo_pedido = d.codigo_pedido
AND cl.nombre_cliente LIKE 'Beragua'
GROUP BY p.codigo_pedido
ORDER BY p.codigo_pedido;

SELECT p.*, SUM(d.cantidad * d.precio_unidad) AS 'Importe Total'
FROM pedido p
JOIN cliente cl
ON cl.codigo_cliente = p.codigo_cliente
JOIN detalle_pedido d
ON p.codigo_pedido = d.codigo_pedido
AND cl.nombre_cliente LIKE 'Beragua'
GROUP BY p.codigo_pedido
ORDER BY p.codigo_pedido;


# CONSULTA 5 
SELECT p.codigo_pedido, SUM(d.cantidad * d.precio_unidad) AS 'Importe Total'
FROM pedido p, detalle_pedido d
WHERE p.codigo_pedido = d.codigo_pedido
AND p.codigo_pedido BETWEEN 10 AND 15
GROUP BY p.codigo_pedido
ORDER BY p.codigo_pedido;

SELECT p.codigo_pedido, SUM(d.cantidad * d.precio_unidad) AS 'Importe Total'
FROM pedido p
JOIN detalle_pedido d
ON p.codigo_pedido = d.codigo_pedido
WHERE p.codigo_pedido BETWEEN 10 AND 15
GROUP BY p.codigo_pedido
ORDER BY p.codigo_pedido;

SELECT codigo_pedido, SUM(cantidad * precio_unidad) AS 'Importe Total'
FROM detalle_pedido
WHERE codigo_pedido BETWEEN 10 AND 15
GROUP BY codigo_pedido
ORDER BY codigo_pedido;


# CONSULTA 6
SELECT MAX(importes.importe) AS 'Mayor Importe', MIN(importes.importe) AS 'Menor Importe'
FROM (SELECT SUM(d.cantidad * d.precio_unidad) AS 'Importe'
	  FROM detalle_pedido d
      GROUP BY codigo_pedido) AS Importes;


# CONSULTA 7
SELECT p.nombre, d.cantidad 
FROM producto p, detalle_pedido d
WHERE p.codigo_producto = d.codigo_producto
AND d.cantidad > 100
ORDER BY d.precio_unidad;

SELECT p.nombre, d.cantidad 
FROM producto p
JOIN detalle_pedido d
ON p.codigo_producto = d.codigo_producto
WHERE d.cantidad > 100
ORDER BY d.precio_unidad;


# CONSULTA 8
SELECT cl.nombre_cliente, SUM(d.cantidad * d.precio_unidad) AS 'Importe Total del Cliente'
FROM cliente cl, pedido p, detalle_pedido d
WHERE cl.codigo_cliente = p.codigo_cliente
AND p.codigo_pedido = d.codigo_pedido
GROUP BY cl.nombre_cliente
ORDER BY cl.nombre_cliente;

SELECT cl.nombre_cliente, SUM(d.cantidad * d.precio_unidad) AS 'Importe Total del Cliente'
FROM pedido p
JOIN cliente cl
ON cl.codigo_cliente = p.codigo_cliente
JOIN detalle_pedido d
ON p.codigo_pedido = d.codigo_pedido
GROUP BY cl.nombre_cliente
ORDER BY cl.nombre_cliente;


# CONSULTA 9
SELECT nombre, precio_venta
FROM producto 
WHERE precio_venta = (SELECT MAX(precio_venta) FROM producto);


# CONSULTA 10
SELECT cl.nombre_cliente, p.codigo_pedido, (d.cantidad * d.precio_unidad) AS 'Importe Total', ROUND(((d.cantidad * d.precio_unidad) * 0.21),2) AS '21% IVA', 
ROUND(((d.cantidad * d.precio_unidad) + (d.cantidad * d.precio_unidad) * 0.21),2) AS 'Importe con IVA'
FROM cliente cl, pedido p, detalle_pedido d
WHERE cl.codigo_cliente = p.codigo_cliente
AND p.codigo_pedido = d.codigo_pedido
AND p.codigo_pedido IN (9, 10, 12, 14);

SELECT cl.nombre_cliente, p.codigo_pedido, (d.cantidad * d.precio_unidad) AS 'Importe Total', ROUND(((d.cantidad * d.precio_unidad) * 0.21),2) AS '21% IVA', 
ROUND(((d.cantidad * d.precio_unidad) + (d.cantidad * d.precio_unidad) * 0.21),2) AS 'Importe con IVA'
FROM pedido p
JOIN cliente cl
ON cl.codigo_cliente = p.codigo_cliente
JOIN detalle_pedido d
ON p.codigo_pedido = d.codigo_pedido
AND p.codigo_pedido IN (9, 10, 12, 14);


# CONSULTA 11
SELECT o.codigo_oficina, COUNT(*) AS 'Cantidad de pedidos pendientes'
FROM oficina o, cliente cl, empleado e, pedido p
WHERE o.codigo_oficina = e.codigo_oficina
AND e.codigo_empleado = cl.codigo_empleado_rep_ventas
AND cl.codigo_cliente = p.codigo_cliente
AND p.estado LIKE 'Pendiente'
GROUP BY o.codigo_oficina
ORDER BY COUNT(*) DESC;

SELECT o.codigo_oficina, COUNT(*) AS 'Cantidad de pedidos pendientes'
FROM oficina o
JOIN empleado e
ON o.codigo_oficina = e.codigo_oficina
JOIN cliente cl
ON e.codigo_empleado = cl.codigo_empleado_rep_ventas
JOIN pedido p
ON cl.codigo_cliente = p.codigo_cliente
AND p.estado LIKE 'Pendiente'
GROUP BY o.codigo_oficina
ORDER BY COUNT(*) DESC;

