package com.carros.tipos;

public class SUV extends Carro {
    private boolean tracao4x4;

    public SUV(String marca, String modelo, int ano, boolean tracao4x4){
        super(modelo, modelo, ano);
        this.tracao4x4 = tracao4x4;
    }

    @Override
    public void acelerar() {
        System.out.println("O SUV acelera com potência...");
    }

    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Tração 4x4: " + (tracao4x4 ? "Sim" : "Não"));
    }
}
