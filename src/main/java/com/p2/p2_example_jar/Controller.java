package com.p2.p2_example_jar;
import org.springframework.web.bind.annotation.*;


@RestController

public class Controller {

 

    @RequestMapping("/")

    public String home(){

        return "Hello World!";

    }

}
