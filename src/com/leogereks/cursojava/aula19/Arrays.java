package com.leogereks.cursojava.aula19;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double[]temperaturaAnual = new double[365];

        temperaturaAnual[0] = 31.3;
        temperaturaAnual[1] = 32;
        temperaturaAnual[2] = 35.3;
        temperaturaAnual[3] = 34.3;
        temperaturaAnual[4] = 33.3;

        System.out.println("Temperatura dia 1 "+temperaturaAnual[0]);
        System.out.println("Tamanho do array "+temperaturaAnual.length);
        System.out.println("Valores array: ");

        for (int i = 0; i<temperaturaAnual.length; i++){
            //System.out.println("Valor da temperatura do dia "+(i+1)+" é:"+temperaturaAnual[i]);
            //System.out.println(temperaturaAnual[i]);
        }

        for (double temp : temperaturaAnual){
            System.out.println(temp);
        }

    }
}
