package com.leogereks.cursojava.aula22.labs.ex3;

public class TestaConta {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.numero = "123";
        contaCorrente.agencia = "45";
        contaCorrente.especial = true;
        contaCorrente.limiteEspecial = 500;
        contaCorrente.especialUsado = 0;
        contaCorrente.saldo = -10;

        boolean saqueEfetuado = contaCorrente.sacar(10);
        if (saqueEfetuado){
            System.out.println("Sque efetuado com sucesso");
            System.out.println("Saldo atual = "+contaCorrente.saldo);
        }else{
            System.out.println("N foi possivel sacar pois seu saldo é insuficiente");
        }


    }
}
