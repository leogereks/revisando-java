package com.leogereks.cursojava.aula22;

public class Carro {

    String marca, modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia (){
        System.out.println("A autonomia do carro e: "+capCombustivel*consumoCombustivel+" km");
    }
    double obterAutonomia(){
        System.out.println("Obter autonomia foi chamado: ");
        return capCombustivel*consumoCombustivel;
    }
    double calculaCombustivel(double km){
        double qtdCombustivel = km/consumoCombustivel;
        return qtdCombustivel;
    }

}
