package JavaPracticeDay_06DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.

    	Scanner scan=new Scanner (System.in);
		
 		int enbuyuksayi=0;
		int count=0;
    	
	while (count<5) {
		System.out.println("Lutfen sayi giriniz: ");
		int sayi=scan.nextInt();
		
		if (sayi>enbuyuksayi) {
			enbuyuksayi=sayi;
			
		}count ++;
	}	System.out.println("en buyuk sayi: "+enbuyuksayi);
	scan.close();	
}}


