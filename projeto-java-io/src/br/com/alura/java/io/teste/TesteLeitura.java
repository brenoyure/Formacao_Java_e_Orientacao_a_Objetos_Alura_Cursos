package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        // Fluxo de Entrada com Arquivo .txt
        // Criando fluxo concreto com arquivo (mas binário) <-- FileInputStream
        // <--throws FileNotFoundException
        // Dados binários para caractéres <-- InputStreamReader
        // Juntar os caracteres para leitura
        InputStream fis = new FileInputStream("lorem2.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        for (String linha = br.readLine(); linha != null; linha = br.readLine()) {
            System.out.println(linha);
        }
        br.close();
    }

}