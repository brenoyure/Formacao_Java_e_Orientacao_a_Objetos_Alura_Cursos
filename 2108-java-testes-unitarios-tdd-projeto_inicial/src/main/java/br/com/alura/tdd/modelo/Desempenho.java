package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Desempenho {
	
	A_DESEJAR {
		@Override
		public BigDecimal percentualReajuste() {
			return trezPorCento;
		}
	},

	BOM {
		@Override
		public BigDecimal percentualReajuste() {
			return quinzePorCento;
		}
	}, 

	OTIMO {
		@Override
		public BigDecimal percentualReajuste() {
			return vintePorCento;
		}
	};

	private static final BigDecimal trezPorCento = new BigDecimal("0.03");
	private static final BigDecimal quinzePorCento = new BigDecimal("0.15");
	private static final BigDecimal vintePorCento = new BigDecimal("0.2");

	public abstract BigDecimal percentualReajuste();


}
