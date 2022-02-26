package JavaPracticeDay_06DoWhile;

import java.util.Scanner;

public class Q18 {
	public static void main(String[] args) {

		// STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod
		// yazınız.

		Scanner scan = new Scanner(System.in);
 
		String kontrolpin = "enes cok yorgun";
		int girisHakki = 3; // burada 3 hak verdigimizi belirttik

		while (true) {

			System.out.println("Lutfen pini giriniz: ");
			String pin = scan.nextLine();

			if (pin.equals(kontrolpin)) {
				System.out.println("Gayet Basarili");
				
			} else {
				System.out.println("Hatali giris yaptiniz");
				girisHakki--;
				System.out.println("Kalan deneme Hakkiniz: " + girisHakki);
				if (girisHakki == 0) {
					System.out.println(" Deneme Hakkiniz Kalmadi");
					break;
				}
			}

		}
scan.close();
	}
}
