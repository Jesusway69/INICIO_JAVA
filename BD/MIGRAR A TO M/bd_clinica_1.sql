-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema clinica
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema clinica
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `clinica` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `clinica` ;

-- -----------------------------------------------------
-- Table `clinica`.`tpaciente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinica`.`tpaciente` (
  `CODIGOPACIENTE` INT NOT NULL DEFAULT '0',
  `NOMBRE` VARCHAR(255) NULL DEFAULT NULL,
  `APELLIDOS` VARCHAR(255) NULL DEFAULT NULL,
  `DIRECCION` VARCHAR(255) NULL DEFAULT NULL,
  `POBLACION` VARCHAR(255) NULL DEFAULT NULL,
  `CODIGOPOSTAL` DOUBLE NULL DEFAULT NULL,
  `TELEFONO` DOUBLE NULL DEFAULT NULL,
  `FECHANACIMIENTO` DATETIME NULL DEFAULT NULL,
  PRIMARY KEY (`CODIGOPACIENTE`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `clinica`.`tmedico`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinica`.`tmedico` (
  `CODIGOMEDICO` VARCHAR(255) NOT NULL,
  `NOMBRE` VARCHAR(255) NULL DEFAULT NULL,
  `APELLIDOS` VARCHAR(255) NULL DEFAULT NULL,
  `ESPECIALIDAD` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`CODIGOMEDICO`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


-- -----------------------------------------------------
-- Table `clinica`.`tingreso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `clinica`.`tingreso` (
  `NINGRESO` INT NOT NULL,
  `HABITACION` DOUBLE NULL DEFAULT NULL,
  `CAMA` VARCHAR(255) NULL DEFAULT NULL,
  `FECHAINGRESO` DATETIME NULL DEFAULT NULL,
  `CODIGOPACIENTE` DOUBLE NULL DEFAULT NULL,
  `CODIGOMEDICO` VARCHAR(255) NULL DEFAULT NULL,
  `CODIGOPACIENTE` INT NOT NULL,
  `CODIGOMEDICO` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`NINGRESO`),
  INDEX `fk_tingreso_tpaciente_idx` (`CODIGOPACIENTE` ASC) VISIBLE,
  INDEX `fk_tingreso_tmedico1_idx` (`CODIGOMEDICO` ASC) VISIBLE,
  CONSTRAINT `fk_tingreso_tpaciente`
    FOREIGN KEY (`CODIGOPACIENTE`)
    REFERENCES `clinica`.`tpaciente` (`CODIGOPACIENTE`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tingreso_tmedico1`
    FOREIGN KEY (`CODIGOMEDICO`)
    REFERENCES `clinica`.`tmedico` (`CODIGOMEDICO`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb3;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
