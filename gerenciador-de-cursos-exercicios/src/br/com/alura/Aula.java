package br.com.alura;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public int getTempo() {
		return this.tempo;
	}
	
	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.getTitulo());
	}

	@Override
	public String toString() {
		return "[Aula: " + this.getTitulo() + ", " + this.getTempo() + " minutos]";
	}

}