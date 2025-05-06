# 1
INSERT INTO pueblos (codigo, nombre, extension, pob_total, pob_hombres, pob_mujeres, vehiculos, lineas_tel) VALUES('29078', 'Pazalla', 23.65, 2675 + 3541, 2675, 3541, 35, 165); 

# 2 
CREATE TABLE poblaciones (
  codigo 		CHAR(5) 		NOT NULL	PRIMARY KEY,
  nombre 		VARCHAR(28) 	NOT NULL,
  extension 	DECIMAL(4,1) 	NOT NULL,
  pob_hombres 	INT(6) 			NOT NULL,
  pob_mujeres 	INT(6) 			NOT NULL,
  vehiculos 	INT(11) 		NOT NULL,
  lineas_tel 	INT(11) 		NOT NULL
);

INSERT INTO poblaciones (codigo, nombre, extension, pob_hombres, pob_mujeres, vehiculos, lineas_tel) 
SELECT codigo, nombre, extension, pob_hombres, pob_mujeres, vehiculos, lineas_tel
FROM pueblos; 

# 3
UPDATE poblaciones SET lineas_tel = lineas_tel * 1.10;

# 4
UPDATE poblaciones SET vehiculos = vehiculos * 0.9 
WHERE (pob_mujeres + pob_hombres) > 15000;

# 5
DELETE FROM poblaciones 
WHERE (pob_mujeres + pob_hombres) < 5000;

