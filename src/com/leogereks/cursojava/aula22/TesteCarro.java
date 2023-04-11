package com.leogereks.cursojava.aula22;

public class TesteCarro {
    public static void main(String[] args) {

        Carro van = new Carro();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
        System.out.println(van.modelo);
        van.exibirAutonomia();

        Carro fusca = new Carro();

        fusca.marca = "Volkswagen";
        fusca.modelo = "fusca";
        fusca.numPassageiros = 4;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
        fusca.exibirAutonomia();

        double autonomia = van.obterAutonomia();
        System.out.println("Autonomia obtida do carro é: "+autonomia);

        double qtdCombustivel = van.calculaCombustivel(10);

        System.out.println("Para andar 10km e necesario: "+qtdCombustivel);
    }
}
