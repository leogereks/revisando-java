package com.leogereks.cursojava.aula20;

public class ArrayMulti {

    public static void main(String[] args) {

        double[][] notasAulunos = new double[3][4];

        notasAulunos[0][0] = 10;
        notasAulunos[0][1] = 7;
        notasAulunos[0][2] = 8;
        notasAulunos[0][3] = 9.5;

        notasAulunos[1][0] = 9;
        notasAulunos[1][1] = 8;
        notasAulunos[1][2] = 7;
        notasAulunos[1][3] = 9;

        notasAulunos[2][0] = 8;
        notasAulunos[2][1] = 9;
        notasAulunos[2][2] = 10;
        notasAulunos[2][3] = 7;

        for (int i =0; i < notasAulunos.length; i++){
            //System.out.println(notasAulunos[i]);
            for (int j = 0; j < notasAulunos[i].length; j++){
                System.out.print(notasAulunos[i][j]);
            }
            System.out.println();
        }

        notasAulunos[1][3] = 8;
        System.out.println();

        for (int i =0; i < notasAulunos.length; i++){
            //System.out.println(notasAulunos[i]);
            for (int j = 0; j < notasAulunos[i].length; j++){
                System.out.print(notasAulunos[i][j]+"-");
            }
            System.out.println();
        }

        System.out.println("Calculando a media de cada aluno");

        double soma=0;
        for (int i =0; i < notasAulunos.length; i++){

            for (int j = 0; j < notasAulunos[i].length; j++){
                soma+= notasAulunos[i][j];
            }
            System.out.println("Media do aluno "+i+" é = "+(soma/4));
        }

    }
}
