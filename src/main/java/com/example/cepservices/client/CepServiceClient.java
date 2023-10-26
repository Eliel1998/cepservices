package com.example.cepservices.client;

import com.example.cepservices.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cepService", url = "https://viacep.com.br")
public interface CepServiceClient {

    @GetMapping("/ws/{cep}/json")
    Endereco getEndereco(@PathVariable String cep);
}
