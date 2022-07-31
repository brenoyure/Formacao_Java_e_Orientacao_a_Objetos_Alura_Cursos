package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class TesteLeitura {

    public static void main(String[] args) throws IOException {

        /**
         * 1. Com o FileInputStream, criamos o fluxo com o arquivo txt (em bytes)
         * 2. Utilizamos o InputStreamReader para transformar os bytes em caracteres.
         * 3. Para lermos a linha inteira do arquivo, vamos instanciar o BufferedReader,
         * 3.1 utilizaremos o método readLine() para ler a linha.
         */
        InputStream fis = new FileInputStream("lorem.txt");
        Reader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }

}