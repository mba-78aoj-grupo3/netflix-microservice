package com.allmoviesbygenre

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RefreshScope
@RestController
class MessageController {
    @Value("\${value1:}")
    private val message: String? = null

    @RequestMapping("/message")
    fun getMessage(): String? {
        return message
    }
}
