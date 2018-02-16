package zadaci_15_02_2018;

import java.util.Scanner;
public class PrestupneGodine {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite pocetnu i krajnju godinu: ");
		int pocetna = unos.nextInt();
		int krajnja = unos.nextInt();
		int brojac = 0;
		
		for (int i = pocetna; i < krajnja; i++){
			if ((i % 4 == 0 && i % 100 != 0)||(i % 400 == 0)){
				brojac++;
			}
			if (brojac == 10){
				System.out.println(i);
			}
			else{
				System.out.print(i + " ");
			}
		}
	}

}
