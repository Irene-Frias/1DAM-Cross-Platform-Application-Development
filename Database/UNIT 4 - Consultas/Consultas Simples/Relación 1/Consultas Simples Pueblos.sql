# 1
SELECT codigo, nombre 
FROM pueblos;

# 2
SELECT codigo, nombre, pob_total, (pob_hombres + pob_mujeres) AS 'Población Total' 
FROM pueblos;

# 3
SELECT codigo, nombre, (vehiculos / pob_total) AS 'Vehículos por persona' 
FROM pueblos;

# 4
SELECT codigo, nombre, (lineas_tel / pob_total) * 100 AS 'Líneas Telefónicas' 
FROM pueblos;

# 5
SELECT * 
FROM pueblos 
WHERE NOT codigo = 29067;

# 6
SELECT * 
FROM pueblos 
WHERE pob_total > 1000;

# 7
SELECT * 
FROM pueblos 
WHERE pob_total < 10000;

# 8
SELECT * 
FROM pueblos 
WHERE pob_total BETWEEN 1000 AND 10000;

# 9
SELECT codigo, nombre, (vehiculos / pob_total) * 100 AS 'Vehículos por persona' 
FROM pueblos 
WHERE ((vehiculos / pob_total) * 100) >= 10;

# 10
SELECT codigo, nombre, (vehiculos / pob_total) * 100 AS 'Vehículos por persona' 
FROM pueblos 
WHERE ((vehiculos / pob_total) * 100) >= 10;

# 11
SELECT codigo, nombre, (vehiculos / pob_total) * 100 AS 'Vehículos por persona' 
FROM pueblos 
WHERE ((vehiculos / pob_total) * 100) >= 10 
OR codigo = 29067;

# 12
SELECT *
FROM pueblos 
WHERE pob_total BETWEEN 100 AND 1000 
OR pob_total > 10000;

# 13
SELECT *
FROM pueblos 
WHERE codigo = 29007 
OR codigo = 29078 
OR codigo = 29099;

# 14
SELECT nombre, vehiculos
FROM pueblos
WHERE pob_total < 1000
ORDER BY vehiculos desc;

# 15
SELECT nombre, vehiculos
FROM pueblos
WHERE pob_total < 1000
ORDER BY vehiculos asc;

# 16
SELECT nombre, pob_total
FROM pueblos 
WHERE nombre LIKE 'Al%'
OR nombre LIKE 'Ben%';

