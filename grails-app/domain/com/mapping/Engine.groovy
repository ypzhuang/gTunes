package com.mapping

class Engine {
    static belongsTo = [car: Car]
    static constraints = {
    }
}

/**
 | engine | CREATE TABLE `engine` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `version` bigint(20) NOT NULL,
 `car_id` bigint(20) NOT NULL,
 PRIMARY KEY (`id`),
 UNIQUE KEY `car_id` (`car_id`),
 KEY `FKB297FA426C2E30D` (`car_id`),
 CONSTRAINT `FKB297FA426C2E30D` FOREIGN KEY (`car_id`) REFERENCES `car` (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1 |
 */