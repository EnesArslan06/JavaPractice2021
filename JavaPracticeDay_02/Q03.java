package JavaPracticeDay_02;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
		 *
		BMI = kilo(kg) /(boy/100*boy/100)(cm)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz. */
		
Scanner scan=new Scanner(System.in);
System.out.println("Boyunuz CM cinsinden:");
System.out.println("Kilonuz KG cinsinden:");
double boy=scan.nextDouble();
double kilo=scan.nextDouble();
double vki=kilo/((boy/100)*(boy/100));
System.out.println("VKI ortalamanýz:" + vki);

if (vki<=20) {System.out.println("Oldukca Zayýfsýnýz");} 
else if(vki<=25){System.out.println("Normal Sýnýrdasýnýz");}
else if(vki<=30) {System.out.println("Sisman Katagorisindesiniz");}
else if (vki>30){System.out.println("Obezsiniz");}
else {System.out.println("Gecerli bir deger giriniz");}


scan.close();
}}



 