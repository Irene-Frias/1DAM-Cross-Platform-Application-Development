-- 1

    -- Versión 1
    CREATE OR REPLACE PROCEDURE nuevoPueblo (idPueblo IN CHAR, nom IN VARCHAR2, 
        ext IN NUMBER, pobH IN INTEGER, pobM IN INTEGER,
        nVeh IN INTEGER, nLin IN INTEGER)
    IS
    BEGIN 
        INSERT INTO pueblos (codigo, nombre, extension, pob_hombres, pob_mujeres, 
                    svehiculos, lineas_tel, pob_total)
        VALUES (idPueblo, nom, ext, pobH, pobM, nVeh, nLin, pobH + pobM);
    END nuevoPueblo;
    
    CALL nuevoPueblo ('29770', 'Lagunilla del Valle', 50, 10044, 9953, 9064, 25540);


    -- Versión 2
    CREATE OR REPLACE PROCEDURE nuevoPueblo (idPueblo IN CHAR, nom IN VARCHAR2, 
        ext IN NUMBER, pobH IN INTEGER, pobM IN INTEGER,
        nVeh IN INTEGER, nLin IN INTEGER)
    IS
        poblacion_total INTEGER;
    BEGIN 
        -- Calcular población total 
        poblacion_total := pobH + pobM;
        -- Añadir registro con campo calculado 
        INSERT INTO pueblos (codigo, nombre, extension, pob_hombres, pob_mujeres, 
                    svehiculos, lineas_tel, pob_total)
        VALUES (idPueblo, nom, ext, pobH, pobM, nVeh, nLin, poblacion_total);
    END nuevoPueblo;
    
    CALL nuevoPueblo ('29770', 'Lagunilla del Valle', 50, 10044, 9953, 9064, 25540);


-- 2 
CREATE OR REPLACE FUNCTION tipoCiudad (poblacion NUMBER)
    RETURN VARCHAR2
AS
    resultado VARCHAR2(10);
BEGIN
    CASE 
        WHEN poblacion < 10000 THEN resultado := 'Pequeña';
        WHEN poblacion >= 10000 AND poblacion <= 50000 THEN resultado := 'Mediana';
        ELSE resultado := 'Grande';
    END CASE;
    RETURN resultado;
END tipoCiudad;

CALL nuevoPueblo ('29770', 'Lagunilla del Valle', 50, 10044, 9953, 9064, 25540);


SET SERVEROUTPUT ON; 
    
    -- Versión 1
    DECLARE
        valor NUMBER;
        tipo VARCHAR2(10);
    BEGIN
        valor := 4002;
        tipo := tipoCiudad(valor);
        DBMS_OUTPUT.PUT_LINE('Tipo de ciudad: ' || tipo);
    END;
    
    -- Versión 2    
    BEGIN 
        DBMS_OUTPUT.PUT_LINE('Tipo de ciudad: ' || tipoCiudad(4002));
    END;
  
    -- Versión 3
    SELECT
        "PUEBLOS"."TIPOCIUDAD"(534002) "TIPO_DE_CIUDAD"
    FROM
        "SYS"."DUAL" "A1";
        
  
  