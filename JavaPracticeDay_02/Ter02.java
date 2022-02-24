package JavaPracticeDay_02;

import java.util.Scanner;

public class Ter02 {

    public static void main(String[] args) {
        // Kullanicidan bir character girmesini isteyiniz
        // Character harf ise kucuk harf olup olmadigini kontrol ediniz
        // Kucuk harf ise ekrana "Kucuk Harf" yazdiriniz
        // Buyuk harf ise ekrana "Buyuk Harf" yazdiriniz
        // Harf degilse ekrana "Harf degil" yazdiriniz
        //97:a  122:z ascii degeri

    	Scanner scan=new Scanner(System.in);
       
System.out.println("Lutfen Bir karakter Giriniz...");
char karakter=scan.next().charAt(0);

/*if (karakter>='a' && karakter<='z') {System.out.println("Kucuk Harftir..");}
else if (karakter>='A' && karakter<='Z') {System.out.println("Buyuk Harftir...");}
else {System.out.println("Harf degildir...");} */
 
System.out.println((karakter>='A' && karakter<='Z') ? "Buyuk Harf" : 
	(karakter>='a' && karakter<='z') ? "Kucuk harf" : "Harf degildir");

 scan.close();   
    }} 