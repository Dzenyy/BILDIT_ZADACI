package zadaci_12_02_2018;

import java.util.Scanner;
public class RandomBrojevi {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		int[] list = new int[100];
		int[] brojac = new int[10];
		
		for (int i = 1; i < 100; i++){
			list[i] = (int)(Math.random() * 10);
		}
		for (int i = 0; i < brojac.length; i++){
			brojac[i] = 0;
		}
		for (int i = 0; i < list.length; i++){
			brojac[list[i]]++;
		}
		for (int i = 0; i < brojac.length; i++){
			System.out.println("Broj " + i + " se ponovio " + brojac[i] + " puta.");
		}
	}

}
