package fundamentos_exercicios;

import javax.swing.JOptionPane;

public class CelsiusToFahrentheit {

	public static void main(String[] args) {

		String sTempC = JOptionPane.showInputDialog("Qual é a temperatura em Graus Celsius?");

		double tempC = Double.parseDouble(sTempC);

		double tempF = (tempC * 1.8) + 32;

		System.out.println("A temperatura em Fahrenheit é de: " + tempF);

	}
}
