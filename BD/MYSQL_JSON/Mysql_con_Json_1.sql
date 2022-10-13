****************************************
***   BASE DE DATOS MYSQL CON JSON   ***
****************************************

DROP DATABASE IF EXISTS BDJSON1;
CREATE DATABASE BDJSON1;
USE BDJSON1;

CREATE TABLE Alumno (
  idAlumno    INT  PRIMARY KEY AUTO_INCREMENT,
  datosAlumno JSON NOT NULL
)ENGINE=InnoDB;

INSERT INTO Alumno(datosAlumno) VALUES ('{"nombre":"Luis","edad":23,"estatura":1.72,"cursos_l":["Física","Matemática"]}');
INSERT INTO Alumno(datosAlumno) VALUES ('{"nombre":"Miguel","edad":21,"estatura":1.73,"cursos_l":["Matemática"]}');
INSERT INTO Alumno(datosAlumno) VALUES ('{"nombre":"Carla","edad":20,"estatura":1.70,"cursos_l":["Química"]}');

*********************
***   CONSULTAS   ***
*********************

-- MOSTRAR TODOS LOS REGISTROS DE LA TABLA ALUMNO

SELECT * FROM Alumno;

-- MOSTRAR LOS CURSOS DE Luis

SELECT datosAlumno->'$.nombre' AS NOMBRE, datosAlumno->'$.cursos_l' AS CURSOS
FROM Alumno
WHERE datosAlumno->'$.nombre' = 'Luis';

+--------+----------------------------+
| NOMBRE | CURSOS                     |
+--------+----------------------------+
| "Luis" | ["Física", "Matemática"]   |
+--------+----------------------------+
1 row in set (0.00 sec)

-- MOSTRAR TODOS LOS ALUMNOS MENORES DE 22 AÑOS

SELECT *
FROM Alumno
WHERE datosAlumno->'$.edad' < 22;

+----------+---------------------------------------------------------------------------------+
| idAlumno | datosAlumno                                                                     |
+----------+---------------------------------------------------------------------------------+
|        2 | {"edad": 21, "nombre": "Miguel", "cursos_l": ["Matemática"], "estatura": 1.73}  |
|        3 | {"edad": 20, "nombre": "Carla", "cursos_l": ["Química"], "estatura": 1.7}       |
+----------+---------------------------------------------------------------------------------+
2 rows in set (0.00 sec)











  