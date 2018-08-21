package fundamentos_exercicios;

import javax.swing.JOptionPane;

public class AreaTriangulo {
	public static void main(String[] args) {

		String sbase = JOptionPane.showInputDialog("Qual o valor da base do triangulo?");
		String sAltura = JOptionPane.showInputDialog("Qual o valor da altura do triangulo?");

		double base = Double.parseDouble(sbase);
		double altura = Double.parseDouble(sAltura);

		double area = (base * altura) / 2;

		System.out.println("A area deste triango é igual a: " + area);
	}

}
