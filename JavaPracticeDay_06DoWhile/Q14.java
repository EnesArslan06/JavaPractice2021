package JavaPracticeDay_06DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
    	/*  Problem Tan�m�
        Verilen bir say�n�n fakt�riyelini �zyineli (recursive) olarak
        hespalayan fonksiyonu yaz�n�z.

        �rnek Ekran ��kt�lar�
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Fakt�riyeli: 720

        Bir say� giriniz: 3*2*1
        Fakt�riyeli 6
     */

    	Scanner scan=new Scanner (System.in);
		System.out.println("sayiyi giriniz: ");
		int sayi=scan.nextInt();

		int carpim=1;
		while (sayi>0) {
			carpim*=sayi;
			
			sayi--;
			
		}
		System.out.println(carpim);
		
   scan.close(); 
}}


