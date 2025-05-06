# 1
SELECT repclie, MAX(limite_credito) AS 'Límite máximo'
FROM cliente
GROUP BY repclie;

# 2
SELECT COUNT(numempl) AS 'Número de empleados', oficina 
FROM empleado
GROUP BY oficina;

# 3
SELECT rep, SUM(importe) AS 'Total importe' 
FROM pedido
GROUP BY rep, importe
HAVING SUM(importe) >= 30000;

# 4
SELECT oficina, AVG(cuota) AS 'Cuota media'
FROM empleado
GROUP BY oficina
HAVING AVG(cuota) BETWEEN 200000 AND 300000;

# 5
SELECT oficina, AVG(cuota) AS 'Cuota media'
FROM empleado
WHERE titulo LIKE 'Representante'
GROUP BY oficina
HAVING AVG(cuota) BETWEEN 200000 AND 300000;

