package JavaPracticeDay_01;

import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		// kullan�c�dan ad soyad yas boy kilosunu alt alta yazd�r�n�z?
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen Kullanici adinizi Giriniz:");
		
		String kullaniciadi=scan.next();
		
		System.out.print("Lutfen yas�n�z� giriniz:"); //ln olmazsa yani println daki ln yi yazmazsak ayn� sat�ra yazar cevab�
		
		int yas=scan.nextInt();
		
		System.out.print("Lutfen boyunuzu giriniz:");
		
		double boy=scan.nextDouble();	
		
		System.out.print("Lutfen kilonuzu giriniz:");
		
		double kilo=scan.nextDouble();
		
		System.out.println("benim ad�m:"+kullaniciadi+"\n"
		+"yas�m:"+ yas+"\n"
		+ "boyum:"+boy+"\n"
		+"kilom:"+kilo);
		
		
		scan.close();

	}
}

