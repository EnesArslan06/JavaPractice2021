package JavaPracticeDay_03StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
    	// Kullan�c�dan tek seferde alaca��n�z 2 kelimelik ad soyad� 2 ayr� kelimeye ay�r�n�z,
        // ad ayr� soyad ayr� sekilde ekrana yazd�r�n�z.

        Scanner oku = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
        String adSoyad = oku.nextLine();

        // Ahmet Yılmaz    substring(başlangıç index, e kadar - dahil değil)


        String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        String Soyad = adSoyad.substring(adSoyad.indexOf(" ")+ 1);

        System.out.println("ad = " + ad);       //ad = kader
        System.out.println("Soyad = " + Soyad); //Soyad = Esen
    }
}
