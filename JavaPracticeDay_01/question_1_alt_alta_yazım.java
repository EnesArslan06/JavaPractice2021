package JavaPracticeDay_01;

public class question_1_alt_alta_yazým {

	public static void main(String[] args) {
		//1-2-3-4-5 sayýsýnýn degerlerini yukarýdan aþagý dogru yazdýrýn.
		//ex: input: 12345
		//output:1
		//		 2
		//		 3
		//		 4
		//		 5
		
		//önce sayýlarý ayýrmamýz lazým
		//kalan kýsmý ile bulabiliriz, modulus iþlem ile bulacagýz
		
		int sayi=12345; //bu verinin birler onlar  ... basamagýný alacaz
		int birler=sayi%10;  //birler basamagý sayýnýn 10 abolumunden kalanýdýr. 
		int onlar=(sayi/10)%10; //sayýyý parantez icinde önce 10 boluyoruz sonra elimizde kalan 1234 den birler basamagýný alacaz.
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10; 
		int onBinler=(sayi/10000);//bunu tekrardan modulus yapmak fark etmez zaten 1 sayý kalýyor.
		
		/*System.out.println(onBinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler); //consolda alta yazdýrmak icin "\n" komutu kullanýlýr.*/
		//usteki gibi 5 satýrda da yazýlabilecegi gibi alttaki gibi tek satýrda da yazýlabýlýr.		 
		
		System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+ birler );
	}

}
