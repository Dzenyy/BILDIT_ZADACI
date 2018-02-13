package zadaci_12_02_2018;

import java.util.Scanner;
public class SamoglasnikSuglasnik {

	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite string: ");
		String s = unos.nextLine();
		int brojSamoglasnika = 0;
		int brojSuglasnika = 0;
		
		for (int i = 0; i < s.length(); i++){
			
			char c = s.charAt(i);
			
			if (c == 'A' || c == 'a' || c == 'E' || c == 'e' || c == 'I' || c == 'i' || c == 'O' || c == 'o' || c == 'U' || c == 'u'){
				brojSamoglasnika++;
			}
			else if ((c >= 97 && c <= 122) || (c >= 60 && c <= 90)){
				brojSuglasnika++;
			}
		}
		System.out.println("Broj samoglasnika u stringu " + s + " je " + brojSamoglasnika + "\nBroj suglasnika je " + brojSuglasnika);
	}

}
