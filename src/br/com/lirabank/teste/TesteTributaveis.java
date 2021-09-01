package br.com.lirabank.teste;

import br.com.lirabank.modelo.*;

public class TesteTributaveis {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1110, 1245789);
		cc.deposita(100);

		SeguroVida sg = new SeguroVida();
		sg.setValorSeguro(500);
		sg.setTaxa(0.05);

		CalculadorImposto ci = new CalculadorImposto();
		ci.registra(cc);
		ci.registra(sg);

		System.out.println(ci.getTotalImposto());

	}

}
