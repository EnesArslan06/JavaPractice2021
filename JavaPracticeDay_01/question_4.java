package JavaPracticeDay_01;

import java.util.Scanner;

public class question_4 {

	public static void main(String[] args) {
		// kullan�c�dan 2 tam say� al�p bu 2 tam say�n�n dort i�lem sonucunu yazd�r�n.
		 Scanner scan=new Scanner(System.in);
		 
		 
	
		 
		 System.out.println("Lutfen birinci sayiyi giriniz:");
		 int sayi1=scan.nextInt();
		 System.out.println("Lutfen ikinci sayiyi giriniz:");
		 int sayi2=scan.nextInt();
		 
		 System.out.println("girilen say�lar�n toplam�:"+(sayi1+sayi2));
		 System.out.println("girilen say�lar�n fark�:"+(sayi1-sayi2));
		 System.out.println("girilen say�lar�n carp�m�:"+(sayi1*sayi2));
		 System.out.println("girilen say�lar�n bolumu:"+(sayi1/sayi2));
		 
		 System.out.println(); //tek sat�rda yaz....
		
		 
		 scan.close();
		 
	}

}
