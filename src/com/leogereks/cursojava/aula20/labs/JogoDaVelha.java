package com.leogereks.cursojava.aula20.labs;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;
        while (!ganhou){

            if (jogada % 2 == 1){
                System.out.println("Vez do jogador 1, escolha linha e coluna (1-3)");
                sinal = 'X';
            }else{
                System.out.println("Vez do jogador 1, escolha linha e coluna (1-3)");
                sinal = 'O';
            }

            boolean linhaValida = false;
            while (!linhaValida){

                System.out.println("Entre com a linha (1-3)");
                linha = scanner.nextInt();

                if (linha >= 1 && linha <= 3){
                    linhaValida = true;
                }else {
                    System.out.println("Entrada invalida, tente novamente");
                }
            }

            boolean colunaValida = false;
            while (!colunaValida){

                System.out.println("Entre com a coluna (1-3)");
                coluna = scanner.nextInt();

                if (coluna >= 1 && coluna <= 3){
                    colunaValida = true;
                }else {
                    System.out.println("Entrada invalida, tente novamente");
                }
            }
            if (jogoDaVelha[linha][coluna] == 'X'|| jogoDaVelha[linha][coluna] == 'O'){
                System.out.println();
            }
        }
    }
}
