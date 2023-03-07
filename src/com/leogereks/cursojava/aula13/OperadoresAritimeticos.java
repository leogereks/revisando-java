package com.leogereks.cursojava.aula13;

public class OperadoresAritimeticos {

    public static void main(String[] args) {
        int resultado = 1+2;
        System.out.println(resultado);

        resultado = resultado -1;
        System.out.println(resultado);

        resultado = resultado*2;
        System.out.println(resultado);

        resultado = resultado/2;
        System.out.println(resultado);

        resultado = resultado+8;
        System.out.println(resultado);

        resultado = resultado%7;
        System.out.println(resultado);

        String primeiroNome = "Essa eh";
        String segundoNome = " String concatenada";
        String terceiroNome = primeiroNome+segundoNome;
        System.out.println(terceiroNome);
    }
}
