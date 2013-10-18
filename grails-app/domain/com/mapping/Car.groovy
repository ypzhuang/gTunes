package com.mapping

class Car {
    static hasOne = [engine: Engine]
    static constraints = {
    }
}

/**
 | car   | CREATE TABLE `car` (
 `id` bigint(20) NOT NULL AUTO_INCREMENT,
 `version` bigint(20) NOT NULL,
 PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=latin1 |
 */