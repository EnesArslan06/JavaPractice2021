package JavaPracticeDay_02;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen Bir sayý giriniz");
double sayi1=scan.nextDouble();
System.out.println("Lutfen bir sayý Daha giriniz");
double sayi2=scan.nextDouble();
System.out.println("Lutfen yapmak istediginiz iþlemi 1=Toplama,2=Cýkarma,3= Carpma, ve 4=Bolme olarak seciniz");
int islem=scan.nextInt();

if (islem==1) {System.out.println("Sayýlarýn Toplamý:" + (sayi1+sayi2));} 
else if (islem==2) {System.out.println("Sayýlarýn farký:" + (sayi1-sayi2));}
else if(islem==3) {System.out.println("Sayýlarýn Carpýmý:" + (sayi1*sayi2));}
else if(islem==4) {System.out.println("Sayýlarýn Bölümü:" +(sayi1/sayi2));}
else {System.out.println("Gecerli bir iþlem giriniz");}

scan.close();
}}


