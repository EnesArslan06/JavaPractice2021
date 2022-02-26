package JavaPracticeDay_06DoWhile;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
		// indexi tek sayi olan karakterleri yazdiran bir code create ediniz
//kulanýcýdan bircumle al cumlenin indexinde yer alan harflerden tek sayi olanlarý bul
//sart if tek sayi, tek indexlere bakma dongu for veya do while ile yapýlýr.
	Scanner scan=new Scanner (System.in);
	System.out.println("Lutfen bir metin giriniz");
	String metin=scan.nextLine();
	
	int index=0;
	do {
		if (index%2==1) {
			System.out.print(metin.charAt(index)+ " ");
		
		}
		index++;
	} while (index<metin.length());
		
		
		
scan.close();		

}}
