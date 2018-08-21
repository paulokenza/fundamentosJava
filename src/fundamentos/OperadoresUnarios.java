package fundamentos;

public class OperadoresUnarios {
	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 2;
		
		//implemento e decremento
		num1++;
		System.out.println(num1);
		
		--num1;
		System.out.println(num1);
		
		System.out.println(++num1 == num2-- );
		
		
		//Complemento binario (inverter cada um dos bits de um determinado numero)
		System.out.println(Integer.toBinaryString(50));
		System.out.println(Integer.toBinaryString(~50));
		
		//negacao
		System.out.println(!true);
		
	}

}
