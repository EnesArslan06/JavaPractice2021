package JavaPracticeDay_02;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  Problem Tanýmý
        Kullanýcýdan üç adet sayý alarak bu sayýlarýn
        bir dik üçgenin kenar uzunluklarý olup olmadýðýný hesaplatan bir kod yazýnýz
        (Yardým: Bir üçgenin dik olduðunu anlamak için a2+b2=c2 pisagor
        baðlantýsýndan yararlanabilirsiniz)

        Örnek Ekran Çýktýsý
        birinci kenarý giriniz: 2
        ikinci kenarý giriniz 15
        üçüncü kenarý giriniz: 7
        Bu bir dik üçgen deðildir.

        Bu bir dik üçgendir */
Scanner scan=new Scanner(System.in)  ;

System.out.println("Lutfen bir sayý belirtin: \nBir sayi daha belirtin: \nBir sayi daha belirtin:");
double sayi1=scan.nextDouble();
double sayi2=scan.nextDouble();
double sayi3=scan.nextDouble();

if ((sayi1*sayi1)==(sayi2*sayi2)+(sayi3*sayi3) || 
(sayi2*sayi2)==(sayi1*sayi1)+(sayi3*sayi3) || 
(sayi3*sayi3)==(sayi2*sayi2)+(sayi1*sayi1)) {System.out.println("Dik Ucgendir");}
else{System.out.println("Dikucgen degildir");}


    scan.close();
}}
