package ru.sp.example.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.sp.example.dto.HelloDto

@RestController
class ExampleController {
    @GetMapping("/api/hello")
    fun hello() = HelloDto("Hello world!")
}
