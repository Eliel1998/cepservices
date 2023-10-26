package com.example.cepservices.controller;

import com.example.cepservices.client.CepServiceClient;
import com.example.cepservices.model.Endereco;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
@AllArgsConstructor
public class CepController {

    private final CepServiceClient client;

    @GetMapping("{cep}")
    public Endereco getEndereco(@PathVariable String cep) {
        return client.getEndereco(cep);
    }
}
