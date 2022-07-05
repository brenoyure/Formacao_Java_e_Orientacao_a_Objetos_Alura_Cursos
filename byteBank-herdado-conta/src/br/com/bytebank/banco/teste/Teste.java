package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste {

    public static void main(String[] args) {

        Guardador_de_Contas guardador = new Guardador_de_Contas();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeElementos();
        System.out.println("Tamanho do Guardador: " + tamanho);

        Conta ref = guardador.getReferencia(0);

        System.out.println(ref);

    }

}