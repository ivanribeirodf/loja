package com.empresa.veiculos.carros.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.veiculos.carros.model.Carro;
import com.empresa.veiculos.carros.repository.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public List<Carro> listarTodos(){
        return repository.findAll();
    }
    
    public Optional<Carro> buscarPorId(UUID id){
        return repository.findById(id);
    }

    public Carro salvar(Carro carro){
        return repository.save(carro);
    }

    public void excluir(UUID id){
        repository.deleteById(id);
    }
}
