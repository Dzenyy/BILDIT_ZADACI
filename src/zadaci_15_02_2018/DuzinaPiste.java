package zadaci_15_02_2018;

import java.util.Scanner;
public class DuzinaPiste {

	public static void main(String[] args) {

         double duzina;
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Unesite brzinu u i ubrzanje:");
		
		double v = unos.nextDouble();
		double a = unos.nextDouble();
		duzina = v * v / (2 * a);
		
		System.out.printf("Minimalna duzina piste je %.3f metara", duzina);

}
}
