package zadaci_14_02_2018;

import java.util.Scanner;
public class StanjeRacuna {
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
        System.out.println("Unesite iznos mjesecne stednje: ");
		
		double iznos = unos.nextDouble();
		double mjesecnaKamata = 0.00417;
		
		System.out.println("Unesite broj mjeseci: ");
		
		int brojMjeseci = unos.nextInt();
		double stanje = iznos * (1 + mjesecnaKamata);
		
		for (int i = 1; i <= brojMjeseci - 1; i++) {
		 stanje = (iznos + stanje)*(1 + mjesecnaKamata);
		}
		
		System.out.printf("Vrijednost na racunu iznosi: %5.3f",stanje);


	}

}
