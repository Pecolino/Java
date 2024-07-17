import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class principal {

	public static void main(String[] args) throws FileNotFoundException {
		File gab1 = new File("C:\\Users\\pecoa\\OneDrive\\Área de Trabalho\\pecolino\\eu faço programa\\Java\\Corretor de prova\\Gabarito2023.txt");
		File res1 = new File("C:\\Users\\pecoa\\OneDrive\\Área de Trabalho\\pecolino\\eu faço programa\\Java\\Corretor de prova\\MinhaQuestao2023.txt");
		Scanner scg = new Scanner(gab1);
		Scanner scr = new Scanner(res1);
		compare comp = new compare();
		
		for (int x = 1; x <= 54; x++ ) {
			comp.compare2023(scg.nextLine(), scr.nextLine());
		}
		comp.printTotal();
	}
}