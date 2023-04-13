package com.leogereks.cursojava.aula22.labs.ex1;

public class Lampada {
    
    String marca, modelo, cor;
    int watts;
    double preco;
    boolean ligada;

    void ligar(){
        ligada = true;
    }
    void desligar(){
        ligada = false;
    }
    void mostrarEstado(){
        if (ligada){
            System.out.println("Lampada ligada");
        }else {
            System.out.println("Lampada desligada");
        }
    }
    void mudarEstado(){
        if (ligada){
            desligar();
        }else {
            ligar();
        }
    }
}
