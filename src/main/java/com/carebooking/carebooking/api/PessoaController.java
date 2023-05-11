package com.carebooking.carebooking.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

    @GetMapping(path = "/")
    public String home() {
        return "Hello World!";
    }


}
