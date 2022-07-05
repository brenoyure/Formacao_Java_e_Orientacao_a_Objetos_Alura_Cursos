package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorObjects {

    public static void main(String[] args) {

        GuardadorDeObjects guardador = new GuardadorDeObjects();

    //  1. Criando referência do tipo CC, atribuindo o cliente e guardando no guardador
        Conta cc = new ContaCorrente(11, 22);
        Cliente clienteBreno = new Cliente();
        cc.setTitular(clienteBreno);
        clienteBreno.setNome("Breno Yuri");
        clienteBreno.setProfissao("Suporte TI");
        guardador.adiciona(cc);

        Conta cp = new ContaPoupanca(11, 44);
        guardador.adiciona(cp);

        Object ref = guardador.getReferencias(0);
        System.out.println(((Conta) ref).getNumeroConta());

    }

}