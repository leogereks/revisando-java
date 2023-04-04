package com.leogereks.cursojava.aula20.labs;

import java.util.Scanner;

public class Ex5 {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            String[][][] compromissos = new String[12][31][24];

            boolean sair = false;
            byte opcao;

            while (!sair) {
                System.out.println("Digite 1 para adicionar compromisso.");
                System.out.println("Digite 2 para verificar compromisso.");
                System.out.println("Digite 0 para sair.");

                opcao = scan.nextByte();

                switch (opcao) {
                    case 1:
                        boolean mesValido = false;
                        int mes = 0;
                        while (!mesValido) {
                            System.out.println("Entre com o mês");
                            mes = scan.nextInt();
                            if (mes > 0 && mes <= 12) {
                                mesValido = true;
                            } else {
                                System.out.println("Mes inválido, digite novamente");
                            }
                        }

                        boolean diaValido = false;
                        int dia = 0;
                        while (!diaValido) {
                            System.out.println("Entre com o dia do mes");
                            dia = scan.nextInt();
                            if (dia > 0 && dia <= 31) {
                                diaValido = true;
                            } else {
                                System.out.println("Dia inválido, digite novamente");
                            }
                        }

                        boolean horaValida = false;
                        int hora = 0;
                        while (!horaValida) {
                            System.out.println("Entre com a hora do compromisso");
                            hora = scan.nextInt();
                            if (hora >= 0 && hora <= 24) {
                                horaValida = true;
                            } else {
                                System.out.println("Hora inválida, digite novamente");
                            }
                        }

                        dia--;
                        mes--;
                        System.out.println("Digite o compromisso");
                        compromissos[mes][dia][hora] = scan.next();
                        break;

                    case 2:
                        mesValido = false;
                        mes = 0;
                        while (!mesValido) {
                            System.out.println("Entre com o mês");
                            mes = scan.nextInt();
                            if (mes > 0 && mes <= 12) {
                                mesValido = true;
                            } else {
                                System.out.println("Mes inválido, digite novamente");
                            }
                        }

                        diaValido = false;
                        dia = 0;
                        while (!diaValido) {
                            System.out.println("Entre com o dia do mês");
                            dia = scan.nextInt();
                            if (dia > 0 && dia <= 31) {
                                diaValido = true;
                            } else {
                                System.out.println("Dia inválido, digite novamente");
                            }
                        }

                        horaValida = false;
                        hora = 0;
                        while (!horaValida) {
                            System.out.println("Entre coma hora do compromisso");
                            hora = scan.nextInt();
                            if (hora >= 0 && hora <= 24) {
                                horaValida = true;
                            } else {
                                System.out.println("Hora inválida, digite novamente");
                            }
                        }

                        dia--;
                        mes--;
                        System.out.println("O compromisso agendado é:");
                        System.out.println(compromissos[mes][dia][hora]);
                        break;

                    case 0:
                        sair = true;
                        break;

                    default:
                        System.out.println("Opção inválida, digite novamente");
                        break;
                }
            }

        }
    }

