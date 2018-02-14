package zadaci_13_02_2018;

import java.util.Scanner;
public class StriktnoIdenticniNizovi {

	public static void main(String[] args) {

		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite broj elemenata niza: ");
		int br = unos.nextInt();
		
		System.out.println("Unesite prvi niz: ");
		int niz1[] = new int[br];
		for (int i = 0; i < niz1.length; i++) {
			niz1[i] = unos.nextInt();
		}
		
		System.out.println("Unesite drugi niz: ");
		int niz2[] = new int[br];
		for (int i = 0; i < niz2.length; i++) {
			niz2[i] = unos.nextInt();
		}
		
		if (equals(niz1, niz2)) {
			System.out.println("Dva niza su striktno identicna.");
		}
		else {
			System.out.println("Dva niza nisu striktno identicna.");
		}
	
	}
	
	public static boolean equals(int[] niz1, int[] niz2) {
		
		for(int i = 0; i < niz1.length; i++) {
		for(int j = 0; j < niz1.length; j++) {
				
				if(niz1[i] == niz2[j]) {
					return true;
			}
		}
		}
		return false;
	}
}
