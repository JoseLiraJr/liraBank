package br.com.lirabank.teste.util;

public class Teste {

	public static void main(String[] args) {

		int a = 1;
		int b = 1;

		System.out.println(a++);
		System.out.println(++b);
		System.out.println(a + b);

		Integer i1 = 154;
		Integer i2 = 154;
		if (i1 == i2) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
