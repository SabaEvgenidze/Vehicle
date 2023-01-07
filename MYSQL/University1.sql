-- MySQL Script generated by MySQL Workbench
-- Sat Jan  7 14:36:41 2023
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`University`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`University` ;

CREATE TABLE IF NOT EXISTS `mydb`.`University` (
  `ID` INT NOT NULL,
  `Location` INT NULL,
  `Name` VARCHAR(45) NULL,
  PRIMARY KEY (`ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Lecturers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Lecturers` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Lecturers` (
  `ID` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `Surname` VARCHAR(45) NULL,
  `Age` INT NULL,
  `University_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Lectors_University1_idx` (`University_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Lectors_University1`
    FOREIGN KEY (`University_ID`)
    REFERENCES `mydb`.`University` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Audience`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Audience` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Audience` (
  `ID` INT NOT NULL,
  `Capacity` INT NULL,
  `Name` VARCHAR(45) NULL,
  `Lecturers_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Audience_Lecturers1_idx` (`Lecturers_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Audience_Lecturers1`
    FOREIGN KEY (`Lecturers_ID`)
    REFERENCES `mydb`.`Lecturers` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Students`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Students` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Students` (
  `ID` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `Surname` VARCHAR(45) NULL,
  `Age` INT NULL,
  `Course` INT NULL,
  `University_ID` INT NOT NULL,
  `Audience_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Students_University1_idx` (`University_ID` ASC) VISIBLE,
  INDEX `fk_Students_Audience1_idx` (`Audience_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Students_University1`
    FOREIGN KEY (`University_ID`)
    REFERENCES `mydb`.`University` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Students_Audience1`
    FOREIGN KEY (`Audience_ID`)
    REFERENCES `mydb`.`Audience` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`timestamps`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`timestamps` ;

CREATE TABLE IF NOT EXISTS `mydb`.`timestamps` (
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP NULL);


-- -----------------------------------------------------
-- Table `mydb`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`user` ;

CREATE TABLE IF NOT EXISTS `mydb`.`user` (
  `username` VARCHAR(16) NOT NULL,
  `email` VARCHAR(255) NULL,
  `password` VARCHAR(32) NOT NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP);


-- -----------------------------------------------------
-- Table `mydb`.`timestamps_1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`timestamps_1` ;

CREATE TABLE IF NOT EXISTS `mydb`.`timestamps_1` (
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` TIMESTAMP NULL);


-- -----------------------------------------------------
-- Table `mydb`.`user_1`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`user_1` ;

CREATE TABLE IF NOT EXISTS `mydb`.`user_1` (
  `username` VARCHAR(16) NOT NULL,
  `email` VARCHAR(255) NULL,
  `password` VARCHAR(32) NOT NULL,
  `create_time` TIMESTAMP NULL DEFAULT CURRENT_TIMESTAMP);


-- -----------------------------------------------------
-- Table `mydb`.`category`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`category` ;

CREATE TABLE IF NOT EXISTS `mydb`.`category` (
  `category_id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`category_id`));


-- -----------------------------------------------------
-- Table `mydb`.`Course`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Course` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Course` (
  `ID` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `Students_ID` INT NOT NULL,
  `Lecturers_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Course_Students1_idx` (`Students_ID` ASC) VISIBLE,
  INDEX `fk_Course_Lecturers1_idx` (`Lecturers_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Course_Students1`
    FOREIGN KEY (`Students_ID`)
    REFERENCES `mydb`.`Students` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Course_Lecturers1`
    FOREIGN KEY (`Lecturers_ID`)
    REFERENCES `mydb`.`Lecturers` (`ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Masters`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Masters` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Masters` (
  `ID` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `Surname` VARCHAR(45) NULL,
  `Age` INT NULL,
  `University_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Masters_University1_idx` (`University_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Masters_University1`
    FOREIGN KEY (`University_ID`)
    REFERENCES `mydb`.`University` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Faculty`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Faculty` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Faculty` (
  `ID` INT NOT NULL,
  `Name` VARCHAR(45) NULL,
  `Lecturers_ID` INT NOT NULL,
  `Students_ID` INT NOT NULL,
  PRIMARY KEY (`ID`),
  INDEX `fk_Faculty_Lecturers1_idx` (`Lecturers_ID` ASC) VISIBLE,
  INDEX `fk_Faculty_Students1_idx` (`Students_ID` ASC) VISIBLE,
  CONSTRAINT `fk_Faculty_Lecturers1`
    FOREIGN KEY (`Lecturers_ID`)
    REFERENCES `mydb`.`Lecturers` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `fk_Faculty_Students1`
    FOREIGN KEY (`Students_ID`)
    REFERENCES `mydb`.`Students` (`ID`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
