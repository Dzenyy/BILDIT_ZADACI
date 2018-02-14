package zadaci_14_02_2018;

import java.util.Scanner;
public class Karte {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		
		int brojKarte = (int)(Math.random() * 14 + 1);
		int oznakaKarte = (int)(Math.random() * 4 + 1);
		
		if (brojKarte == 1 || brojKarte == 11) {
			System.out.print("Karta koju ste izvukli je Ace");
		}
		else if (brojKarte == 12) {
			System.out.print("Karta koju ste izvukli je Jack");
		}
		else if (brojKarte == 13) {
			System.out.print("Karta koju ste izvukli je Queen");
		}
		else if (brojKarte == 14) {
			System.out.print("Karta koju ste izvukli je King");
		}
		else {
			System.out.println("Karta koju ste izvukli je " + brojKarte);
		}
		
		if (oznakaKarte == 1) {
			System.out.print(" u znaku Srce.");
		}
		else if (oznakaKarte == 2) {
			System.out.print(" u znaku Pik.");
		}
		else if (oznakaKarte == 3) {
			System.out.print(" u znaku Djetelina.");
		}
		else if (oznakaKarte == 4) {
			System.out.print(" u znaku Kocka.");
		}
		
		unos.close();
	}

}
