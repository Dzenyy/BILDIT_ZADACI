package zadaci_14_02_2018;

import java.util.Scanner;
public class ObrnutRedoslijed {

	public static void main(String[] args) {

		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite 10 cijelih brojeva: ");
		int[] list = new int[10];
		
		for (int i = 0; i < list.length; i++){
			list[i] = unos.nextInt();
		}
		for (int i = 9; i > -1; i--){
			System.out.print(list[i] + " ");
		}
	}

}
