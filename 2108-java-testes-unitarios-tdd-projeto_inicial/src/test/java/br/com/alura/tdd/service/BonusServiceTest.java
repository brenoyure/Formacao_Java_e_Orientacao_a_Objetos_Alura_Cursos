package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	private static final BigDecimal zero = new BigDecimal("0.00");

	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Thiago", LocalDate.now(), new BigDecimal("25000")));

		assertEquals(zero, bonus);
	}

	@Test
	void bonusDe250ParaSalarioDe2500Reais() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Breno", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.00"), bonus);
	}

	@Test
	void bonusDoFuncionarioComSalarioIguala10milDeveraSerDe1000Reais() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Inácio", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

	@Test
	void bonusDoFuncionarioComDezMileUmDeveSerZero() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Cibere", LocalDate.now(), new BigDecimal("10001")));

		assertEquals(zero, bonus);
	}

	@Test
	void bonusParaFuncionarioCom9999DeSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Amanda", LocalDate.now(), new BigDecimal("9999")));

		assertEquals(new BigDecimal("999.90"), bonus);
	}

}
