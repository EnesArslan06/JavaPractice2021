package JavaPracticeDay_02;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen Bir say� giriniz");
double sayi1=scan.nextDouble();
System.out.println("Lutfen bir say� Daha giriniz");
double sayi2=scan.nextDouble();
System.out.println("Lutfen yapmak istediginiz i�lemi 1=Toplama,2=C�karma,3= Carpma, ve 4=Bolme olarak seciniz");
int islem=scan.nextInt();

if (islem==1) {System.out.println("Say�lar�n Toplam�:" + (sayi1+sayi2));} 
else if (islem==2) {System.out.println("Say�lar�n fark�:" + (sayi1-sayi2));}
else if(islem==3) {System.out.println("Say�lar�n Carp�m�:" + (sayi1*sayi2));}
else if(islem==4) {System.out.println("Say�lar�n B�l�m�:" +(sayi1/sayi2));}
else {System.out.println("Gecerli bir i�lem giriniz");}

scan.close();
}}


