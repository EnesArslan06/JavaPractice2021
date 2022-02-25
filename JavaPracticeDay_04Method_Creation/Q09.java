package JavaPracticeDay_04Method_Creation;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
	


	/*
   Problem Tanýmý:
    addDigits isminde bir method oluþturun.
    Parametresi int
    Return tipi de int
    Pozitif int deðerler ver ve en son sonuç tek basamaklý çýkana kadar basamaklarý birbiriyle topla.
    Tek basamaklý çýktýðýnda, döndürün

    Örnek1:
    Girdi 38
    Çýktý: 2
    Açýklama: Ýþlemler þöyle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamaklý olduðundan, bunu döndürün. */
   
	Scanner scan=new Scanner(System.in);
	System.out.println("Lutfen Pozitif Bir sayi Giriniz");
   int sayi=scan.nextInt();
    
    addDigits(sayi);
    
    
    scan.close();
}

	private static int addDigits(int sayi) {
		for (int i = 0; i <2; i++) {
			sayi=toplam(sayi);
		
		if (sayi<10) 
			break;}
		
		
	
	return toplam(sayi);
	}

	private static int toplam(int sayi) {
		
		int toplam=0;
		int rakam=0;
				
		while (sayi>0) {
			rakam=sayi%10;
			toplam+=rakam;
			sayi/=10;
		} 
		System.out.println("Girdiginiz Sayinýn rakamlar toplami: "+ toplam);
		return toplam;
	}
	
}
