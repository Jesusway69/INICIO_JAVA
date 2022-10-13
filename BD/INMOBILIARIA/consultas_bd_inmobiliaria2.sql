********************
***   GROUP BY   ***
********************

-- MOSTRAR LA CANTIDAD DE TRANSACCIONES RELACIONADO CON EL TIPO DE INMUEBLE CASA

(1) TODAS LAS TRANSACCIONES DE CASA

SELECT Referencia, Fecha_Alta, Tipo
FROM Inmueble
WHERE tipo = 'casa';

(2) SIN GROUP BY

SELECT tipo, COUNT(tipo) AS NUMERO_TRANSACCIONES 
FROM Inmueble
WHERE tipo = 'casa';

+------+----------------------+
| tipo | NUMERO_TRANSACCIONES |
+------+----------------------+
| Casa |                  454 |
+------+----------------------+
1 row in set (0.00 sec)

(3) CON GROUP BY

SELECT tipo, COUNT(tipo) AS NUMERO_TRANSACCIONES 
FROM Inmueble
GROUP BY tipo
HAVING tipo = 'casa';

-- MOSTRAR LA CANTIDAD DE TRANSACCIONES DEL TIPO DE INMUEBLE CASA, PISO Y LOCAL, ORDENADO POR CANTIDAD ASCENDENTE

(1)

SELECT tipo, COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING tipo IN ('casa','piso','local');

+-------+----------------------+
| tipo  | NUMERO_TRANSACCIONES |
+-------+----------------------+
| Local |                  465 |
| Piso  |                  491 |
| Casa  |                  454 |
+-------+----------------------+
3 rows in set (0.01 sec)

(2)

SELECT tipo, COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING tipo='casa' OR tipo='piso' OR tipo='local'
ORDER BY tipo ASC;

+-------+----------------------+
| tipo  | NUMERO_TRANSACCIONES |
+-------+----------------------+
| Casa  |                  454 |
| Local |                  465 |
| Piso  |                  491 |
+-------+----------------------+
3 rows in set (0.01 sec)

(3)

SELECT tipo, COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING tipo='casa' OR tipo='piso' OR tipo='local'
ORDER BY NUMERO_TRANSACCIONES DESC;

+-------+----------------------+
| tipo  | NUMERO_TRANSACCIONES |
+-------+----------------------+
| Piso  |                  491 |
| Local |                  465 |
| Casa  |                  454 |
+-------+----------------------+
3 rows in set (0.01 sec)

-- MOSTRAR CUAL DE LOS SIGUIENTES TIPOS DE INMUEBLE: PISO, CASA Y LOCAL, TIENE EL MAYOR NUMERO DE TRANSACCIONES.

(1) SUBCONSULTA

SELECT COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING tipo='casa' OR tipo='piso' OR tipo='local'
ORDER BY NUMERO_TRANSACCIONES DESC
LIMIT 1;

+----------------------+
| NUMERO_TRANSACCIONES |
+----------------------+
|                  491 |
+----------------------+
1 row in set (0.01 sec)

(2)

SELECT tipo, COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING (tipo='casa' OR tipo='piso' OR tipo='local') AND NUMERO_TRANSACCIONES IN (491)
ORDER BY NUMERO_TRANSACCIONES DESC;

-- > CONSULTA CON LA TABLA TEMPORAL

SELECT tipo, COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING (tipo='casa' OR tipo='piso' OR tipo='local') AND NUMERO_TRANSACCIONES IN (SELECT * FROM (SELECT COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING tipo='casa' OR tipo='piso' OR tipo='local'
ORDER BY NUMERO_TRANSACCIONES DESC
LIMIT 1) MITABLATEMP)
ORDER BY NUMERO_TRANSACCIONES DESC;

- CONVERTIR LA SIGUIENTE CONSULTA EN UNA TABLA TEMPORAL

-- CONSULTA

SELECT COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING tipo='casa' OR tipo='piso' OR tipo='local'
ORDER BY NUMERO_TRANSACCIONES DESC
LIMIT 1

+----------------------+
| NUMERO_TRANSACCIONES |
+----------------------+
|                  491 |
+----------------------+
1 row in set (0.01 sec)

---> TABLA TEMPORAL DE LA CONSULTA

SELECT * FROM 

(SELECT COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING tipo='casa' OR tipo='piso' OR tipo='local'
ORDER BY NUMERO_TRANSACCIONES DESC
LIMIT 1) 

MITABLATEMP;

SELECT COUNT(tipo) AS NUMERO_TRANSACCIONES
FROM Inmueble
GROUP BY tipo
HAVING tipo='casa' OR tipo='piso' OR tipo='local'
ORDER BY NUMERO_TRANSACCIONES DESC
LIMIT 1

+----------------------+
| NUMERO_TRANSACCIONES |
+----------------------+
|                  491 |
+----------------------+
1 row in set (0.01 sec)

-- MOSTRAR EL TOTAL DE ENTRADAS DE LA TABLA INMUEBLE QUE AUN NO SON TRANSACCIONES DE ALGUN VENDEDOR

SELECT COUNT(*)
FROM Inmueble
WHERE vendedor IS NULL;

SELECT COUNT(Referencia)
FROM Inmueble
WHERE vendedor IS NULL;

SELECT COUNT(Referencia)
FROM Inmueble
WHERE Fecha_Venta IS NULL;

+-------------------+
| COUNT(Referencia) |
+-------------------+
|               578 |
+-------------------+
1 row in set (0.00 sec)

-- MOSTRAR EL NUMERO DE TRANSACCIONES POR CADA AÑO (fecha_venta)

SELECT YEAR(fecha_venta) AS ANIO, COUNT(*) AS N_TRANSACCIONES
FROM Inmueble
GROUP BY YEAR(fecha_venta)
HAVING ANIO IS NOT NULL;

+------+-----------------+
| ANIO | N_TRANSACCIONES |
+------+-----------------+
| 2004 |             369 |
| 2005 |            1041 |
| 2006 |             995 |
| 2007 |             354 |
+------+-----------------+

-- MOSTRAR EL AÑO CON EL MAYOR NUMERO DE TRANSACCIONES

SELECT YEAR(fecha_venta) AS ANIO, COUNT(*) AS N_TRANSACCIONES
FROM Inmueble
GROUP BY YEAR(fecha_venta)
HAVING ANIO IS NOT NULL
ORDER BY N_TRANSACCIONES DESC
LIMIT 1;

+------+-----------------+
| ANIO | N_TRANSACCIONES |
+------+-----------------+
| 2005 |            1041 |
+------+-----------------+
1 row in set (0.01 sec)


