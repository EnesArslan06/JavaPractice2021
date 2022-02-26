package JavaPracticeDay_05ForLoop;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		/*
		 * Kullanýcýdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		 * olduðunu, deðilse sessiz harf olduðunu ekrana yazdýrsýn. Girdiði deðer harf
		 * deðilse yada 1 karakterden fazla ise hata mesajý göstersin. (Test girilen
		 * harfi büyük yada küçüklüðüne duyarlýdýr.)
		 * 
		 * Sesli harfler: a,e,i,o,u
		 * 
		 * Test Data: a
		 * 
		 * Beklenen Çýktý: a harfi sesli harfdir.
		 * 
		 * Test Data: d
		 * 
		 * Beklenen Çýktý: d harfi sesiz harftir.
		 * 
		 * Test Data: we yada %
		 * 
		 * Beklenen Çýktý: Yanlis karakter girdiniz!
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Harf giriniz");
		String girilenharf = scan.nextLine();
//girdigi harfler sesli haarflere esit mi bu donduyu olusturur.Sesli harfler: a,e,i,o,u
		String sesliharfler = "aeiuoAEIUO";
		String sessizharfler = "bcdfghjklmnprstvyzxqwBCDKFGHJKLMNPRSTVYZXQW";

		/*if (girilenharf.length() == 1) {// tek harf kontrolu yaptýk tek harf ise asagýdaki for calýsacak
			// ifin içerisine for bodysi actýk
			for (int i = 0; i < sessizharfler.length(); i++) {
				if (girilenharf.charAt(0) == sesliharfler.charAt(i)) {
					System.out.println("girilen harfler seslidir");
					break;
				} else if (girilenharf.charAt(0) == sessizharfler.charAt(i)) {
					System.out.println("girilen harf sessiz");
					break;
				} else {System.out.println("Yanlýs karakter girdiniz");}

			}
		}else {
			System.out.println("Yanlýs karakter girdiniz");}*/
scan.close();
	}
}
