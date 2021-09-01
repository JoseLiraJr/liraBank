package br.com.lirabank.teste;

import br.com.lirabank.modelo.Conta;
import br.com.lirabank.modelo.ContaCorrente;
import br.com.lirabank.modelo.ContaPoupanca;
import br.com.lirabank.modelo.GuardadorDeContas;

public class TesteGuardadorContas {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas(7);

		Conta cc = new ContaCorrente(112, 222);
		guardador.adiciona(cc);
		Conta cp = new ContaPoupanca(112, 3345);
		guardador.adiciona(cp);
		guardador.adiciona(cp);

		System.out.println(guardador.getQtdeElementos());

		System.out.println(guardador.getReferenciaConta(2).toString());
	}

}
