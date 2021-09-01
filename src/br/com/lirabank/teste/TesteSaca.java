package br.com.lirabank.teste;

import br.com.lirabank.modelo.ContaCorrente;

public class TesteSaca {

	public static void main(String[] args) {

		ContaCorrente cc = null;
		try {
			cc = new ContaCorrente(333, 123);
			cc.deposita(200);

			cc.saca(220);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if (cc != null) {
				System.out.println(cc.getSaldo());
			}
		}

	}

}
