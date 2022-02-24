package JavaPracticeDay_01;

import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		// kullanýcýdan ad soyad yas boy kilosunu alt alta yazdýrýnýz?
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Lutfen Kullanici adinizi Giriniz:");
		
		String kullaniciadi=scan.next();
		
		System.out.print("Lutfen yasýnýzý giriniz:"); //ln olmazsa yani println daki ln yi yazmazsak ayný satýra yazar cevabý
		
		int yas=scan.nextInt();
		
		System.out.print("Lutfen boyunuzu giriniz:");
		
		double boy=scan.nextDouble();	
		
		System.out.print("Lutfen kilonuzu giriniz:");
		
		double kilo=scan.nextDouble();
		
		System.out.println("benim adým:"+kullaniciadi+"\n"
		+"yasým:"+ yas+"\n"
		+ "boyum:"+boy+"\n"
		+"kilom:"+kilo);
		
		
		scan.close();

	}
}

