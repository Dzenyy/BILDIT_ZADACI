package zadaci_15_02_2018;

import java.util.Scanner;
public class ReverseIsPalindromeMetode {


	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite cijeli broj: ");
		int br = unos.nextInt();
		
		if(isPalindrome(br)){
		System.out.println("Broj je palindrom.");
		}
		else {
			System.out.println("Broj nije palindrom.");
		}
		

	}
	public static int reverse(int number){
		
		int brojNaopako = 0;
		while (number > 0){
			int c = number % 10;
			
			brojNaopako = brojNaopako * 10 + c;
			number /= 10;
		}
		return brojNaopako;
	}
	public static boolean isPalindrome(int number){
		 if (number == reverse(number)){
			 return true;
		 }
		 return false;
	}

}
