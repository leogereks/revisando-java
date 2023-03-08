package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean validador = false;
        String nome,sexo,civil;
        int idade;
        double salario;

        do {
            System.out.println("Entre com um nome de ate 3 letras:");
            nome=scanner.next();
            if (nome.length()<=3){
                validador=true;
            }else {
                System.out.println("Nome invalido, digite novamente.");
            }
        }while (!validador);

        validador=false;
        do {
            System.out.println("Entre com a sua idade:");
            idade=scanner.nextInt();
            if (idade >=0 && idade <120){
                validador=true;
            }else {
                System.out.println("idade invalida, digite novamente.");
            }
        }while (!validador);

        validador=false;
        do {
            System.out.println("Entre com o seu salario:");
            salario=scanner.nextDouble();
            if (salario>0){
                validador=true;
            }else {
                System.out.println("salario invalido, digite novamente.");
            }
        }while (!validador);

        validador=false;
        do {
            System.out.println("Entre com o seu genero (m - masculino f - feminino):");
            sexo=scanner.next();
            if (sexo.equalsIgnoreCase("m")|| sexo.equalsIgnoreCase("f")){
                validador=true;
            }else {
                System.out.println("Invalido, digite novamente.");
            }
        }while (!validador);

        validador=false;
        do {
            System.out.println("Informe seu estado civil: (c,s,v,d)");
            civil=scanner.next();
            if (civil.equalsIgnoreCase("c")|| civil.equalsIgnoreCase("s")|| civil.equalsIgnoreCase("v")|| civil.equalsIgnoreCase("d")){
                validador=true;
            }else {
                System.out.println("Estado civil invalido, digite novamente.");
            }
        }while (!validador);

        System.out.println("Ficha cadastral:");
        System.out.println(nome);
        System.out.println(sexo);
        System.out.println(idade+" anos");
        System.out.println(civil);
        System.out.println(salario);

    }
}
