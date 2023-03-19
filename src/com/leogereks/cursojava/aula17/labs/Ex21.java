package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com a qtd de turmas que deseja calcular:");
        int numTurmas = scan.nextInt();

        int numAlunos=0;
        int soma=0;
        boolean invalido = true;

        for (int i=1; i<=numTurmas; i++){

            invalido=true;
            do {
                System.out.println("Entre com a qtd de alunos por turma que deseja calcular: " +(i));
                numAlunos = scan.nextInt();

                if (numAlunos <= 40){
                    invalido = false;
                }else {
                    System.out.println("Numero de alunos invalidos, digite novamente");
                }
            }while (invalido);

            soma += numAlunos;
        }

        int mediaAlunos = soma/numTurmas;

        System.out.println("Media de alunos e "+mediaAlunos);

    }
}
