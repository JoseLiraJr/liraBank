package br.com.lirabank.teste;

import br.com.lirabank.modelo.*;

public class TesteContas {

	public static void main(String[] args) {

		ContaCorrente cc = new ContaCorrente(0452, 25045);
		cc.deposita(150);

		ContaPoupanca cp = new ContaPoupanca(0452, 24578);

		try {
			cc.transfere(100, cp);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());

	}

}
