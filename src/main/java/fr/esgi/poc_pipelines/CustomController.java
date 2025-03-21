package fr.esgi.poc_pipelines;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomController {

    @GetMapping("/")
    public String up() {
        return "up";
    }

    @GetMapping("hello")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("toto")
    public String toto() {
        return "Hello World toto";
    }
}
