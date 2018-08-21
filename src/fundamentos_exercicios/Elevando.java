package fundamentos_exercicios;

import javax.swing.JOptionPane;

public class Elevando {
	public static void main(String[] args) {

		String sValor = JOptionPane.showInputDialog("Digite o valor a ser elevado: ");
		double valor = Double.parseDouble(sValor);

		double numElevadoAoQuadrado = valor * valor;
		double numElevadoAoCubo = valor * valor * valor;

		System.out.println("O numero " + valor + " elevado ao quadrado é igual a: " + numElevadoAoQuadrado);

		System.out.println("O numero " + valor + " elevado ao cubo é igual a: " + numElevadoAoCubo);

	}

}
