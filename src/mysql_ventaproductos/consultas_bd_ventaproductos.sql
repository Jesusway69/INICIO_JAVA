**********************
***   ENUNCIADOS   ***
**********************

(01) Seleccione todos los registros de la tabla Cliente, ordene el resultado alfabéticamente por la columna nombre.

SELECT * FROM Cliente ORDER BY nombre;

(02) Seleccione todos los registros de la tabla Cliente, ordene el resultado invertido alfabéticamente por la columna nombre.

SELECT * FROM Cliente ORDER BY nombre DESC;

(03) Seleccione todos los registros de la tabla Cliente, ordene el resultado alfabéticamente, primero por la columna nombre y luego por la columna apellidos.

SELECT *
FROM Cliente
ORDER BY nombre, apellidos;

(04) Insertar un nuevo registro en la tabla Cliente.

INSERT INTO Cliente(nombre,apellidos,dni,direccion,fecha_nacimiento) VALUES('Miguel','Lescano Diaz','8888888H','Direccion 6','1998-02-21');

(05) Elimine todos los registros de la tabla Cliente cuyo nombre tenga el valor 'Miguel'. 

DELETE FROM Cliente WHERE nombre = 'Miguel';   -- (ON DELETE CASCADE) SE ELIMINA EN CASCADA TODOS SUS HIJOS DE MIGUEL

(06) Eliminar todos los registros de la tabla Cliente.

DELETE FROM Cliente;  -- (ON DELETE CASCADE) SE ELIMINA EN CASCADA TODOS SUS HIJOS DE MIGUEL

(07) Utilice la función correspondiente para seleccionar el registro con el valor mas pequeño de la columna precio.

SELECT MIN(precio_unitario) AS MENOR_PRECIO
FROM Producto;

(08) Utilice la función correspondiente para seleccionar el registro con el valor más alto de la columna precio.

SELECT MAX(precio_unitario) AS MENOR_PRECIO
FROM Producto;

(09) Utilice la función que corresponda para devolver la cantidad de registros que tiene el valor precio establecido en 1.1

SELECT COUNT(precio_unitario)
FROM Producto
WHERE precio_unitario = 1.1;

(10) Use una función SQL para calcular el precio promedio de todos los productos.

SELECT AVG(precio_unitario) AS PROMEDIO_PRECIO
FROM Producto;

(11) Use una función SQL para calcular la suma de todos los valores de la columna precio de la tabla Producto.

SELECT SUM(precio_unitario) AS SUMA_PRECIO
FROM Producto;

(12) Seleccione todos los registros donde el valor de nombre de un producto comience con la letra 'T'

SELECT *
FROM Producto
WHERE nombre LIKE 'T%';

(13) Seleccione todos los registros donde el valor de la columna apellidos de la tabla Cliente, termina con la letra 'z'.

SELECT *
FROM Cliente
WHERE apellidos LIKE '%z';

(14) Seleccione todos los registros donde el valor de la columna apellidos de la tabla Cliente, tenga la cadena 'de'.

SELECT *
FROM Cliente
WHERE apellidos LIKE '%de%';

(15) Seleccione todos los registros donde el valor de la columna nombre de la tabla Cliente comience con la letra 's' y termine con la letra 'a'.

SELECT *
FROM Cliente
WHERE nombre LIKE 's%a';

(16) Seleccione todos los registros donde el valor de la columna nombre de la tabla Cliente no comience con la letra 's'.

SELECT *
FROM Cliente
WHERE nombre NOT LIKE 's%';

(17) Seleccione todos los registros donde la segunda letra de nombre de la tabla Cliente sea una 'a'.

SELECT *
FROM Cliente
WHERE nombre LIKE '_a%';

(18) Seleccione todos los registros donde el nombre de la tabla Cliente tiene 6 letras

SELECT *
FROM Cliente
WHERE nombre LIKE '______';

(19) Seleccione todos los registros cuyo nombre de la tabla Cliente inici con 's' ó 'm'

SELECT *
FROM Cliente
WHERE nombre LIKE 'S%' OR nombre LIKE 'M%';

(20) Insertar un registro en la tabla proveedor (Padre)

INSERT INTO Proveedor(nombre,nif,direccion) VALUES('Arturo','39283493A','Direccion 10');

(21) 
Eliminar todos los registros de la tabla proveedor
Alterar el campo nif y ponerle unique de la tabla proveedor
Insertar un registro en la tabla proveedor
Mostrar todos los registros de la tabla proveedor

(22)
El programa pedira el nombre, nif, direccion y debe comprobar que dicho nif si existe
para evitar que se produzca la exception entonces volvera a pedir un nuevo nif.

(23)
Se pide alterar la tabla proveedor para ingresar un nuevo campo que se llamará
casado de tipo booleano y tambien mostrará la estructura de la tabla.

ALTER TABLE Proveedor ADD escasado TINYINT;
UPDATE Proveedor SET escasado = ? WHERE idProveedor = ?;
DESCRIBE Proveedor;

ALTER TABLE Proveedor DROP COLUMN escasado;


UPDATE Proveedor SET escasado = 1  WHERE idProveedor = 5;
UPDATE Proveedor SET escasado = 0  WHERE idProveedor = 6;



