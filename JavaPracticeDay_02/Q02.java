package JavaPracticeDay_02;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz
	     
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen */
		
Scanner scan=new Scanner(System.in);
System.out.println("Bir tane tam say� belirtiniz \n" 
+ "Bir tam say� daha belirtiniz  \n" 
		+ "Bir tam say� daha belirtiniz");
int a=scan.nextInt();
int b=scan.nextInt();	 
int c=scan.nextInt();

if((a==b) && (b==c)) {System.out.println("Eskenar Ucgen"); }
else if((b+c)>a && a>(b-c)) {System.out.println("Ucgen olabilir"); }
else if((a+c)>b && b>(a-c)) {System.out.println("Ucgen olabilir"); }
else if ((a+b)>c && c>(a-b)) {System.out.println("Ucgen olabilir");}	
else {System.out.println("Bu degerlerle ucgen olmaz B�RADER");}


scan.close();
	
}}
				

	


