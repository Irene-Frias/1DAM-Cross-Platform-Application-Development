SET SERVEROUTPUT ON;

-- 1 
DECLARE
    v_texto VARCHAR2(40);    
BEGIN 
    v_texto := 'Esta es una variable de tipo VARCHAR2';
    DBMS_OUTPUT.PUT_LINE(v_texto);    
END;

-- 2
DECLARE
    v_texto VARCHAR2(10);    
BEGIN 
    v_texto := '002233';
    DBMS_OUTPUT.PUT_LINE('Este es el valor que está almacenado en la variable ' || v_texto);    
END;

-- 3
DECLARE
    v_valor NUMBER(5);    
BEGIN 
    v_valor := 55543;
    DBMS_OUTPUT.PUT_LINE('Este es el valor que está almacenado en la variable ' || v_valor);
END;

-- 4  
DECLARE
    v_PI CONSTANT NUMBER(8,7) := 3.1415926;
    v_radio NUMBER(2);
    v_area NUMBER(7,2);    
BEGIN 
    v_radio := 10;
    v_area := v_PI * v_radio * v_radio;
    DBMS_OUTPUT.PUT_LINE('El área del círculo del radio es ' || v_radio || ' y su área es ' || v_area);
END;

-- 5
SET VERIFY OFF;

DECLARE 
    v_num1 NUMBER := &valor1;
    v_num2 NUMBER := &valor2;
    v_num3 NUMBER;
BEGIN 
    v_num3 := v_num1 + v_num2;    
    DBMS_OUTPUT.PUT_LINE('Cadena original: ' || v_num3);    
END;

-- 6  
DECLARE 
    v_texto VARCHAR2(100) := 'estO Es uNA cAdenA de TExTo';
BEGIN 

    DBMS_OUTPUT.PUT_LINE('Cadena original: ' || v_texto);
    
    DBMS_OUTPUT.PUT_LINE('Cadena original: ' || UPPER(v_texto));
    
    DBMS_OUTPUT.PUT_LINE('Cadena original: ' || LOWER(v_texto));
END;

-- 7
DECLARE 
    v_texto VARCHAR2(50) := 'Esto es una cadena de caracteres';
BEGIN 
    DBMS_OUTPUT.PUT_LINE('La longitud de la cadena es: ' || length(v_texto));    
    DBMS_OUTPUT.PUT_LINE(LPAD('-', 80, '-'));
    
    DBMS_OUTPUT.PUT_LINE('Cadena con LPAD: ' || LPAD(v_texto, 50, '$'));
    DBMS_OUTPUT.PUT_LINE(LPAD('-', 80, '-'));
    
    DBMS_OUTPUT.PUT_LINE('Cadena con LPAD: ' || RPAD(v_texto, 50, '#'));
    DBMS_OUTPUT.PUT_LINE(LPAD('-', 80, '-'));
    
    DBMS_OUTPUT.PUT_LINE('Cadena con LPAD y RPAD: ');
    
    DBMS_OUTPUT.PUT_LINE(RPAD(LPAD(v_texto, 50, '$'), 100, '*'));    
END;

-- 8
SET VERIFY OFF;

DECLARE 
    a NUMBER := &a;
    b NUMBER := &b;
BEGIN 
    IF a > b THEN 
        DBMS_OUTPUT.PUT_LINE('Resultado: ' || a || ' es mayor que ' || b);
    ELSIF a < b THEN 
        DBMS_OUTPUT.PUT_LINE('Resultado: ' || a || ' es menor que ' || b);
    ELSE  
        DBMS_OUTPUT.PUT_LINE('Resultado: ' || a || ' es igual que ' || b);  
    END IF;    
END;

-- 9
SET VERIFY OFF;

DECLARE 
    v_num NUMBER := &valor;
BEGIN 
    CASE 
        WHEN v_num = 0 
            THEN DBMS_OUTPUT.PUT_LINE('El valor es: ' || v_num);    
        WHEN v_num = 1 
            THEN DBMS_OUTPUT.PUT_LINE('El valor es: ' || v_num);   
        WHEN v_num = 2 
            THEN DBMS_OUTPUT.PUT_LINE('El valor es: ' || v_num);   
        WHEN v_num = 3 
            THEN DBMS_OUTPUT.PUT_LINE('El valor es: ' || v_num); 
        WHEN v_num = 4 
            THEN DBMS_OUTPUT.PUT_LINE('El valor es: ' || v_num);  
    ELSE 
        DBMS_OUTPUT.PUT_LINE('El valor no está comprendido entre 0 y 5');
    END CASE;    
END;

-- 10
CREATE OR REPLACE PROCEDURE 
    Suma(num1 IN NUMBER, num2 IN NUMBER)
IS
    total NUMBER;
BEGIN
    total := num1 + num2;
    DBMS_OUTPUT.PUT_LINE('La suma de ' || num1 || ' y ' || num2 || ' es: ' || total);  
END Suma;

-- 11
CREATE OR REPLACE PROCEDURE textoDelReves (p_texto IN VARCHAR2) 
IS
    v_texto_reves VARCHAR2(4000) := '';
BEGIN
    FOR i IN REVERSE 1..LENGTH(p_texto) LOOP
        v_texto_reves := v_texto_reves || SUBSTR(p_texto, i, 1);
    END LOOP;
    
    DBMS_OUTPUT.PUT_LINE('Texto al revés: ' || v_texto_reves);
END;

SET VERIFY ON;

BEGIN
    textoDelReves('Hola mundo');
END;


-- 12
CREATE OR REPLACE FUNCTION calcular_edad (p_fecha_nac DATE) 
    RETURN NUMBER 
IS
    v_edad NUMBER;
BEGIN
    v_edad := TRUNC(MONTHS_BETWEEN(SYSDATE, p_fecha_nac) / 12);
    RETURN v_edad;
END;

DECLARE
    edad NUMBER;
BEGIN
    edad := calcular_edad(TO_DATE('2000-05-06', 'YYYY-MM-DD'));
    DBMS_OUTPUT.PUT_LINE('Edad: ' || edad);
END;


