package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Aula aulaIntro = new Aula("Introdução às Coleções", 20);
        Aula aulaModelando = new Aula("Modelando a Classe Aula", 18);
        Aula aulaSets = new Aula("Trabalhando com Conjuntos", 16);

        List<Aula> aulas = new ArrayList<Aula>();
        aulas.add(aulaIntro);
        aulas.add(aulaModelando);
        aulas.add(aulaSets);

        Collections.rotate(aulas, 5);

        for (Aula aula : aulas) {
            System.out.println(aula);
        }

    }

}

class ComparadorTitulo implements Comparator<Aula> {
    @Override
    public int compare(Aula a1, Aula a2) {
        return a1.getTitulo().compareTo(a2.getTitulo());
    }
}

class ComparadorTempo implements Comparator<Aula> {
    @Override
    public int compare(Aula a1, Aula a2) {
        return Integer.compare(a1.getTempo(), a2.getTempo());
    }
}

class Aula implements Comparable<Aula> {

    private int tempo;
    private String titulo;

    public Aula(String titulo, int tempo) {
        this.tempo = tempo;
        this.titulo = titulo;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // @Override
    // public int compareTo(Aula aula) {
    // return Integer.compare(this.getTempo(), aula.getTempo());
    // }

    @Override
    public int compareTo(Aula aula) {
        return this.getTitulo().compareTo(aula.getTitulo());
    }

    @Override
    public String toString() {
        return "Aula [Título=" + titulo + ", Tempo=" + tempo + "]";
    }

}