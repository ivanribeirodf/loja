package com.empresa.veiculos.carros.model;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "carros")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Carro {

    @Id
    @GeneratedValue
    private UUID id;

    private String marca;
    private String modelo;
    private int ano;
    
}