-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: pwm
-- ------------------------------------------------------
-- Server version	5.7.35-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `prodotto`
--

DROP TABLE IF EXISTS `prodotto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prodotto` (
  `idprodotto` int(4) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `marca` varchar(45) NOT NULL,
  `prezzo` float NOT NULL,
  `genere` varchar(45) NOT NULL,
  `taglia` int(11) NOT NULL,
  `colore` varchar(45) NOT NULL,
  `quantita` int(11) NOT NULL,
  `tipo_cliente` varchar(7) NOT NULL,
  PRIMARY KEY (`idprodotto`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prodotto`
--

LOCK TABLES `prodotto` WRITE;
/*!40000 ALTER TABLE `prodotto` DISABLE KEYS */;
INSERT INTO `prodotto` VALUES (100,'Dunk Low Pink Vevlet','Nike',99.99,'Sneakers',28,'rosa',9,'donna'),(101,'Stan Smith','Adidas',89.99,'Sneakers',34,'bianco',10,'donna'),(102,'Air Force  07','Nike',99.99,'Sneakers',43,'bianco',19,'uomo'),(103,'Blazer Mid Gs','Nike',59.99,'Sneakers',28,'rosso',49,'bambino'),(104,'Blazer','Nike ',99.99,'Sneakers',39,'bianco',20,'donna'),(105,'Air Max ','Nike ',159.99,'Sneakers',39,'argento',9,'donna'),(106,'React vision','Nike ',129.99,'Sneakers',39,'grigio',15,'donna'),(107,'Victori One ','Nike',29.99,'Ciabatte',37,'rosa',10,'donna'),(108,'Asuna Print','Nike ',49.99,'Ciabatte',38,'nere',27,'donna'),(109,'Air force 1 ','Nike ',129.99,'Sneakers',35,'rosa',13,'donna'),(110,'Virgil Abloh Low','Off-White',259.99,'Sneakers',36,'bianco',5,'donna'),(111,'Superstar','Adidas',99.99,'Sneakers',35,'nere',45,'donna'),(112,'Top-Ten','Adidas',89.99,'Sneakers',39,'bianco',52,'donna'),(113,'Super court','Adidas',79.99,'Sneakers ',41,'bianco',12,'donna'),(115,'Anfibi Jadon','Dr Martens',179.99,'Stivali',43,'nero',25,'donna'),(116,'Blaine Loafer','Michael Kors',184.99,'Mocassino',35,'nero ',10,'donna'),(117,'Air Jordan 1 Low Pink','Nike',179.9,'Sneakers',36,'rosa',16,'donna'),(118,'Air Force 1 ExperimentalL','Nike',179.99,'Sneakers',41,'nero',15,'uomo'),(119,'MA2','Jordan',159.99,'Sneakers',43,'bianco',21,'uomo'),(120,'Dunk Low Retro','Nike',389.99,'Sneakers',41,'nero',20,'uomo'),(121,'Air Jordan 1 Retro High Black','Nike',179.99,'Sneakers ',44,'nero',14,'uomo'),(122,'Superstar','Adidas',89.99,'Sneakers',44,'bianco',45,'uomo'),(123,'Yeezy Bost 350','Adidas',159.99,'Sneakers',38,'grigio',10,'uomo'),(124,'Blazer Mid 77','Nike',99.99,'Sneakers',43,'verde',10,'uomo'),(125,'Virgil Abloh Low','Off-White',259.99,'Sneakers',42,'bianco',13,'uomo'),(126,'Air Max','Nike',179.99,'Sneakers',44,'nero',12,'uomo'),(127,'Air Jordan Dior','Nike',899.99,'Sneakers',47,'bianco',12,'uomo'),(128,'Dunk Low Off-White Pine Green','Nike',1175.99,'Sneakers',44,'verde',15,'uomo'),(129,'Dunk High','Nike',179.99,'Sneakers',41,'bianco',12,'uomo'),(130,'2976 Chelsea','Dr Martens',189.99,'Stivaletti',43,'nero',14,'uomo'),(131,'1461 Virginia','Dr Martens',159.99,'Stringate',43,'nero',59,'uomo'),(132,'Air Jordan 1 Retro High','Nike',1499.99,'Sneakers',43,'blu',25,'uomo'),(133,'Air Jordan 1 Chicago','Nike',145.99,'Sneakers',42,'rosso',12,'uomo'),(134,'Yeezy Bost 350','Adidas',159.99,'Sneakers',39,'nero',21,'uomo'),(135,'Asuna Print','Nike',39.99,'Ciabatte',39,'nero',45,'uomo'),(136,'Asuna Print','Nike',39.99,'Ciabatte',42,'rosso',45,'uomo'),(137,'Stan Smith','Adidas',89.99,'Sneakers',48,'bianco',42,'uomo'),(138,'Stan Smith B','Adidas',89.99,'Sneakers',45,'nero',53,'uomo'),(139,'Air Force 07 Wb','Nike',129.99,'Sneakers',42,'marrone',50,'uomo'),(140,'Superstar Black','Adidas',59.99,'Sneakers',28,'nero',78,'bambino'),(141,'Dunk Low Pink','Nike',69.99,'Sneakers',27,'rosa',43,'bambino'),(142,'Air Jordan 1 Mid','Nike',79.99,'Sneakers',28,'nero',44,'bambino'),(143,'Yeezy Bost 350','Adidas',79.99,'Sneakers',26,'nero',24,'bambino'),(144,'Air Force 07','Nike',89.99,'Sneakers',28,'bianco',21,'bambino'),(145,'Dunk Low Retro','Nike',69.99,'Sneakers',30,'nero',25,'bambino'),(146,'Superstar White','Adidas',59.99,'Sneakers',25,'bianco',23,'bambino'),(147,'Asuna Print','Nike',19.99,'Ciabatte',28,'rosa',23,'bambino'),(148,'Crocs Classic','Crocs',19.99,'Ciabatte',26,'blu',23,'bambino'),(149,'Dunk Low Yellow Strike','Nike',99.99,'Sneakers',39,'gialle',24,'donna'),(150,'Dunk Low Green Glow','Nike',99.99,'Sneakers',40,'verde',25,'donna'),(151,'Dunk Low Pink Vevlet','Nike',99.99,'Sneakers',27,'rosa',10,'donna'),(152,'Dunk Low Pink Vevlet','Nike',99.99,'Sneakers',25,'rosa',10,'donna'),(153,'Dunk Low Pink Vevlet','Nike',99.99,'Sneakers',23,'rosa',0,'donna'),(154,'Stan Smith','Adidas',89.99,'Sneakers',40,'bianco',10,'donna'),(155,'Stan Smith','Adidas',89.99,'Sneakers',39,'bianco',10,'donna'),(156,'Stan Smith','Adidas',89.99,'Sneakers',38,'bianco',0,'donna'),(157,'Blazer','Nike',99.99,'Sneakers',40,'bianco',20,'donna'),(158,'Air Max','Nike',159.99,'Sneakers',40,'argento',10,'donna'),(159,'React vision','Nike',129.99,'Sneakers',38,'grigio',15,'donna'),(160,'Blazer','Nike',99.99,'Sneakers',41,'bianco',20,'donna'),(161,'Air Max','Nike',159.99,'Sneakers',38,'argento',10,'donna'),(162,'React vision','Nike',129.99,'Sneakers',37,'grigio',15,'donna'),(163,'Blazer','Nike',99.99,'Sneakers',42,'bianco',0,'donna'),(164,'Air Max','Nike',159.99,'Sneakers',37,'argento',0,'donna'),(165,'React vision','Nike',129.99,'Sneakers',36,'grigio',0,'donna'),(166,'Victori One','Nike',29.99,'Ciabatte',38,'rosa',10,'donna'),(167,'Asuna Print','Nike',49.99,'Ciabatte',29,'nere',27,'donna'),(168,'Air force 1','Nike',129.99,'Sneakers',37,'rosa',14,'donna'),(169,'Virgil Abloh Low','Off-White',259.99,'Sneakers',43,'bianco',5,'donna'),(170,'Victori One','Nike',29.99,'Ciabatte',39,'rosa',10,'donna'),(171,'Asuna Print','Nike',49.99,'Ciabatte',27,'nere',28,'donna'),(172,'Air force 1','Nike',129.99,'Sneakers',36,'rosa',12,'donna'),(173,'Virgil Abloh Low','Off-White',259.99,'Sneakers',38,'bianco',5,'donna'),(174,'Victori One','Nike',29.99,'Ciabatte',34,'rosa',0,'donna'),(175,'Asuna Print','Nike',49.99,'Ciabatte',26,'nere',0,'donna'),(176,'Air force 1','Nike',129.99,'Sneakers',38,'rosa',0,'donna'),(177,'Virgil Abloh Low','Off-White',259.99,'Sneakers',40,'bianco',0,'donna'),(178,'Superstar','Adidas',99.99,'Sneakers',45,'nere',45,'donna'),(179,'Top-Ten','Adidas',89.99,'Sneakers',37,'bianco',52,'donna'),(180,'Super court','Adidas',79.99,'Sneakers',40,'bianco',12,'donna'),(181,'Yeezy Bost 350','Adidas',139.99,'Sneakers',40,'grigio',10,'donna'),(182,'Anfibi Jadon','Dr Martens',179.99,'Stivali',44,'nero',25,'donna'),(183,'Blaine Loafer','Michael Kors',184.99,'Mocassino',34,'nero',10,'donna'),(184,'Air Jordan 1 Low Pink','Nike',179.9,'Sneakers',37,'rosa',5,'donna'),(185,'Superstar','Adidas',99.99,'Sneakers',42,'nere',45,'donna'),(186,'Top-Ten','Adidas',89.99,'Sneakers',36,'bianco',52,'donna'),(187,'Super court','Adidas',79.99,'Sneakers',35,'bianco',12,'donna'),(188,'Yeezy Bost 350','Adidas',139.99,'Sneakers',35,'grigio',10,'donna'),(189,'Anfibi Jadon','Dr Martens',179.99,'Stivali',45,'nero',25,'donna'),(190,'Blaine Loafer','Michael Kors',184.99,'Mocassino',39,'nero',10,'donna'),(191,'Air Jordan 1 Low Pink','Nike',179.9,'Sneakers',38,'rosa',5,'donna'),(192,'Superstar','Adidas',99.99,'Sneakers',41,'nere',0,'donna'),(193,'Top-Ten','Adidas',89.99,'Sneakers',35,'bianco',0,'donna'),(194,'Super court','Adidas',79.99,'Sneakers',34,'bianco',0,'donna'),(195,'Yeezy Bost 350','Adidas',139.99,'Sneakers',37,'grigio',0,'donna'),(196,'Anfibi Jadon','Dr Martens',179.99,'Stivali',42,'nero',0,'donna'),(197,'Blaine Loafer','Michael Kors',184.99,'Mocassino',38,'nero',0,'donna'),(198,'Air Jordan 1 Low Pink','Nike',179.9,'Sneakers',39,'rosa',0,'donna'),(199,'Air Force  07','Nike',99.99,'Sneakers',44,'bianco',20,'uomo'),(200,'Air Force  07','Nike',99.99,'Sneakers',41,'bianco',20,'uomo'),(201,'Air Force  07','Nike',99.99,'Sneakers',45,'bianco',0,'uomo'),(202,'Dunk Low Retro','Nike',389.99,'Sneakers',44,'nero',8,'uomo'),(203,'Air Jordan 1 Retro High Black','Nike',179.99,'Sneakers',43,'nero',14,'uomo'),(204,'Superstar','Adidas',89.99,'Sneakers',41,'bianco',45,'uomo'),(205,'Yeezy Bost 350','Adidas',159.99,'Sneakers',44,'grigio',10,'uomo'),(206,'Blazer Mid 77','Nike',99.99,'Sneakers',44,'verde',10,'uomo'),(207,'Virgil Abloh Low','Off-White',259.99,'Sneakers',45,'bianco',13,'uomo'),(208,'Air Max','Nike',179.99,'Sneakers',39,'nero',12,'uomo'),(209,'Air Jordan Dior','Nike',899.99,'Sneakers',40,'bianco',12,'uomo'),(210,'Dunk Low Retro','Nike',389.99,'Sneakers',43,'nero',8,'uomo'),(211,'Air Jordan 1 Retro High Black','Nike',179.99,'Sneakers',42,'nero',14,'uomo'),(212,'Superstar','Adidas',89.99,'Sneakers',48,'bianco',45,'uomo'),(213,'Yeezy Bost 350','Adidas',159.99,'Sneakers',43,'grigio',10,'uomo'),(214,'Blazer Mid 77','Nike',99.99,'Sneakers',45,'verde',10,'uomo'),(215,'Virgil Abloh Low','Off-White',259.99,'Sneakers',42,'bianco',15,'uomo'),(216,'Air Max','Nike',179.99,'Sneakers',40,'nero',12,'uomo'),(217,'Air Jordan Dior','Nike',899.99,'Sneakers',44,'bianco',12,'uomo'),(218,'Dunk Low Off-White Pine Green','Nike',179.99,'Sneakers',43,'verde',15,'uomo'),(219,'Dunk Low Retro','Nike',389.99,'Sneakers',41,'nero',0,'uomo'),(220,'Air Jordan 1 Retro High Black','Nike',179.99,'Sneakers',45,'nero',0,'uomo'),(221,'Superstar','Adidas',89.99,'Sneakers',45,'bianco',0,'uomo'),(222,'Yeezy Bost 350','Adidas',159.99,'Sneakers',42,'grigio',0,'uomo'),(223,'Blazer Mid 77','Nike',99.99,'Sneakers',47,'verde',0,'uomo'),(224,'Virgil Abloh Low','Off-White',259.99,'Sneakers',44,'bianco',0,'uomo'),(225,'Air Max','Nike',179.99,'Sneakers',46,'nero',0,'uomo'),(226,'Air Jordan Dior','Nike',899.99,'Sneakers',43,'bianco',0,'uomo'),(227,'Dunk Low Off-White Pine Green','Nike',179.99,'Sneakers',42,'verde',0,'uomo'),(228,'Dunk High','Nike',179.99,'Sneakers',42,'bianco',12,'uomo'),(229,'2976 Chelsea','Dr Martens',189.99,'Stivaletti',40,'nero',16,'uomo'),(231,'Air Jordan 1 Retro High','Nike',1499.99,'Sneakers',44,'blu',25,'uomo'),(232,'Air Jordan 1 Chicago','Nike',145.99,'Sneakers',44,'rosso',12,'uomo'),(234,'Yeezy Bost 350','Adidas',159.99,'Sneakers',41,'nero',21,'uomo'),(235,'Asuna Print','Nike',39.99,'Ciabatte',47,'nero',45,'uomo'),(236,'Asuna Print','Nike',39.99,'Ciabatte',43,'rosso',45,'uomo'),(237,'Stan Smith','Adidas',89.99,'Sneakers',38,'bianco',45,'uomo'),(238,'Stan Smith B','Adidas',89.99,'Sneakers',39,'nero',53,'uomo'),(239,'Air Force 07 Wb','Nike',129.99,'Sneakers',41,'marrone',52,'uomo'),(240,'Dunk High','Nike',179.99,'Sneakers',46,'bianco',12,'uomo'),(241,'2976 Chelsea','Dr Martens',189.99,'Stivaletti',41,'nero',18,'uomo'),(242,'1461 Virginia','Dr Martens',159.99,'Stringate',45,'nero',43,'uomo'),(243,'Air Jordan 1 Retro High','Nike',1499.99,'Sneakers',42,'blu',25,'uomo'),(244,'Air Jordan 1 Chicago','Nike',145.99,'Sneakers',39,'rosso',12,'uomo'),(245,'Yeezy Bost 350','Adidas',159.99,'Sneakers',40,'nero',21,'uomo'),(246,'Asuna Print','Nike',39.99,'Ciabatte',44,'nero',45,'uomo'),(247,'Asuna Print','Nike',39.99,'Ciabatte',42,'rosso',45,'uomo'),(248,'Stan Smith','Adidas',89.99,'Sneakers',42,'bianco',45,'uomo'),(249,'Stan Smith B','Adidas',89.99,'Sneakers',44,'nero',53,'uomo'),(250,'Air Force 07 Wb','Nike',129.99,'Sneakers',44,'marrone',52,'uomo'),(251,'Dunk High','Nike',179.99,'Sneakers',44,'bianco',0,'uomo'),(252,'2976 Chelsea','Dr Martens',189.99,'Stivaletti',44,'nero',0,'uomo'),(253,'1461 Virginia','Dr Martens',159.99,'Stringate',42,'nero',10,'uomo'),(254,'Air Jordan 1 Retro High','Nike',1499.99,'Sneakers',41,'blu',0,'uomo'),(255,'Air Jordan 1 Chicago','Nike',145.99,'Sneakers',46,'rosso',0,'uomo'),(256,'Yeezy Bost 350','Adidas',159.99,'Sneakers',45,'nero',0,'uomo'),(257,'Asuna Print','Nike',39.99,'Ciabatte',48,'nero',0,'uomo'),(258,'Asuna Print','Nike',39.99,'Ciabatte',47,'rosso',0,'uomo'),(259,'Stan Smith','Adidas',89.99,'Sneakers',45,'bianco',0,'uomo'),(260,'Stan Smith B','Adidas',89.99,'Sneakers',47,'nero',0,'uomo'),(261,'Air Force 07 Wb','Nike',129.99,'Sneakers',45,'marrone',0,'uomo'),(262,'Blazer Mid Gs','Nike',59.99,'Sneakers',27,'rosso',50,'bambino'),(263,'Blazer Mid Gs','Nike',59.99,'Sneakers',26,'rosso',50,'bambino'),(264,'Blazer Mid Gs','Nike',59.99,'Sneakers',25,'rosso',0,'bambino'),(265,'Superstar Black','Adidas',59.99,'Sneakers',27,'nero',78,'bambino'),(266,'Dunk Low Pink','Nike',69.99,'Sneakers',25,'rosa',45,'bambino'),(267,'Air Jordan 1 Mid','Nike',79.99,'Sneakers',27,'nero',44,'bambino'),(268,'Yeezy Bost 350','Adidas',79.99,'Sneakers',28,'nero',25,'bambino'),(269,'Air Force 07','Nike',89.99,'Sneakers',27,'bianco',25,'bambino'),(270,'Dunk Low Retro','Nike',69.99,'Sneakers',30,'nero',25,'bambino'),(271,'Superstar White','Adidas',59.99,'Sneakers',26,'bianco',24,'bambino'),(272,'Asuna Print','Nike',19.99,'Ciabatte',23,'rosa',23,'bambino'),(273,'Crocs Classic','Crocs',19.99,'Ciabatte',21,'blu',23,'bambino'),(274,'Superstar Black','Adidas',59.99,'Sneakers',26,'nero',78,'bambino'),(275,'Dunk Low Pink','Nike',69.99,'Sneakers',28,'rosa',45,'bambino'),(276,'Air Jordan 1 Mid','Nike',79.99,'Sneakers',26,'nero',45,'bambino'),(277,'Yeezy Bost 350','Adidas',79.99,'Sneakers',24,'nero',25,'bambino'),(278,'Air Force 07','Nike',89.99,'Sneakers',31,'bianco',25,'bambino'),(279,'Dunk Low Retro','Nike',69.99,'Sneakers',28,'nero',25,'bambino'),(280,'Superstar White','Adidas',59.99,'Sneakers',24,'bianco',24,'bambino'),(281,'Asuna Print','Nike',19.99,'Ciabatte',24,'rosa',23,'bambino'),(282,'Crocs Classic','Crocs',19.99,'Ciabatte',23,'blu',23,'bambino'),(283,'Superstar Black','Adidas',59.99,'Sneakers',24,'nero',0,'bambino'),(284,'Dunk Low Pink','Nike',69.99,'Sneakers',26,'rosa',0,'bambino'),(285,'Air Jordan 1 Mid','Nike',79.99,'Sneakers',30,'nero',0,'bambino'),(286,'Yeezy Bost 350','Adidas',79.99,'Sneakers',27,'nero',0,'bambino'),(287,'Air Force 07','Nike',89.99,'Sneakers',32,'bianco',0,'bambino'),(288,'Dunk Low Retro','Nike',69.99,'Sneakers',24,'nero',0,'bambino'),(289,'Superstar White','Adidas',59.99,'Sneakers',32,'bianco',0,'bambino'),(290,'Asuna Print','Nike',19.99,'Ciabatte',30,'rosa',0,'bambino'),(291,'Crocs Classic','Crocs',19.99,'Ciabatte',25,'blu',0,'bambino'),(292,'Air Force 1 ExperimentalL','Nike',179.99,'Sneakers',43,'nero',15,'uomo'),(293,'Air Force 1 ExperimentalL','Nike',179.99,'Sneakers',44,'nero',15,'uomo'),(294,'Air Force 1 ExperimentalL','Nike',179.99,'Sneakers',45,'nero',0,'uomo'),(295,'MA2','Jordan',159.99,'Sneakers',44,'bianco',21,'uomo'),(296,'MA2','Jordan',159.99,'Sneakers',42,'bianco',21,'uomo'),(297,'MA2','Jordan',159.99,'Sneakers',41,'bianco',0,'uomo'),(298,'Dunk Low Off-White Pine Green','Nike',179.99,'Sneakers',41,'verde',15,'uomo'),(299,'Dunk Low Green Glow','Nike',99.99,'Sneakers',38,'verde',25,'donna'),(300,'Dunk Low Green Glow','Nike',99.99,'Sneakers',37,'verde',25,'donna'),(301,'Dunk Low Green Glow','Nike',99.99,'Sneakers',36,'verde',0,'donna'),(302,'Dunk Low Yellow Strike','Nike',99.99,'Sneakers',38,'gialle',0,'donna'),(303,'Dunk Low Yellow Strike','Nike',99.99,'Sneakers',37,'gialle',24,'donna'),(304,'Dunk Low Yellow Strike','Nike',99.99,'Sneakers',36,'gialle',24,'donna'),(306,'2976 Chelsea','Dr Martens',189.99,'Stivaletti',35,'nero',10,'uomo'),(307,'Air Force 1 ExperimentalL','Nike',179.99,'Sneakers',35,'nero',1,'uomo'),(308,'1461 Virginia','Dr Martens',159.99,'Stringate',38,'nero',19,'uomo'),(309,'1461 Virginia','Dr Martens',159.99,'Stringate',40,'nero',0,'uomo'),(310,'1461 Virginia','Dr Martens',159.99,'Stringate',41,'nero',20,'uomo'),(311,'1461 Virginia','Dr Martens',159.99,'Stringate',46,'nero',20,'uomo'),(312,'1461 Virginia','Dr Martens',159.99,'Stringate',39,'nero',20,'uomo'),(313,'1461 Virginia','Dr Martens',159.99,'Stringate',37,'nero',21,'uomo');
/*!40000 ALTER TABLE `prodotto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-20 16:44:08
