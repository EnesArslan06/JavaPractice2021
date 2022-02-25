package JavaPracticeDay_03StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
    	// Kullanýcýdan tek seferde alacaðýnýz 2 kelimelik ad soyadý 2 ayrý kelimeye ayýrýnýz,
        // ad ayrý soyad ayrý sekilde ekrana yazdýrýnýz.

        Scanner oku = new Scanner(System.in);
        System.out.print("Lutfen adinizi ve soyadinizi giriniz = ");
        String adSoyad = oku.nextLine();

        // Ahmet YÄ±lmaz    substring(baÅŸlangÄ±Ã§ index, e kadar - dahil deÄŸil)


        String ad = adSoyad.substring(0, adSoyad.indexOf(" "));
        String Soyad = adSoyad.substring(adSoyad.indexOf(" ")+ 1);

        System.out.println("ad = " + ad);       //ad = kader
        System.out.println("Soyad = " + Soyad); //Soyad = Esen
    }
}
