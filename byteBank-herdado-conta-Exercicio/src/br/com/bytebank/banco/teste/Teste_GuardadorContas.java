package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class Teste_GuardadorContas {

    public static void main(String[] args) {

        // 1. Criando referência do tipo Guardador de Contas
        Guardador_de_Contas guardador = new Guardador_de_Contas();

        // 2. Criando as referências ContaCorrente & ContaPoupança para teste
        Conta cc = new ContaCorrente(11, 22);
        Conta cp = new ContaPoupanca(11, 44);
        
        // 2.1 Adicionando as referências no guardador
        guardador.adiciona(cc);
        guardador.adiciona(cp);

    }

}