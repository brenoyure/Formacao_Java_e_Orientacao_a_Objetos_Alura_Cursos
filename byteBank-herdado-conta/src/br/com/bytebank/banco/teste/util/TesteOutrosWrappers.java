package br.com.bytebank.banco.teste.util;

import java.util.List;
import java.util.ArrayList;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(29);
		System.out.println(idadeRef.intValue());

		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());

		Boolean bRef = Boolean.TRUE;
		System.out.println(bRef.booleanValue());

		Number refNumero = Float.valueOf(29.9f);
		System.out.println(refNumero);

		List<Number> listaNumericos = new ArrayList<>();
		listaNumericos.add(refNumero);

		for (Number n : listaNumericos) {
			System.out.println(n);
		}

	}

}