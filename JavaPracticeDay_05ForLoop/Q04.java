package JavaPracticeDay_05ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
    	// Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç, diðerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.
    	 Scanner scan=new Scanner(System.in);   
    	int toplam=0;
    
     for (int i =1; i <= 5; i++) {
		System.out.print("sayi "+i+" giriniz: ");
	int sayi=scan.nextInt();  //kullanýcýdan sayiyiy for ile istedik 1. sayi yi girdik i zaten 1 den baslýyor
    if (sayi>5 && sayi<10) {
		System.out.println("Girilen sayilar 5 ile 10 arasý oldugundan isleme alýnmadý");
    	continue; //devam et bekleme komutudur. kodun lýrýlmasýný engeller yani 5 ile 10 arasýnda bir sayi geldiginde
    	//devam eder kodu durdurmaz
	}
    toplam+=sayi;
    }
    
    System.out.println("Girdiginiz sayilarýn toplami: "+ toplam);
   scan.close();
    }

}
