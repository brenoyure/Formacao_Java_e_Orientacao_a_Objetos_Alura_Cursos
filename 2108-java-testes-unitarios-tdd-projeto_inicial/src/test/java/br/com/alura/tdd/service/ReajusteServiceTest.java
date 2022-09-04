package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteServiceTest {

	@Test
	public void reajusteDeveriaSerDeTresPorcentoQuandoDesempenhoForADesejar() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Breno", LocalDate.of(2018, Month.MAY, 2), new BigDecimal("1000.00"));
		
		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
		
		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
	}
	
	@Test
	public void reajusteDeveriaSerDe15PorcentoQuandoDesempenhoForBom() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Thiago", LocalDate.of(2021, Month.SEPTEMBER, 3), new BigDecimal("1000.00"));
		
		service.concederReajuste(funcionario, Desempenho.BOM);

		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());

	}

	@Test
	public void reajusteDeveriaSerDe20PorCentoQuandoDesempenhoForOtimo() {
		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Inácio", LocalDate.of(2022, Month.MARCH, 11), new BigDecimal("1000.00"));
		service.concederReajuste(funcionario, Desempenho.OTIMO);
		
		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
		
	}
	
	
}
