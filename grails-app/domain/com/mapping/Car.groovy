package com.mapping

class Car {
    Engine engine
    static constraints = {
    }
}

/**
| car   | CREATE TABLE `car` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `version` bigint(20) NOT NULL,
  `engine_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK17FD4FBE0BC7` (`engine_id`),
  CONSTRAINT `FK17FD4FBE0BC7` FOREIGN KEY (`engine_id`) REFERENCES `engine` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 |
*/