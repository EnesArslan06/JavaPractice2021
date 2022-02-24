package JavaPracticeDay_02;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.*/
		 ;
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen bir sayi giriniz");
double sayi=scan.nextDouble();

if (sayi>0) {System.out.println("Sayinin Mutlak Degeri:" + sayi);} 
else if(sayi<0) {System.out.println("Sayýnýn Mutlak Degeri:" + (sayi*(-1)));}


/*System.out.println(sayi>0 ? sayi : sayi*(-1));	*/	
scan.close();		
}}


