package com.leogereks.cursojava.aula22.labs.ex1;

public class TesteLamp {

    public static void main(String[] args) {

        Lampada lampadaLed = new Lampada();

        lampadaLed.marca = "philips";
        lampadaLed.modelo = "pequena";
        lampadaLed.cor = "branca";
        lampadaLed.watts = 10;
        lampadaLed.preco = 8.5;

        System.out.println(lampadaLed.marca);
        System.out.println(lampadaLed.watts);
        System.out.println(lampadaLed.preco);

        lampadaLed.ligar();
        System.out.println("A lampada esta: "+lampadaLed.ligada);
        lampadaLed.desligar();
        System.out.println("A lampada esta: "+lampadaLed.ligada);

        lampadaLed.mostrarEstado();
        lampadaLed.mudarEstado();
        lampadaLed.mostrarEstado();

        lampadaLed.mudarEstado();
        lampadaLed.mostrarEstado();

    }
}
