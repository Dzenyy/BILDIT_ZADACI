package zadaci_15_02_2018;

import java.util.Scanner;
public class StringNeparnePozicije {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite string: ");
		
		String s = unos.nextLine();
		
		for (int i = 1; i < s.length(); i++){
			if (i % 2 != 0){
			System.out.print(s.charAt(i - 1));
			}
		}
	}

}
