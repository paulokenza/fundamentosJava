package fundamentos_exercicios;

import javax.swing.JOptionPane;

public class FahrenheitToCelsius {

	public static void main(String[] args) {

		String sTempF = JOptionPane.showInputDialog("Qual a temperatura em Graus Fahrenheit ?");

		double tempF = Double.parseDouble(sTempF);
		double tempC = (tempF - 32) / 1.8;

		System.out.println("A temperatura em Celsius é de: " + tempC);
	}

}
