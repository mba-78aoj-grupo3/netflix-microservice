package com.allmoviesbygenre

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AllMoviesByGenreApplication

fun main(args: Array<String>) {
    runApplication<AllMoviesByGenreApplication>(*args)
}

