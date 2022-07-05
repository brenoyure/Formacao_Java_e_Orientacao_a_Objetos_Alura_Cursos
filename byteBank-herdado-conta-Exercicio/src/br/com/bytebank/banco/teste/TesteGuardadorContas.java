package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;

public class TesteGuardadorContas {

    public static void main(String[] args) {

        // 1. Criando a referência para o Guardador de Contas (Array)
        GuardadorDeContas guardador = new GuardadorDeContas();

        // 2. Criando a ContaCorrente "CC" & Adicionando ao guardador.
        Conta cc = new ContaCorrente(11, 22);
        guardador.adiciona(cc);

        // 3. Criando uma segunda Conta (CP) e adicionando na próxima posição do
        // guardador
        Conta cp = new ContaPoupanca(11, 44);
        guardador.adiciona(cp);

        

    }

}