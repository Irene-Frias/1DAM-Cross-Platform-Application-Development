CREATE DATABASE IF NOT EXISTS anexo CHARACTER SET utf8mb4 COLLATE utf8mb4_spanish_ci;
USE anexo;

CREATE TABLE IF NOT EXISTS spanishCollation (
name01		VARCHAR(15)		CHARSET 	utf8mb4		COLLATE		utf8mb4_spanish_ci,
name02		VARCHAR(15)		CHARSET 	utf8mb4		COLLATE		utf8mb4_spanish2_ci);

INSERT INTO spanishCollation VALUES
	('Baño', 'Baño'),
	('Carlos', 'Carlos'),
	('Cruzada', 'Cruzada'),
	('Chile', 'Chile'),
	('Llorar', 'Llorar'),
	('Lámina', 'Lámina'),
	('Loreto', 'Loreto'),
	('Dedo', 'Dedo');

SELECT * FROM spanishCollation ORDER BY name01;
SELECT * FROM spanishCollation ORDER BY name02;