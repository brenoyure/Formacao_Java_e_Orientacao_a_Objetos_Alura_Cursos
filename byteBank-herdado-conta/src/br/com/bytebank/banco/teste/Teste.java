package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.*;

public class Teste {

    public static void main(String[] args) {

        Guardador_de_Contas guardador = new Guardador_de_Contas(10);

        Conta conta1 = new ContaCorrente(111, 222);
        Conta conta2 = new ContaPoupanca(111, 223);
        Conta conta3 = new ContaCorrente(112, 224);
        Conta conta4 = new ContaEspecial(223, 347);

        System.out.println(guardador.toString());
        guardador.adiciona(conta1);
        System.out.println(guardador.toString());
        guardador.adiciona(conta2);
        System.out.println(guardador.toString());
        guardador.adiciona(conta3);
        System.out.println(guardador.toString());
        guardador.adiciona(conta4);
        System.out.println(guardador.toString());

    }

}