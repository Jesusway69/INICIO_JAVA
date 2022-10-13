**********************************
***   BASE DE DATOS COMPLETA   ***
**********************************

-- 1. CREAR UNA BASE DATOS

DROP DATABASE IF EXISTS BDJSON3;
CREATE DATABASE BDJSON3;

-- 2. USAR UNA BASE DE DATOS

USE BDJSON3;

-- 3. CREAR UNA TABLA

CREATE TABLE IF NOT EXISTS Continente(
	 idContinente INT                 NOT NULL PRIMARY KEY AUTO_INCREMENT,
     nombreC      VARCHAR(15)  UNIQUE NOT NULL,
     poblacionC   BIGINT              NOT NULL
)ENGINE=InnoDB;

CREATE TABLE IF NOT EXISTS ContinenteJson(
   idContinenteJson INT  NOT NULL PRIMARY KEY,
   test             JSON NOT NULL
)ENGINE=InnoDB;

-- 3. INSERTAR REGISTROS EN UNA TABLA

INSERT INTO Continente(nombreC,poblacionC) VALUES('Asia',4581757408);
INSERT INTO Continente(nombreC,poblacionC) VALUES('Africa',1216130000);
INSERT INTO Continente(nombreC,poblacionC) VALUES('Europa',738849000);
INSERT INTO Continente(nombreC,poblacionC) VALUES('America',1001559000);
INSERT INTO Continente(nombreC,poblacionC) VALUES('Oceania',38304000);
INSERT INTO Continente(nombreC,poblacionC) VALUES('Antartida',1106);

-- 4. INSERTAR REGISTROS EN UNA TABLA CON FORMATO JSON HACIENDO USO DE LA FUNCION JSON_OBJECT

INSERT INTO ContinenteJson
SELECT idContinente, json_object('continente', nombreC, 'poblacion', poblacionC)
FROM Continente;

+------------------+----------------------------------------------------+
| idContinenteJson | test                                               |
+------------------+----------------------------------------------------+
|                1 | {"poblacion": 4581757408, "continente": "Asia"}    |
|                2 | {"poblacion": 1216130000, "continente": "Africa"}  |
|                3 | {"poblacion": 738849000, "continente": "Europa"}   |
|                4 | {"poblacion": 1001559000, "continente": "America"} |
|                5 | {"poblacion": 38304000, "continente": "Oceania"}   |
|                6 | {"poblacion": 1106, "continente": "Antartida"}     |
+------------------+----------------------------------------------------+
6 rows in set (0.00 sec)

INSERT INTO ContinenteJson
SELECT idContinente, json_object('continente', nombreC, 'poblacion', poblacionC)
FROM Continente
WHERE nombreC = 'Asia';

+------------------+-------------------------------------------------+
| idContinenteJson | test                                            |
+------------------+-------------------------------------------------+
|                1 | {"poblacion": 4581757408, "continente": "Asia"} |
+------------------+-------------------------------------------------+
1 row in set (0.00 sec)

*********************
***   CONSULTAS   ***
*********************

-- 5. MOSTRAR EL TOTAL DE LA POBLACION DEL PLANETA TIERRA

SELECT SUM(test->'$.poblacion')
FROM ContinenteJson;

+--------------------------+
| SUM(test->'$.poblacion') |
+--------------------------+
|               7576600514 |
+--------------------------+
1 row in set (0.00 sec)

-- 6. ACCEDER A CIERTOS VALORES DE UN JSON

SELECT idContinenteJson, test->'$.continente' AS CONTINENTE FROM ContinenteJson;

+------------------+-------------+
| idContinenteJson | CONTINENTE  |
+------------------+-------------+
|                1 | "Asia"      |
|                2 | "Africa"    |
|                3 | "Europa"    |
|                4 | "America"   |
|                5 | "Oceania"   |
|                6 | "Antartida" |
+------------------+-------------+
6 rows in set (0.00 sec)

SELECT test->'$.continente' AS CONTINENTE,
       test->'$.poblacion' AS POBLACION
FROM ContinenteJson;

+-------------+------------+
| CONTINENTE  | POBLACION  |
+-------------+------------+
| "Asia"      | 4581757408 |
| "Africa"    | 1216130000 |
| "Europa"    | 738849000  |
| "America"   | 1001559000 |
| "Oceania"   | 38304000   |
| "Antartida" | 1106       |
+-------------+------------+
6 rows in set (0.00 sec)