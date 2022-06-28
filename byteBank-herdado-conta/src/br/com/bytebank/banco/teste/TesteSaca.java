package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteSaca {

    public static void main(String[] args) {

        Conta c1 = new ContaCorrente(123, 321);

        c1.deposita(200.0);

        try {
            c1.saca(210.0);
        } catch (SaldoInsuficienteException saldoException) {
            System.out.println("Operação de Saque não realizada, saldo insuficiente...");
            System.out.println(saldoException.getMessage());
        }

        System.out.println(c1.getSaldo());
    }

}