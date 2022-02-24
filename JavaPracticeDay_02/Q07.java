package JavaPracticeDay_02;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve bunun buyuk harf, kucuk harf yada 
		hatali giris seklinde kod yazniz*/	
		
Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir Harf belirtiniz");	
		
		System.out.println("*******If Else Yontemi*******");
		char karakter=scan.next().charAt(0);
		
		if (karakter>'A' && karakter<'Z') {System.out.println("Buyuk harf:" + karakter);}
		else if (karakter>'a' && karakter<'z') {System.out.println("Kucuk harf:" + karakter);}
		else {System.out.println("Gecersiz Karakter girdiniz...");}	

		System.out.println("*******Ternary Yontemi*******");
			
		System.out.println((karakter>'a' && karakter<'z') ? "Kucuk Harf:" + karakter : ((karakter>'A' && karakter<'Z')
				? "Buyuk Harf:" + karakter : "Gecersiz Karakter Girdiniz..."));
		
 scan.close();	
		
}}
	


