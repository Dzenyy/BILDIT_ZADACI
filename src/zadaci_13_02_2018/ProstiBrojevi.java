package zadaci_13_02_2018;

import java.util.Scanner;
public class ProstiBrojevi {

	public static void main(String[] args) {
      Scanner unos = new Scanner(System.in);
      
      System.out.println("Unesite pocetni broj: ");
      int br1 = unos.nextInt();
      
      System.out.println("Unesite krajnji broj: ");
      int br2 = unos.nextInt();
      
      System.out.println("Unesite koliko zelite ispisanih brojeva po liniji: ");
      int brojac = unos.nextInt();
	}
	
	public static void prostiBrojevi(int a, int b, int brojac){
		
		for (int i = a; i < b; i++){
			int brojac1 = 0;
			
			for ( int j = 1; j <= i; j++ ) {
				if ( i % j == 0 ) {
					brojac1++;
				}
		}
			int brojac2 = 0;
			if (brojac1 == 2){
				brojac2++;
				if (brojac2 == brojac)
				System.out.println(i);
			}
			else {
				System.out.print(i + " ");
			}
	}

	}
}
