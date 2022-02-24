package JavaPracticeDay_02;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
    	// Kullanýcýdan bir pozitif tamsayý girmesini isteyin, 
    	//o pozitif tamsayý 3 basamaklý ise ekrana “3 Basamaklý” yazdýrýn.
        // 3 basamaklý degilse çift olup olmadigini kontrol edin. 
    	//Çift ise “3 basamaklý olmayan çift sayý” yazdýrýn.
        // Çift sayý degilse “3 basamaklý olmayan tek sayý yazdýrýn.”
    	
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen Pozitif bir tam sayý giriniz");
int sayi=scan.nextInt();

if(sayi>=100 && sayi<1000) {if (sayi%2==0){System.out.println("3 Basamaklý Cift Sayi");} 
else{System.out.println("3 basamaklý tek sayi");}}
else if (sayi<100 || sayi>=1000) {if (sayi%2==0){System.out.println("3 basamaklý olmayan cift sayi");} 
else {System.out.println("3 basamaklý olmayan tek sayi");}}
else {System.out.println("Lutfen Bir Tam sayi giriniz....");}


scan.close();

}}