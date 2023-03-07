package com.leogereks.cursojava.aula17.labs;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean infoUser = false;
        String user;
        String senha;

        do {
            System.out.println("Entre com usuario:");
            user=scan.next();
            System.out.println("Entre com sua senha:");
            senha=scan.next();

            if (user.equalsIgnoreCase(senha)){
                infoUser=false;
                System.out.println("User e senha nao podem ter mesmo valor");
            }else {
                infoUser=true;
                System.out.println("Informacoes validas, cadastro realizado com sucesso");
            }
        } while (!infoUser);

    }
}
