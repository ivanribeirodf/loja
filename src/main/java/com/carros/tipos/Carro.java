package com.carros.tipos;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirDetalhes(){
        System.out.println("Carro: " + marca + " " + modelo + " " + "(" + ano +")");
    }

    public void acelerar(){
        System.out.println("O carro está acelerando...");
    }
}
