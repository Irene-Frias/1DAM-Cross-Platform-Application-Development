/*
 *	BD - Jardinería	
*/

# 1
CREATE OR REPLACE VIEW Listin AS
SELECT CONCAT(apellido1, ' ', apellido2, ' ', nombre) AS nombre_completo
FROM empleado;

# 2 
CREATE OR REPLACE VIEW Pedidos_Pendientes AS
SELECT p.codigo_pedido, p.fecha_pedido, cl.nombre_cliente
FROM pedido p
JOIN cliente cl 
USING(codigo_cliente);

# 3
CREATE OR REPLACE VIEW Stock_Bajo AS
SELECT *
FROM producto
WHERE cantidad_en_stock < 25;

# 4
CREATE OR REPLACE VIEW Factura AS
SELECT p.codigo_pedido, SUM(d.cantidad * d.precio_unidad) AS 'Importe Total'
FROM pedido p
JOIN detalle_pedido d 
USING(codigo_pedido)
GROUP BY p.codigo_pedido;

# 5
CREATE OR REPLACE VIEW Cliente_Vip AS
SELECT DISTINCT cl.codigo_cliente
FROM cliente cl 
JOIN pedido p 
USING(codigo_cliente)
WHERE codigo_pedido IN (SELECT codigo_pedido FROM Factura
						WHERE 'Importe Total' > (SELECT AVG('Importe Total') 
												FROM Factura));

# 6
CREATE OR REPLACE VIEW Distribucion AS
SELECT ciudad, COUNT(*) AS 'Número de clientes'
FROM cliente
GROUP BY ciudad;
 
# 7
CREATE OR REPLACE VIEW Pedidos_Cliente AS
SELECT cl.nombre_cliente, (SELECT COUNT(*) FROM pedido
							WHERE codigo_cliente = cl.codigo_cliente)
                            AS 'Números de pedido'
FROM cliente cl;

# 8
CREATE OR REPLACE VIEW Comisiones AS
SELECT e.nombre, sum(cantidad * precio_unidad) * 0.5 as comision
FROM empleado e 
JOIN cliente c
ON e.codigo_empleado = c.codigo_empleado_rep_ventas
JOIN pedido p 
ON c.codigo_cliente = p.codigo_cliente 
JOIN detalle_pedido dp 
ON p.codigo_pedido = dp.codigo_pedido 
GROUP BY e.codigo_empleado;


/*
 *	BD - Proveedores	
*/

# 1
CREATE OR REPLACE VIEW Productos_Baratos AS
SELECT *
FROM articulo
WHERE precio < (SELECT AVG(precio) FROM articulo);

# 2
CREATE OR REPLACE VIEW Rebaja_Primavera AS
SELECT *, (precio * 0.8) AS 'Precio Rebajado'
FROM articulo;

