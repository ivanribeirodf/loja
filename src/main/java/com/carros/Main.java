package com.carros;

import com.carros.tipos.Carro;
import com.carros.tipos.SUV;
import com.carros.tipos.Sedan;

public class Main {
    public static void main(String[] args) {
        Carro meuSedan = new Sedan("Toyota", "Coralla", 2023, 470);
        Carro meuSUV = new SUV("Jeep", "Compass", 2024, true);

        meuSedan.exibirDetalhes();
        meuSedan.acelerar();

        System.out.println("--------------");

        meuSUV.exibirDetalhes();
        meuSUV.acelerar();
    }
}
