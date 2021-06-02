package poc.yogendra.helloworld.controller


import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {
    @GetMapping("/test")
    fun test(): String = "This is a test application"

}