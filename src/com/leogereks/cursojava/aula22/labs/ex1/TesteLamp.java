package com.leogereks.cursojava.aula22.labs.ex1;

public class TesteLamp {

    public static void main(String[] args) {

        Lampada led = new Lampada();

        led.marca = "philips";
        led.modelo = "pequena";
        led.cor = "branca";
        led.watts = 10;
        led.preco = 8.5;

        System.out.println(led.marca);
        System.out.println(led.watts);
        System.out.println(led.preco);
    }
}
