package estruturasDeControle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei fazer o 'Bassai-dai/jion/kanku-dai'");
		case "marrom" :
			System.out.println("Sei fazer o 'Tekki Shodan'");
		case "roxa":
			System.out.println("Sei fazer o 'Heian Godan'");
		case "verde":
			System.out.println("Sei fazer o 'Heian Yondan");
		case "laranja": 
			System.out.println("Sei fazer o 'Heian Shodan'");
		case "vermelha": 
			System.out.println("Sei fazer o 'Heian Nidan'");
		case "amarela": 
			System.out.println("Sei fazer o 'Heian shodan'");
		default:
			System.out.println("Não sei fazer nada");
			
		}
	}

}
