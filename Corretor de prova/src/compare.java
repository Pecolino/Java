import java.io.FileNotFoundException;

public class compare {
	static int total = 0;
	static int questao = 0;
	
	
	public static void compare2023(String resp1, String respGab2) throws FileNotFoundException {
		
		if (resp1.equals(respGab2)) {
			questao++;
			total++;
			System.out.println("A questao " + questao + " Esta Correta");
		}
		else {
			questao++;
			System.out.print("A questao " + questao + " Esta Errada   ");
			System.out.println(resp1);
		}
	}
	public static void printTotal() {
		System.out.println("Sua pontuação total eh: " + total);
	}
}