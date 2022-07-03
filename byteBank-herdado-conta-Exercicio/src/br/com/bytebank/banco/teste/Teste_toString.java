package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste_toString {

    public static void main(String[] args) {

        Object cc = new ContaCorrente(123, 321);
        ContaPoupanca cp = new ContaPoupanca(123, 322);

        System.out.println(cc);
        System.out.println(cp);

    }

}