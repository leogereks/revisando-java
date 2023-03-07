package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;
        do {
            System.out.println("Informe nota de 0 a 10:");
            int nota = scan.nextInt();

            if (nota >0 && nota<=10){
                notaValida=true;
                System.out.println("Vc informou "+nota);
            }else {
                System.out.println("Valor invalido, tente novamente");
            }
        } while (!notaValida);

    }
}
