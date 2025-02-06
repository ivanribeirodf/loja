package com.empresa.veiculos.carros.controller;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.veiculos.carros.model.Carro;
import com.empresa.veiculos.carros.service.CarroService;

@RestController
@RequestMapping("/carros")
public class CarroController {
    @Autowired
    private CarroService service;

    @GetMapping
    public List<Carro> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Carro> buscarPorId(@PathVariable UUID id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public Carro criar(@RequestBody Carro carro) {
        return service.salvar(carro);
    }

    @DeleteMapping("/{id}")
    public String excluir(@PathVariable UUID id) {
        service.excluir(id);
        return "Carro removido com sucesso!";
    }
}
