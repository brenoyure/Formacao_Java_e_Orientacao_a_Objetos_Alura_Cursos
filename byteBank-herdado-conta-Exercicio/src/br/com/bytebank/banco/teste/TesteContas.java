package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteContas {

    public static void main(String[] args) throws SaldoInsuficienteException {

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(100.0);

        cc.transfere(cp, 100);
        
        /**
         * Método CP
         */

        System.out.println("Método CC: " + cc.getSaldo());
        System.out.println("Método CP: " + cp.getSaldo());

        /*
         * 
         * 
         * cc.transfere(cp, 90);
         * 
         * System.out.println("CP: " + cp.getSaldo());
         * System.out.println("CC: " + cc.getSaldo());
         * 
         */

        System.out.println("Fim da Operação.");

    }

}