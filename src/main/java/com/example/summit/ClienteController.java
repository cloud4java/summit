package com.example.summit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    @GetMapping
    public String getCliente(){
        return "Hello Cliente Summit";
    }
}
