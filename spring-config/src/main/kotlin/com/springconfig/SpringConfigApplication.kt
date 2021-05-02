package com.springconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class SpringConfigApplication

fun main(args: Array<String>) {
    runApplication<SpringConfigApplication>(*args)
}
