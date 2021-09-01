package br.com.lirabank.teste.util;

import java.util.Arrays;

public class TesteSaida {

	public static void main(String[] args) {

		int[][] teste = { { 0, 2, 6 }, { 3, 4, 5 }, { 7, 2, 6 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (teste[i][j] == 3) {
					break;
				}
				System.out.println(teste[i][j]);
			}
			
		}

		int[] teste2 = new int[] { 2, 8, 0, 4, 6, 7, 5, 10 };
		Arrays.sort(teste2);

		for (int is : teste2) {
			System.out.print(is + " - ");
		}

	}

}
