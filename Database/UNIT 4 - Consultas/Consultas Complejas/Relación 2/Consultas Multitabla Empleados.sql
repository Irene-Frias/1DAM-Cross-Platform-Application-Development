# 1
	# 1.1
	SELECT o.oficina, o.ciudad, e.numempl, e.nombre
	FROM oficina o, empleado e
	WHERE o.oficina = e.oficina AND o.region LIKE 'Este';

	SELECT o.oficina, o.ciudad, e.numempl, e.nombre
	FROM oficina o
	JOIN empleado e
	ON o.oficina = e.oficina	# USING(oficina)
	WHERE o.region LIKE 'Este';
    
	# 1.2
	SELECT o.oficina, o.ciudad, e.numempl, e.nombre 
	FROM oficina o
	LEFT JOIN empleado e
	USING(oficina)
	WHERE region = 'Este';
        
# 2
SELECT p.num_pedido, p.importe, p.cliente, c.nombre, c.limite_credito, c.repclie
FROM pedido p, cliente c
WHERE p.cliente = c.numclie 
AND p.cliente IS NOT NULL 
AND c.repclie IS NOT NULL;

SELECT p.num_pedido, p.importe, p.cliente, c.nombre, c.limite_credito, c.repclie
FROM pedido p
JOIN cliente c
ON p.cliente = c.numclie 
WHERE p.cliente IS NOT NULL 
AND c.repclie IS NOT NULL;

# 3     
SELECT e.*, o.ciudad, o.region
FROM empleado e, oficina o
WHERE e.numempl = o.dir
ORDER BY e.nombre asc; 

SELECT e.*, o.ciudad, o.region
FROM empleado e
JOIN oficina o
ON e.numempl = o.dir
ORDER BY e.nombre asc;

# 4
SELECT o.*, e.nombre
FROM empleado e, oficina o
WHERE e.numempl = o.dir 
AND e.oficina = o.oficina
AND o.objetivo > 600000; 

SELECT o.*, e.nombre
FROM empleado e
JOIN oficina o
ON e.numempl = o.dir 
WHERE e.oficina = o.oficina
AND o.objetivo > 600000; 

# 5
SELECT p.*, e.nombre AS 'Nombre empleado', c.nombre AS 'Nombre cliente'
FROM pedido p, empleado e, cliente c
WHERE p.rep = e.numempl AND c.repclie = numempl
AND p.importe > 25000; 

SELECT p.*, e.nombre AS 'Nombre empleado', c.nombre AS 'Nombre cliente'
FROM pedido p
JOIN empleado e ON p.rep = e.numempl 
JOIN cliente c ON c.repclie = numempl
WHERE p.importe > 25000; 

# 6 
SELECT p.*
FROM pedido p, empleado e
WHERE p.rep = e.numempl
AND p.fecha_pedido = e.contrato; 

SELECT p.*
FROM pedido p
JOIN empleado e
ON p.rep = e.numempl
WHERE p.fecha_pedido = e.contrato; 

# 7
SELECT e.*, j.numempl, j.nombre, j.cuota
FROM empleado e, empleado j
WHERE e.jefe = j.numempl
AND e.cuota > j.cuota; 

SELECT e.*, j.numempl, j.nombre, j.cuota
FROM empleado e
JOIN empleado j
ON e.jefe = j.numempl
WHERE e.cuota > j.cuota; 

# 8
SELECT DISTINCT e.numempl
FROM empleado e, pedido p
WHERE e.numempl = p.rep
AND p.importe > 10000 OR e.cuota < 10000;

SELECT DISTINCT e.numempl
FROM empleado e
JOIN pedido p
ON e.numempl = p.rep
WHERE p.importe > 10000 OR e.cuota < 10000;

