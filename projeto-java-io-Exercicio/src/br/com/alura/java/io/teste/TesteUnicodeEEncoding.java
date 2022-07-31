package br.com.alura.java.io.teste;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

    public static void main(String[] args) throws IOException {

        Charset charset = Charset.defaultCharset();
        String s = "Ç";
        String sNovo = "";
        System.out.println(s.codePointAt(0));
        System.out.println("Chartset Padrão: " + charset);

        /**
         * Guarde os bytes em um array, e force o charset para windows-1252 (você
         * precisará adicionar um throws). Em seguida, imprima o tamanho do array:
         * 
         */

        byte[] bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println("Tamanho do array bytes[]: " + bytes.length);
        sNovo = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("Nova String: " + sNovo);

        bytes = s.getBytes(StandardCharsets.UTF_16);
        System.out.println("Tamanho do array bytes[]: " + bytes.length + ", UTF-16");
        sNovo = new String(bytes, StandardCharsets.UTF_16);
        System.out.println("Nova String: " + sNovo);

        bytes = s.getBytes(StandardCharsets.US_ASCII);
        System.out.println("Tamanho do array bytes[]: " + bytes.length + ", US_ASCII");
        sNovo = new String(bytes, StandardCharsets.US_ASCII);
        System.out.println("Nova String: " + sNovo);

        bytes = s.getBytes(StandardCharsets.UTF_8);
        System.out.println("Tamanho do array bytes[]: " + bytes.length + ", UTF-8");
        sNovo = new String(bytes, StandardCharsets.UTF_8);
        System.out.println("Nova String: " + sNovo);

        bytes = s.getBytes(StandardCharsets.ISO_8859_1);
        System.out.println("Tamanho do array bytes[]: " + bytes.length + ", ISO_8859_1");
        sNovo = new String(bytes, StandardCharsets.ISO_8859_1);
        System.out.println("Nova String: " + sNovo);

    }

}