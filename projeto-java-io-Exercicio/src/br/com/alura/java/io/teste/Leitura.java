package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Leitura {

    public static void main(String[] args) throws IOException {

        /**
         * 1. FileInputStream cria o fluxo com o arquivo de texto
         * 2. InputStreamReader transforma o fluxo de bytes em caracteres
         * 3. BufferedReader (br) converte os caracteres em String
         * 4. Utilizamos o método br.readLine() com um laço for ou while para ler as
         * linhas do arquivo de texto
         */

        InputStream fis = new FileInputStream("Meu arquivo de texto.txt");
        Reader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String minhaLinha = br.readLine(); // <-- Lendo a primeira linha do meu.txt e guardando a string na variável minhaLinha

        OutputStream fos = new FileOutputStream("lorem2.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write(minhaLinha);

        br.close();
        bw.close();

    }

}