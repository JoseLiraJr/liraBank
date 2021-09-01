package br.com.lirabank.teste;

import br.com.lirabank.modelo.Conta;
import br.com.lirabank.modelo.ContaCorrente;
import br.com.lirabank.modelo.ContaPoupanca;

public class TesteToString {

	public static void main(String[] args) {
		Object conta1 = new ContaPoupanca(1234, 00017);
		Object conta2 = new ContaCorrente(1234, 00010);

//		System.out.println(conta1);
//		System.out.println(conta2);

		String cpf = "0/aqv34.254.43*KJ><E3-05";

		System.out.println(FormataDados(cpf));

	}

	static String FormataDados(String dado) {
		return dado.replaceAll("[^0-9]+", "");
	}

}
