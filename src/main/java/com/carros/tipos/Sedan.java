package com.carros.tipos;

public class Sedan extends Carro {
    private int capacidadePortaMalas;

    public Sedan(String marca, String modelo, int ano, int capacidadePortaMalas){
        super(marca, modelo,ano);
        this.capacidadePortaMalas = capacidadePortaMalas;
    }

    @Override
    public void acelerar(){
        System.out.println("O Sedan acelera suavemente...");
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Capacidade do porta-malas:" + capacidadePortaMalas + "litros." );
    }

}
