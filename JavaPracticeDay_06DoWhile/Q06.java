package JavaPracticeDay_06DoWhile;

import java.util.Scanner;

public class Q06 {
	static int bolum=0;//class level de bir variable ilk degeri 0 atanm�s

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		//mesela 10 bolunen 2 bolen bu 10 dan 2 c�kar 0 bulana kadar demek
		//yani 5 kere 2 c�kar�rsak sonuc 0 olur bolumde 5 olur.
		//while sart� kalan s�f�r olana kadar devam et.
		Scanner scan=new Scanner (System.in);
		System.out.println("Bolunen sayiyi giriniz: ");
		int bolunen=scan.nextInt();
		System.out.println("Bolen sayiyi giriniz: ");
		int bolen=scan.nextInt();
	
scan.close();	
	System.out.println("sonuc: "+ bol(bolunen, bolen));
	}		
		
	
public static int bol(int bolunen, int bolen) {//bolen ve bolunen bir paramaetre olusturracaz
	while (bolunen>=bolen) {
		bolunen-=bolen;
		bolum++;
	}
	
	
	return bolum;

	
	
	
}
}

