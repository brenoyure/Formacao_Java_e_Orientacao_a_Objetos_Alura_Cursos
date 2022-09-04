package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Funcionario;

//@SuppressWarnings("unused")
public class BonusService {

	private static final BigDecimal limiteDeBonus = new BigDecimal("1000.00");
	private static final String salarioMuitoAltoMSG = "Funcionário com salário maior que R$10,000 não pode receber bônus.";
	
	/**
	 * 
	 * @param funcionario
	 * @return valor do bônus
	 * @throws IllegalArgumentException caso o valor do bônus ultrapasse o valor permitido de R$1000.00.
	 */
	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		
		if (valor.compareTo(limiteDeBonus) > 0)
			throw new IllegalArgumentException(salarioMuitoAltoMSG);
		
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
