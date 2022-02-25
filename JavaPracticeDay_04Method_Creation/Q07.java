package JavaPracticeDay_04Method_Creation;

import java.util.Scanner;

public class Q07 {
 public static void main(String[] args) { 
	 /*
        reverseString isminde bir method oluşturun.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.

        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */

	

	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen bir kelime girin");
	String kelime=scan.next();
	
	
scan.close();	
	tersten(kelime); 
	
}

private static String tersten(String kelime) {
	for (int i =kelime.length()-1; i >=0 ; i--) {
	System.out.print(kelime.charAt(i));	
	}
	
	
	return kelime;

	
	
	
	
	
	
}}

