package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteDeserializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		/**
		 * Adicione o código de leitura feito anteriormente, modificando o arquivo a ser
		 * lido. Leia a conta, guarde-a em uma variável e imprima seu saldo e o nome do
		 * titular
		 */

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cc.bin"));
		ContaCorrente cc = (ContaCorrente) ois.readObject();
		ois.close();

		System.out.println(cc.getTitular().getNome());
		System.out.println(cc.getSaldo());
		System.out.println(cc);

	}

}