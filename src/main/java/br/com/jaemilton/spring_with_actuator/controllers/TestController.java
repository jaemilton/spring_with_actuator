package br.com.jaemilton.spring_with_actuator.controllers;

import br.com.jaemilton.spring_with_actuator.models.TestReturn;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public TestReturn getTestData()
    {
        var retorno = new TestReturn();
        retorno.setValue("Teste");
        return retorno;
    }

}
