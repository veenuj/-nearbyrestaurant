CREATE DATABASE  IF NOT EXISTS `nearbyrest`;
USE `nearbyrest`;
--
-- Table structure for table `employee`
--
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
INSERT INTO `user` VALUES
	(1,'Anuj','Dhiman','veenuj@eurotech.com'),
	(2,'Vaaishali','Dhiman','vd@eurotech.com'),
	(3,'Sathya','naryan','ns@eurotech.com'),
	(4,'meenal','v','mini@eurotech.com'),
	(5,'Juan','Vega','juan@eurotech.com');

DROP TABLE IF EXISTS `location`;
CREATE TABLE `location` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `location` varchar(45) DEFAULT NULL,
  `state` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
 INSERT INTO `location` VALUES
	(1,'Meerut','UP'),
	(2,'Muzaffarnagar','UP'),
	(3,'Noida','NCR'),
	(4,'Worli','Mumbai'),
	(5,'Manali','HP');
 
 DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `food_name` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
 ) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
  INSERT INTO `order` VALUES
	(1,'Momos','40'),
	(2,'dosa','60'),
	(3,'Idli','40'),
	(4,'SPring roll','90');
	

DROP TABLE IF EXISTS `restaurant`;
CREATE TABLE `restaurant` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
   `user_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_LOCATION_idx` (`location_id`),
  KEY `FK_ORDER_idx` (`order_id`),
  KEY `FK_USER_idx` (`user_id`),
  CONSTRAINT `FK_LOCATION` FOREIGN KEY (`location_id`) REFERENCES `location` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_USER` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `FK_ORDER` FOREIGN KEY (`order_id`) REFERENCES `order` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;
 INSERT INTO `restaurant` VALUES
	(1,'VEENUJ CAFE',2,3,2),
	(2,'Vs stars',1,3,5),
	(3,'Biggies',5,4,1),
	(4,'dominoss',1,2,1);
