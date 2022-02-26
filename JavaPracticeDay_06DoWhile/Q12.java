package JavaPracticeDay_06DoWhile;

import java.util.Scanner;

public class Q12 {

	 //Bir top belirli y�kseklikten at�lmaktad�r.
    // At�ld�ktan sonra, at�ld��� y�ksekli�in 3/4 u kadar yerden yukar� do�ru z�plamaktad�r
    // Top z�plama  y�ksekli�i 1 metrenin alt�na indi�inde durmaktad�r.
    // Bu ana kadar aldigi toplam yolu ve yere vurma say�s�n� bulan do while code blogu create ediniz.

	
    public static void main(String[] args) {
    	Scanner scan=new Scanner (System.in);
    	
    	
    	System.out.println("topun b�rak�ld�g� yuksekligi  giriniz: ");
		double yukseklik=scan.nextDouble();
		double toplamyol=0; //ilk at�ld�g� yukseklikte topun ald�g� ilk yoldur sonra ekleyecez
		int yerevurmaSayisi=0;
		
		do {
			yerevurmaSayisi++;
			toplamyol+=yukseklik;//topun assag� inerken ald�g� yol
			yukseklik*=(0.75); //3/4 unu bu sekilde ald�k
			toplamyol+=yukseklik;//burasi topun yukselirken ald�g� yol
			
		} while (yukseklik>=1);
		
		
    	System.out.println("Topun vurma sayisi: "+ yerevurmaSayisi);
   System.out.println("topun ald�g� toplam yol: "+ toplamyol);
  	
  scan.close();  	
} }
