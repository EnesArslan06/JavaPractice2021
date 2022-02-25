package JavaPracticeDay_04Method_Creation;

import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {
	


	/*
   Problem Tan�m�:
    addDigits isminde bir method olu�turun.
    Parametresi int
    Return tipi de int
    Pozitif int de�erler ver ve en son sonu� tek basamakl� ��kana kadar basamaklar� birbiriyle topla.
    Tek basamakl� ��kt���nda, d�nd�r�n

    �rnek1:
    Girdi 38
    ��kt�: 2
    A��klama: ��lemler ��yle olacak: 3 + 8 = 11, 1 + 1 = 2.
                 2 , tek basamakl� oldu�undan, bunu d�nd�r�n. */
   
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
		System.out.println("Girdiginiz Sayin�n rakamlar toplami: "+ toplam);
		return toplam;
	}
	
}
