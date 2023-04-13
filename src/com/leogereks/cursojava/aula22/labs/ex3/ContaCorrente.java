package com.leogereks.cursojava.aula22.labs.ex3;

public class ContaCorrente {

    String numero, agencia;
    double saldo;
    double limiteEspecial;
    double especialUsado;
    boolean especial;

    boolean sacar(double quantiaSacar) {

        if (saldo >= quantiaSacar) {
           saldo -= quantiaSacar;
           return true;
        } else {
            if (especial){
                double limite = limiteEspecial + saldo;
                if (limite >= quantiaSacar){
                    saldo -= quantiaSacar;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
    }

}
