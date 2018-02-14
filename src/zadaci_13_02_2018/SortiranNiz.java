package zadaci_13_02_2018;

import java.util.Arrays;
import java.util.Scanner;

public class SortiranNiz {
 
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite velicinu matrice: ");
		int velicina = unos.nextInt();
		double[][] matrica = new double[velicina][velicina];
		
		System.out.println("Unesite " + matrica.length + " redova i " + matrica[0].length + " kolona: ");
		
		for (int i = 0; i < matrica.length; i++){
			for(int j = 0; j < matrica[i].length; j++){
				matrica[i][j] = unos.nextDouble();
			}
		}
			sortRows(matrica);
			for(int i = 0; i < matrica.length; i++){
				for (int j = 0; j < matrica[i].length; j++){
					System.out.print(matrica[i][j] + " ");
				}
				System.out.println();
			}
		}
		
	
	public static double[][] sortRows(double[][] array){
		
		for(int i = 0; i < array.length; i++){
			Arrays.sort(array[i]);
		}
		return array;
	}
}


