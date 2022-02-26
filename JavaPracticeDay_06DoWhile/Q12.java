package JavaPracticeDay_06DoWhile;

import java.util.Scanner;

public class Q12 {

	 //Bir top belirli yükseklikten atýlmaktadýr.
    // Atýldýktan sonra, atýldýðý yüksekliðin 3/4 u kadar yerden yukarý doðru zýplamaktadýr
    // Top zýplama  yüksekliði 1 metrenin altýna indiðinde durmaktadýr.
    // Bu ana kadar aldigi toplam yolu ve yere vurma sayýsýný bulan do while code blogu create ediniz.

	
    public static void main(String[] args) {
    	Scanner scan=new Scanner (System.in);
    	
    	
    	System.out.println("topun býrakýldýgý yuksekligi  giriniz: ");
		double yukseklik=scan.nextDouble();
		double toplamyol=0; //ilk atýldýgý yukseklikte topun aldýgý ilk yoldur sonra ekleyecez
		int yerevurmaSayisi=0;
		
		do {
			yerevurmaSayisi++;
			toplamyol+=yukseklik;//topun assagý inerken aldýgý yol
			yukseklik*=(0.75); //3/4 unu bu sekilde aldýk
			toplamyol+=yukseklik;//burasi topun yukselirken aldýgý yol
			
		} while (yukseklik>=1);
		
		
    	System.out.println("Topun vurma sayisi: "+ yerevurmaSayisi);
   System.out.println("topun aldýgý toplam yol: "+ toplamyol);
  	
  scan.close();  	
} }
