package JavaPracticeDay_05ForLoop;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		/*
		 * Kullan�c�dan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf
		 * oldu�unu, de�ilse sessiz harf oldu�unu ekrana yazd�rs�n. Girdi�i de�er harf
		 * de�ilse yada 1 karakterden fazla ise hata mesaj� g�stersin. (Test girilen
		 * harfi b�y�k yada k���kl���ne duyarl�d�r.)
		 * 
		 * Sesli harfler: a,e,i,o,u
		 * 
		 * Test Data: a
		 * 
		 * Beklenen ��kt�: a harfi sesli harfdir.
		 * 
		 * Test Data: d
		 * 
		 * Beklenen ��kt�: d harfi sesiz harftir.
		 * 
		 * Test Data: we yada %
		 * 
		 * Beklenen ��kt�: Yanlis karakter girdiniz!
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Harf giriniz");
		String girilenharf = scan.nextLine();
//girdigi harfler sesli haarflere esit mi bu donduyu olusturur.Sesli harfler: a,e,i,o,u
		String sesliharfler = "aeiuoAEIUO";
		String sessizharfler = "bcdfghjklmnprstvyzxqwBCDKFGHJKLMNPRSTVYZXQW";

		/*if (girilenharf.length() == 1) {// tek harf kontrolu yapt�k tek harf ise asag�daki for cal�sacak
			// ifin i�erisine for bodysi act�k
			for (int i = 0; i < sessizharfler.length(); i++) {
				if (girilenharf.charAt(0) == sesliharfler.charAt(i)) {
					System.out.println("girilen harfler seslidir");
					break;
				} else if (girilenharf.charAt(0) == sessizharfler.charAt(i)) {
					System.out.println("girilen harf sessiz");
					break;
				} else {System.out.println("Yanl�s karakter girdiniz");}

			}
		}else {
			System.out.println("Yanl�s karakter girdiniz");}*/
scan.close();
	}
}
