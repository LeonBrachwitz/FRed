CREATE SCHEMA `feuerwehr` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
CREATE USER 'leon'@'%' IDENTIFIED BY 'passwort';
GRANT ALL PRIVILEGES ON `feuerwehr`.* TO 'leon'@'%' IDENTIFIED BY 'passwort';
CREATE USER 'leon'@'localhost' IDENTIFIED BY 'passwort';
GRANT ALL PRIVILEGES ON `feuerwehr`.* TO 'leon'@'localhost' IDENTIFIED BY 'passwort';
FLUSH privileges;

USE feuerwehr;

CREATE TABLE `benutzer` (
  `id` VARCHAR(36) NOT NULL,
  `username` varchar(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `benutzer` WRITE;
/*!40000 ALTER TABLE `benutzer` DISABLE KEYS */;
INSERT INTO `benutzer` VALUES ('7bc1adf3-a355-4207-ad26-6be70e0064b5','leonbrachwitz');
/*!40000 ALTER TABLE `benutzer` ENABLE KEYS */;
UNLOCK TABLES;


