package com.empresa.veiculos.carros.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.empresa.veiculos.carros.model.Carro;
import java.util.UUID;

public interface CarroRepository extends JpaRepository<Carro, UUID> {
    
}
