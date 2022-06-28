package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteTributaveis {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(111, 2222);
        cc.deposita(100);

        SeguroDeVIda seguro = new SeguroDeVIda();

        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();

        calculadoraImposto.registra(cc);
        calculadoraImposto.registra(seguro);

        System.out.println(calculadoraImposto.getValorImposto());

    }

}