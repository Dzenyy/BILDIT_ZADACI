package zadaci_13_02_2018;

import java.util.Scanner;
public class LokacijaNajvecegElementa {


	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite velicinu matrice: ");
		int velicina = unos.nextInt();
		double[][] matrica = new double[velicina][velicina];
		
		System.out.println("Unesite " + matrica.length + " redova i " + matrica[0].length + " kolona:");
		for(int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[i].length; j++){
				matrica[i][j] = unos.nextDouble();
			}
		}
			System.out.println("Lokacija najveceg elementa u nizu je " + locateLargest(matrica));
		

	}
	public static int[] locateLargest(double[][] a){
		
		int[] location = new int[2];
		double max = a[0][0];
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				if (a[i][j] > max){
					max = a[i][j];
					location[0] = i;
					location[1] = j;
				}
			}
		}
		return location;
	}
}
