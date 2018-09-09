package estruturasDeControle;

import java.util.Scanner;

public class VerificarNumeroPar {
	
	public static void main(String[] args) {
		
		double numero = 0;
			
		Scanner inputScan = new Scanner (System.in);
		System.out.println("Digite o número a ser verificado: ");
		numero = inputScan.nextInt();
		
		
		if(numero <= 10 && numero >= 0 ) {
			System.out.println("Número válido");
			
			if (numero % 2 == 0) {
				System.out.println("Este numero é par");
			} else {
				System.out.println("Esse número é impar");
			}
		} else {
			System.out.println("Numero inválido");
		}
		System.exit(1);
		
		
			
		}
		
		}
