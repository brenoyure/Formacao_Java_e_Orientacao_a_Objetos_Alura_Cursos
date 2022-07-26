package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class Escrita {

    public static void main(String[] args) throws IOException {

        /**
         * 
         * 1. Utilizando o OutputStream para criar o fluxo com o arquivo, escrever bytes
         * em um arquivo.
         * 2. BufferedWriter que vai receber as strings e transformar em caracteres
         * 3. OutputStreamWriter para transformar os caracteres em bits e bytes
         * 
         */
        OutputStream fos = new FileOutputStream("Meu arquivo de texto.txt");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("Escrevendo meu primeiro arquivo de texto com a ajuda do OutputStream do Java.");
        bw.newLine();
        bw.newLine();
        bw.write("Após isso, utilizaremos o InputStream para imprimir no console.");

        bw.close();
    }

}