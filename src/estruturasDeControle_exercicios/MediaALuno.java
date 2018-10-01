package estruturasDeControle_exercicios;

import javax.swing.JOptionPane;

public class MediaALuno {

	public static void main(String[] args) {

		double nota1 = 0;
		double nota2 = 0;
		double media = 0;

		String nota1s = JOptionPane.showInputDialog("Qual é a nota da primeira avaliação?");
		String nota2s = JOptionPane.showInputDialog("Qual é a nota da segunda avaliação?");

		nota1 = Double.parseDouble(nota1s);
		nota2 = Double.parseDouble(nota2s);

		media = (nota1 + nota2) / 2;

		if (media >= 7.0) {
			System.out.println("Aprovado");
		} else if (media >= 4.0 && media <= 7.0) {
			System.out.println("Recuperação");

		} else {
			System.out.println("Reprovado");
		}

	}
}
