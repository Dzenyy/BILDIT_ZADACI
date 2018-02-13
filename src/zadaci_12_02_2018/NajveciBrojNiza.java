package zadaci_12_02_2018;

import java.util.Scanner;
public class NajveciBrojNiza {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		int[] list = new int[150];
		
		System.out.println("Unesite niz brojeva, 0 prekida unos: ");
		
		for (int i = 0; i < list.length; i++){
			int korisnik = unos.nextInt();
			if (korisnik != 0){
				list[i] = korisnik;
			}
			else {	
		System.out.println("Najveci broj u nizu je " + max(list) + ", a ponavlja se " + brojMax(list) + " puta.");
		}
		}
	}
		public static int max(int[] niz){
		int max = niz[0];
		
		for (int i = 0; i < niz.length; i++){
			if (niz[i] > max){
				max = niz[i];
			}
		}
		return max;
		}
		
	
public static int brojMax (int[] niz){
	int brojac = 0;
	for (int e : niz){
		if (e == max(niz)){
			brojac++;
		}
	}
		return brojac;
	}
}
