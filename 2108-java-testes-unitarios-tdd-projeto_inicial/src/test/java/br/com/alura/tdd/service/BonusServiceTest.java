package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	/**
	 * Devido uma mudança na regra de negócio no Serviço de Bonificação, o sistema
	 * não devolverá mais valor R$0,00 (zero) para funcionários cujo cáculo de
	 * bonificação ultrapasse o valor permitido.
	 * Devido a isso, a linha abaixo, que atribui um BigDecimal = 0.00 está comentada.
	 */
	/* private static final BigDecimal zero = new BigDecimal("0.00"); */

	
	/**
	 * String {@code failMessage} - Mensagem de erro para o método {@code fail()} do
	 * JUnit, em caso do teste falhar.
	 */
	private static final String failMessage = "Falha no JUnit Test, método não lançou exception!!!";

	/**
	 * String {@code salarioMuitoAltoExceptionMessage} - Mensagem de erro da
	 * exception que é lançanda caso o funcionário possua uma porcentagem de
	 * bonificação acima da permitida.
	 */
	private static final String salarioMuitoAltoExceptionMessage = "Funcionário com salário maior que R$10,000 não pode receber bônus.";

	/**
	 * Testando funcionário com salário acima do permitido para recebimento de bônus
	 * 
	 * @throws IllegalArgumentException pois o cálculo de bonificação retornou um
	 *                                  valor acima do permitido.
	 */
	@Test
	void bonusDeveriaSerZeroParaFuncionarioComSalarioMuitoAlto() {
		BonusService service = new BonusService();

		try {
			service.calcularBonus(new Funcionario("Thiago", LocalDate.now(), new BigDecimal("25000")));
			fail(failMessage);
		} catch (IllegalArgumentException e) {
			assertEquals(salarioMuitoAltoExceptionMessage, e.getMessage());

		}

	}

	/**
	 * Testando funcionário com salário acima do permitido para recebimento de bônus
	 * 
	 * @throws IllegalArgumentException pois o cálculo de bonificação retornou um
	 *                                  valor acima do permitido.
	 */
	@Test
	void bonusDoFuncionarioComDezMileUmDeveSerZero() {
		BonusService service = new BonusService();

		try {
			service.calcularBonus(new Funcionario("Cibere", LocalDate.now(), new BigDecimal("10001")));
			fail(failMessage);
		} catch (IllegalArgumentException e) {
			assertEquals(salarioMuitoAltoExceptionMessage, e.getMessage());
		}
	}

	/**
	 * Testando bonificação para funcionário com salário de R$2500,00.
	 * @ValorEsperado um BigDecimal de R$250,00
	 */
	@Test
	void bonusDe250ParaSalarioDe2500Reais() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Breno", LocalDate.now(), new BigDecimal("2500")));

		assertEquals(new BigDecimal("250.00"), bonus);
	}

	/**
	 * Testando bonificação para funcionário com salário de R$10,000. .
	 */
	@Test
	void bonusDoFuncionarioComSalarioIguala10milDeveraSerDe1000Reais() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Inácio", LocalDate.now(), new BigDecimal("10000")));

		assertEquals(new BigDecimal("1000.00"), bonus);
	}

	/**
	 * Testando bonificação para funcionário com salário de R$9999,00 .
	 */
	@Test
	void bonusParaFuncionarioCom9999DeSalario() {
		BonusService service = new BonusService();
		BigDecimal bonus = service.calcularBonus(new Funcionario("Amanda", LocalDate.now(), new BigDecimal("9999")));

		assertEquals(new BigDecimal("999.90"), bonus);
	}

}
