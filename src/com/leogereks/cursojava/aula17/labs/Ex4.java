package com.leogereks.cursojava.aula17.labs;

public class Ex4 {
    public static void main(String[] args) {

        int paisA = 80000;
        int paisB = 200000;
        int cont=0;

        while (paisA <= paisB){
            paisA+=(paisA/100)*3;
            paisB+=(paisB/100)*1.5;
            cont++;
        }
        System.out.println("Populacao pais A: "+paisA);
        System.out.println("Populacao pais B: "+paisB);
        System.out.println("Anos: "+cont);
    }
}
