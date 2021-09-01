package br.com.lirabank.teste.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.lirabank.modelo.Cliente;
import br.com.lirabank.modelo.Conta;
import br.com.lirabank.modelo.ContaCorrente;
import br.com.lirabank.modelo.ContaPoupanca;

public class TesteOrdenaLista {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		cc1.deposita(333.0);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Benjamim Honório");
		cc1.setCliente(clienteCC1);

		Conta cc2 = new ContaPoupanca(22, 44);
		cc2.deposita(444.0);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Bruna Ferreira");
		cc2.setCliente(clienteCC2);

		Conta cc3 = new ContaCorrente(22, 11);
		cc3.deposita(111.0);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Júnior Lira");
		cc3.setCliente(clienteCC3);

		Conta cc4 = new ContaPoupanca(22, 22);
		cc4.deposita(222.0);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Pedro Sousa");
		cc4.setCliente(clienteCC4);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta + " - Titular: " + conta.getCliente().getNome());
		}

		System.out.println("---------------");

//		NumeroContaComparator comparator = new NumeroContaComparator();
		lista.sort(new NumeroContaComparator());

		for (Conta conta : lista) {
			System.out.println(conta + " - Titular: " + conta.getCliente().getNome());
		}

		System.out.println("---------------");

		TitularContaComparator comparatorTitular = new TitularContaComparator();
		lista.sort(comparatorTitular);

		for (Conta conta : lista) {
			System.out.println(conta + " - Titular: " + conta.getCliente().getNome());
		}

		System.out.println("=========================");

		Collections.reverse(lista);

		for (Conta conta : lista) {
			System.out.println(conta + " - Titular: " + conta.getCliente().getNome());
		}

		System.out.println("=========================");

		Collections.rotate(lista, 2);

		for (Conta conta : lista) {
			System.out.println(conta + " - Titular: " + conta.getCliente().getNome());
		}
		
		Collections.sort(lista);
		
		for (Conta conta : lista) {
			System.out.println(conta + " - saldo: " + conta.getSaldo());
		}

	}

}

class NumeroContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());

		// return c2.getNumero() - c1.getNumero();

//		if (c1.getNumero() < c2.getNumero()) {
//			return -1;
//		} else if (c1.getNumero() > c2.getNumero()) {
//			return 1;
//		}
//
//		return 0;
	}

}

class TitularContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		String nomeCC1 = c1.getCliente().getNome();
		String nomeCC2 = c2.getCliente().getNome();

		return nomeCC1.compareTo(nomeCC2);
	}

}