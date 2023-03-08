package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double popA;
        double popB;
        double taxaA;
        double taxaB;

        boolean valido = false;
        do {
            System.out.println("Informe a populacao do pais A:");
            popA=scanner.nextDouble();

            if (popA > 0){
                valido = true;
            } else {
                System.out.println("Populacao invalida, entre com numero > 0 ");
            }
        }while (!valido);

        valido = false;
        do {
            System.out.println("Informe a taxa de crescimento referente ao pais A:");
            taxaA=scanner.nextDouble();

            if (taxaA > 0){
                valido = true;
            } else {
                System.out.println("Informe a taxa de crescimento > 0 ");
            }
        }while (!valido);

        valido = false;
        do {
            System.out.println("Informe a populacao do pais B:");
            popB=scanner.nextDouble();

            if (popB > 0){
                valido = true;
            } else {
                System.out.println("Populacao invalida, entre com numero > 0 ");
            }
        }while (!valido);

        valido = false;
        do {
            System.out.println("Informe a taxa de crescimento referente ao pais B:");
            taxaB=scanner.nextDouble();

            if (taxaB > 0){
                valido = true;
            } else {
                System.out.println("Informe a taxa de crescimento > 0 ");
            }
        }while (!valido);

        int cont = 0;

        while (popA <= popB){
            popA+=(popA/100)*taxaA;
            popB+=(popB/100)*taxaB;
            cont++;
        }
        System.out.println("Populacao pais A: "+popA);
        System.out.println("Populacao pais B: "+popB);
        System.out.println("Anos: "+cont);
    }
    }
