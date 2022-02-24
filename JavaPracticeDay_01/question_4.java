package JavaPracticeDay_01;

import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		// kullanýcýdan 2 tam sayý alýp bu 2 tam sayýnýn dort iþlem sonucunu yazdýrýn.
		 Scanner scan=new Scanner(System.in);
		 
		 
	
		 
		 System.out.println("Lutfen birinci sayiyi giriniz:");
		 int sayi1=scan.nextInt();
		 System.out.println("Lutfen ikinci sayiyi giriniz:");
		 int sayi2=scan.nextInt();
		 
		 System.out.println("girilen sayýlarýn toplamý:"+(sayi1+sayi2));
		 System.out.println("girilen sayýlarýn farký:"+(sayi1-sayi2));
		 System.out.println("girilen sayýlarýn carpýmý:"+(sayi1*sayi2));
		 System.out.println("girilen sayýlarýn bolumu:"+(sayi1/sayi2));
		 
		 System.out.println(); //tek satýrda yaz....
		
		 
		 scan.close();
		 
	}

}
