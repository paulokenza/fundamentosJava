package fundamentos_exercicios;

import javax.swing.JOptionPane;

public class Imc {

	public static void main(String[] args) {

		String sPeso = JOptionPane.showInputDialog("Qual é o seu peso? ");
		String sAltura = JOptionPane.showInputDialog("Qual é o sua altura? ");

		double peso = Double.parseDouble(sPeso);
		double altura = Double.parseDouble(sAltura);

		double imc = peso / (altura * altura);

		System.out.println("O seu imc é igual a: " + imc);

	}

}
