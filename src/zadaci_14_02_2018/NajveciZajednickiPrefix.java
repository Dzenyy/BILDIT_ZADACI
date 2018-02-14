package zadaci_14_02_2018;

import java.util.Scanner;
public class NajveciZajednickiPrefix {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite prvi string: ");
		String s1 = unos.nextLine();
		
		System.out.println("Unesite drugi string: ");
		String s2 = unos.nextLine();
		
		prefix(s1, s2);
	}
	
	public static void prefix (String s1, String s2) {
		
		int brojac = 0;
		
		for (int i = 0; i < s1.length(); i++) {
			
			if (s1.charAt(i) == s2.charAt(i)) {
				brojac++;
			}
			else {
				break;
			}
		}
			if (brojac > 0) {
				System.out.print("Zajednicki prefix je: ");
				
				for (int i = 0; i < brojac; i++) {
				System.out.print(s1.charAt(i));
				}
			}
			else {
				System.out.println("Stringovi " + s1 + " i " + s2 + " nemaju zajednickog prefixa.");
			}
		}
}
