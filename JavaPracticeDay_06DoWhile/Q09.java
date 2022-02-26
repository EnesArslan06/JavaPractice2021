package JavaPracticeDay_06DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
//contains kullanacaz iceriyor mu? dogru bulana kadar while dongusu
    	
    	Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen pini giriniz: ");
		int pin=scan.nextInt();

int kontrolpin=1453;	

while (pin!=kontrolpin) {
	System.out.println("Hatali Pin Girdiniz");
	System.out.println("Tekrar Deneyiniz");
	pin=scan.nextInt();
}

System.out.println("Basarili giris");

    
    
scan.close();    
    
    }}