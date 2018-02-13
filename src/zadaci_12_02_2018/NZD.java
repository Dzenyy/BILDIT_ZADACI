package zadaci_12_02_2018;

import java.util.Scanner;

public class NZD {

	public static void main(String[] args) {
		
		Scanner unos = new Scanner (System.in);
		
		System.out.println("Unesite prvi broj: ");
		int br1 = unos.nextInt();
		
		System.out.println("Unesite drugi broj: ");
		int br2 = unos.nextInt();
		int nzd = 0;
		
		for (int i = 2; i < br1 || i < br2; i++){
			if (br1 % i == 0 && br2 % i == 0){
				nzd = i;
			}
		}
		System.out.println("Najveci zajednicki djelilac za brojeve " + br1 + " i " + br2 + " je " + nzd + ".");
		
	}

}
