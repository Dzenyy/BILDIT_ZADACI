package zadaci_13_02_2018;

import java.util.Scanner;
public class NajmanjiUNizu {
	public static void main(String[] args) {
		
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite 10 brojeva: ");
		double[] list = new double[10];
		
		for(int i = 0; i < list.length; i++){
			list[i] = unos.nextDouble();
		}
		
		System.out.println("Najmanji u nizu je " + min(list));
		
	}
	public static double min(double[] array){
		double min = array[0];
		
		for (int i = 0; i < array.length; i++){
			if (array[i] < min){
				min = array[i];
			}
		}
		return min;
	}

}
