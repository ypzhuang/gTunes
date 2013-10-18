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
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1
 */