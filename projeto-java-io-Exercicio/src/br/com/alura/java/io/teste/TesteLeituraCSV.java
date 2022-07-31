package br.com.alura.java.io.teste;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraCSV {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(new File("contas.csv"), StandardCharsets.UTF_8);

        while (scanner.hasNext()) {
            String linha = scanner.nextLine();
            // System.out.println(linha);

            Scanner scannerLinha = new Scanner(linha);
            scannerLinha.useLocale(Locale.US);
            scannerLinha.useDelimiter(",");

            String tipoConta = scannerLinha.next();
            int agencia = scannerLinha.nextInt();
            int numeroConta = scannerLinha.nextInt();
            String titular = scannerLinha.next();
            double saldo = scannerLinha.nextDouble();

            /**
             * Utilizando o método estático format() da classe String para formatar os valores, baseado na locale atual
             * 
             */
            String formatada = String.format(new Locale("pt", "BR"), "%s %04d-%04d %s: %.2f", tipoConta, agencia, numeroConta, titular, saldo);
            System.out.println(formatada);

            /**
             * Utilizando o format() do System.out para já imprimir com os valores formatados <-- usando o %n para pular linha
             * 
             */
            System.out.format(new Locale("pt", "br"), "%s %04d-%04d %s: %.2f %n", tipoConta, agencia,
                    numeroConta, titular, saldo);

            scannerLinha.close();

        }

        scanner.close();

    }

}