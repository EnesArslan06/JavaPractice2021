package JavaPracticeDay_05ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
    	// Kullan�c�dan 5 adet say� isteyiniz
        // Bu say�lardan 5 ile 10 aras�ndakiler hari�, di�erlerinin toplam�n� bulunuz.
        // bu soruyu continue kullanarak ��z�n�z.
    	 Scanner scan=new Scanner(System.in);   
    	int toplam=0;
    
     for (int i =1; i <= 5; i++) {
		System.out.print("sayi "+i+" giriniz: ");
	int sayi=scan.nextInt();  //kullan�c�dan sayiyiy for ile istedik 1. sayi yi girdik i zaten 1 den basl�yor
    if (sayi>5 && sayi<10) {
		System.out.println("Girilen sayilar 5 ile 10 aras� oldugundan isleme al�nmad�");
    	continue; //devam et bekleme komutudur. kodun l�r�lmas�n� engeller yani 5 ile 10 aras�nda bir sayi geldiginde
    	//devam eder kodu durdurmaz
	}
    toplam+=sayi;
    }
    
    System.out.println("Girdiginiz sayilar�n toplami: "+ toplam);
   scan.close();
    }

}
