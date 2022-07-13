package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste_Guardador_de_Contas {

    public static void main(String[] args) {

        Guardador_de_Contas guardador = new Guardador_de_Contas(10);

        Conta cc = new ContaCorrente(111, 222);
        Conta cp = new ContaPoupanca(111, 444);

        guardador.adiciona(cc);
        guardador.adiciona(cp);

        Conta ref = guardador.getReferencia(0);
        System.out.println(ref.getNumeroConta());

    }

}