# 1
CREATE TABLE nempleado 
SELECT *
FROM empleado; 

# 2
CREATE TABLE noficina 
SELECT *
FROM oficina; 

# 3
CREATE TABLE nproducto 
SELECT *
FROM producto; 

# 4
CREATE TABLE npedido 
SELECT *
FROM pedido; 

# 5
UPDATE producto SET precio = precio * 0.5
WHERE id_fab LIKE 'ACI';

# 6
INSERT INTO oficina (oficina, ciudad, region, dir, objetivo, ventas) VALUES ('30', 'Madrid', 'Centro', NULL, '100000', '0');

# 7
UPDATE empleado SET oficina = 30
WHERE oficina = 21;

# 8
DELETE FROM pedido 
WHERE rep = 105;

# 9 
DELETE FROM oficina
WHERE oficina NOT IN (SELECT oficina FROM empleado
					  WHERE oficina IS NOT NULL);

# 10
UPDATE producto p 
NATURAL JOIN nproducto np
SET p.precio = np.precio;

# 11
INSERT INTO oficina
SELECT *
FROM noficina nof
WHERE nof.oficina NOT IN (SELECT oficina FROM oficina);

# 12
INSERT INTO pedido
SELECT *
FROM npedido
WHERE rep = 105; 

# 13
UPDATE empleado SET oficina = 21
WHERE oficina = 30;

