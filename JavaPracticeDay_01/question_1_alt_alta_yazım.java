package JavaPracticeDay_01;

public class question_1_alt_alta_yaz�m {

	public static void main(String[] args) {
		//1-2-3-4-5 say�s�n�n degerlerini yukar�dan a�ag� dogru yazd�r�n.
		//ex: input: 12345
		//output:1
		//		 2
		//		 3
		//		 4
		//		 5
		
		//�nce say�lar� ay�rmam�z laz�m
		//kalan k�sm� ile bulabiliriz, modulus i�lem ile bulacag�z
		
		int sayi=12345; //bu verinin birler onlar  ... basamag�n� alacaz
		int birler=sayi%10;  //birler basamag� say�n�n 10 abolumunden kalan�d�r. 
		int onlar=(sayi/10)%10; //say�y� parantez icinde �nce 10 boluyoruz sonra elimizde kalan 1234 den birler basamag�n� alacaz.
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10; 
		int onBinler=(sayi/10000);//bunu tekrardan modulus yapmak fark etmez zaten 1 say� kal�yor.
		
		/*System.out.println(onBinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler); //consolda alta yazd�rmak icin "\n" komutu kullan�l�r.*/
		//usteki gibi 5 sat�rda da yaz�labilecegi gibi alttaki gibi tek sat�rda da yaz�lab�l�r.		 
		
		System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+ birler );
	}

}
