package com.exemplo.somador;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/somar/{num1}/{num2}")
    public String somar(@PathVariable int num1, @PathVariable int num2) {
        int resultado = num1 + num2;
        return "O resultado da soma de " + num1 + " + " + num2 + " é " + resultado;
    }
}
