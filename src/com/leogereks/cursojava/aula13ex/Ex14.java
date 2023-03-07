package com.leogereks.cursojava.aula13ex;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de download");
        System.out.println("Informe tamanho arquivo que deseja baixar em MB:");
        double tamanhoArquivo = scanner.nextDouble();

        System.out.println("Informe velocidade da sua conexao em MBps:");
        double internet = scanner.nextDouble();

        double tempoDown = tamanhoArquivo/internet;
        System.out.println("Seu download será realizado em aproximadamente: "+tempoDown+" minutos");
    }
}
