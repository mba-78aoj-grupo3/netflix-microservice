package Application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GetAllMoviesByGenresApplication

fun main(args: Array<String>) {
    runApplication<GetAllMoviesByGenresApplication>(*args)
}
