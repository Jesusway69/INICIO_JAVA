****************
***   0001   *** MIGRAR DE MYSQL TO ACCESS
****************

CONECTOR ODBC MYSQL PARA DESCARGAR: https://dev.mysql.com/downloads/connector/odbc/


(1) CREAR UN ORIGEN DE DATOS ODBC (MYSQL-ACCESS)

Panel de control
Herramientas administrativas
Origenes de datos ODBC (64 bits)
Pestaña "DSN de sistema"
Botón "Agregar"
Seleccionamos "MySQL ODBC 8.0 ANSI Driver"
Botón "Finalizar"
En la ventana: Escribimos en el campo de texto "Data Source Name" lo siguiente "ZOOLOGICO_ACCESS"
               Escribimos en el campo de texto "User" lo siguiente "root"
			   Escribimos en el campo de texto "Password" lo siguiente "12345678
			   En el campo de texto "Database" no es necesariio escribir, buscamos del combo la base de datos "ZOOLOGICO"
               Presionar el botón "OK"			   

(2) DESDE ACCESS ACCEDEMOS AL ORIGEN DE DATOS CREADO ANTERIORMENTE

Datos externos
Bases de datos ODBC
Botón radio "Importar el origen de datos en una nueva tabla de la base de datos actual
Pestaña "Origen de datos de equipo"
Seleccionamos "ZOOLOGICO_ACCESS"
Seleccioamos todas las tablas
Botón "Cerrar"







