package JavaPracticeDay_05ForLoop;

import java.util.Scanner;

public class palindromsorusu {

	public static void main(String[] args) {
		// Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle=scan.nextLine();
		String terskelime="";
		
		for (int i =cumle.length()-1 ; i >=0 ; i--) {
			terskelime+=cumle.charAt(i);
		}
		
		if (cumle.equals(terskelime)) {
			System.out.println("Palindrom");
		} else { System.out.println("Palindrom degil");

		}
	
		scan.close();
}}
