package JavaPracticeDay_02;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  Problem Tan�m�
        Kullan�c�dan �� adet say� alarak bu say�lar�n
        bir dik ��genin kenar uzunluklar� olup olmad���n� hesaplatan bir kod yaz�n�z
        (Yard�m: Bir ��genin dik oldu�unu anlamak i�in a2+b2=c2 pisagor
        ba�lant�s�ndan yararlanabilirsiniz)

        �rnek Ekran ��kt�s�
        birinci kenar� giriniz: 2
        ikinci kenar� giriniz 15
        ���nc� kenar� giriniz: 7
        Bu bir dik ��gen de�ildir.

        Bu bir dik ��gendir */
Scanner scan=new Scanner(System.in)  ;

System.out.println("Lutfen bir say� belirtin: \nBir sayi daha belirtin: \nBir sayi daha belirtin:");
double sayi1=scan.nextDouble();
double sayi2=scan.nextDouble();
double sayi3=scan.nextDouble();

if ((sayi1*sayi1)==(sayi2*sayi2)+(sayi3*sayi3) || 
(sayi2*sayi2)==(sayi1*sayi1)+(sayi3*sayi3) || 
(sayi3*sayi3)==(sayi2*sayi2)+(sayi1*sayi1)) {System.out.println("Dik Ucgendir");}
else{System.out.println("Dikucgen degildir");}


    scan.close();
}}
