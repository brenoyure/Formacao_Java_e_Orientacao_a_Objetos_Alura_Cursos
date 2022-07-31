package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class TesteEscritaPrintStreamPrintWriter {

    public static void main(String[] args) throws IOException {

        // PrintStream ps = new PrintStream("lorem2.txt");
        PrintWriter pw = new PrintWriter("lorem2.txt", StandardCharsets.UTF_8);

        pw.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        pw.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        pw.close();

    }

}