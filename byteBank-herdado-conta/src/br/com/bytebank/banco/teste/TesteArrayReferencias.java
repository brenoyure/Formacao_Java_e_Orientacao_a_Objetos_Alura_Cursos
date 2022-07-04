package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteArrayReferencias {

    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;

        Cliente cliente = new Cliente();
        referencias[2] = cliente;

        System.out.println(((ContaPoupanca) referencias[1]).getNumeroConta());

        ContaPoupanca ref = (ContaPoupanca) referencias[1];
        System.out.println(cc2.getNumeroConta());
        System.out.println(ref.getNumeroConta());

    }

}