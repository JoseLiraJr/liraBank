package br.com.lirabank.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.lirabank.modelo.Conta;
import br.com.lirabank.modelo.ContaCorrente;
import br.com.lirabank.modelo.ContaPoupanca;

public class TesteUtil {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>(3);

		Conta cc = new ContaCorrente(111, 222);
		Conta cp = new ContaPoupanca(222, 233);
		Conta cp2 = new ContaPoupanca(111, 222);
		Conta cc2 = new ContaCorrente(222, 453);

		lista.add(cc);
		lista.add(cp);
		lista.add(cp2);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		lista.remove(0);
		
		System.out.println(lista.size());
		
		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i); 
			System.out.println(oRef);			
		}
		
		System.out.println("=========================================");
		
		for (Conta conta : lista) {
			System.out.println(conta);
		}

		System.out.println(cc.equals(cp2));
		
		System.out.println(lista.contains(cc2));
		
		Integer intref = Integer.valueOf(29);
		System.out.println(intref.intValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());

	}

}
