****************************************
***   BASE DE DATOS MYSQL CON JSON   ***
****************************************

DROP DATABASE IF EXISTS BDJSON2;
CREATE DATABASE BDJSON2;
USE BDJSON2;

CREATE TABLE Monitor (
  idMonitor    INT  PRIMARY KEY AUTO_INCREMENT,
  datosMonitor JSON NOT NULL
)ENGINE=InnoDB;

INSERT INTO Monitor(datosMonitor) VALUES ('{"screen": "50 inch", "resolution": "2048 x 1152 pixels", "ports": {"hdmi": 1, "usb": 3}, "speakers": {"left": "10 watt", "right": "10 watt"}}');
INSERT INTO Monitor(datosMonitor) VALUES ('{"screen": "40 inch", "resolution": "1920 x 1080 pixels", "ports": {"hdmi": 1, "usb": 2}, "speakers": {"left": "10 watt", "right": "10 watt"}}');
INSERT INTO Monitor(datosMonitor) VALUES ('{"screen": "30 inch", "resolution": "1600 x 900  pixles", "ports": {"hdmi": 1, "usb": 1}, "speakers": {"left": "10 watt", "right": "10 watt"}}');
INSERT INTO Monitor(datosMonitor) VALUES ('{"screen": "25 inch", "resolution": "1366 x 768  pixels", "ports": {"hdmi": 1, "usb": 0}, "speakers": {"left": "5 watt", "right": "5 watt"}}');
INSERT INTO Monitor(datosMonitor) VALUES ('{"screen": "20 inch", "resolution": "1280 x 720  pixels", "ports": {"hdmi": 0, "usb": 0}, "speakers": {"left": "5 watt", "right": "5 watt"}}');

*********************
***   CONSULTAS   ***
*********************

-- MOSTRAR TODOS LOS REGISTROS DE LA TABLA MONITOR

SELECT * FROM Monitor;

-- MOSTRAR TODOS LOS MONITORES QUE TENGAN MAS DE DOS PUERTOS USB

SELECT datosMonitor
FROM Monitor
WHERE datosMonitor->'$.ports.usb' > 2;

+------------------------------------------------------------------------------------------------------------------------------------------------+
| datosMonitor                                                                                                                                   |
+------------------------------------------------------------------------------------------------------------------------------------------------+
| {"ports": {"usb": 3, "hdmi": 1}, "screen": "50 inch", "speakers": {"left": "10 watt", "right": "10 watt"}, "resolution": "2048 x 1152 pixels"} |
+------------------------------------------------------------------------------------------------------------------------------------------------+
1 row in set (0.00 sec)

