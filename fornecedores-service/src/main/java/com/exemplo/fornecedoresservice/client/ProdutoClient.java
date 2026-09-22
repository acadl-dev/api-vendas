package com.exemplo.fornecedoresservice.client;

import com.exemplo.fornecedoresservice.dto.ProdutoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * Cliente Feign para o produtos-service. O nome "produtos-service" e' o mesmo
 * registrado no Eureka, entao o Feign descobre o endereco sozinho (nao
 * precisamos de URL fixa aqui).
 */
@FeignClient(name = "produtos-service")
public interface ProdutoClient {

    @GetMapping("/produtos")
    List<ProdutoDTO> listarTodos();
}
