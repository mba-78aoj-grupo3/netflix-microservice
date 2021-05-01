package microservices.getallmoviesbygenrer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GetAllMoviesByGenrerApplication

fun main(args: Array<String>) {
    runApplication<GetAllMoviesByGenrerApplication>(*args)
}
