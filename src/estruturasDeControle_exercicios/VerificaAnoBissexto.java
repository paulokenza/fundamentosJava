package estruturasDeControle_exercicios;

import java.util.Scanner;

public class VerificaAnoBissexto {

	public static void main(String[] args) {

		int ano = 0;

		Scanner inputScan = new Scanner(System.in);
		System.out.println("Digite o ano a ser verificado: ");
		ano = inputScan.nextInt();

		if (ano % 4 != 0 && ano % 400 != 0) {

			System.out.println("Ano não é bissexto");
		} else {
			System.out.println("Ano bissexto");
		}
	}
}
