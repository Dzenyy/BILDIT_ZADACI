package zadaci_15_02_2018;

import java.util.Scanner;
public class Investicija {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite redom - iznos investicije, godisnju interesnu stopu i broj godina: ");
		double iznos = unos.nextDouble();
		double godisnjaInteresnaStopa = unos.nextDouble();
		double mjesecnaInteresnaStopa = godisnjaInteresnaStopa / 1200;
		int godina = unos.nextInt();
		
		double buducaVrijednostInvesticije = iznos * Math.pow(1 + mjesecnaInteresnaStopa, godina * 12);
		
		System.out.printf("Buduca vrijednost investicije je %.2 ", buducaVrijednostInvesticije);
	}

}
