package helloworld.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("/")
class HelloWorldController {

    @RequestMapping
    fun index() = "index"
}