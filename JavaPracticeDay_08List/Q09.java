package JavaPracticeDay_08List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q09 {
	public static void main(String[] args) {

		/*
		 * Write a Java program to get a String from user as input and find the
		 * maximumCounts occurring character in that string. (Ignore case sensitivity)
		 * 
		 * Kullanicidan aldiginiz bir string icinde en cok tekrar eden karakteri
		 * yazdiriniz input : Learning java is easy output: maximumCounts occurring
		 * character is : a
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Cumle giriniz");
		String cumle = scan.nextLine();

		// Stringdeki her eleman sarta sokulacak en cok olan eleman� yazd�racak
		// tekrar edenleri Liste atacaz sonra yazd�racaz listi.

		String array[] = cumle.split("");// stryi hiclige gore parcaliyor ve arrayin her bir elemani yaptik

		String enCokTekrarEden= "";
		int sayac = 0;
		int maxSayac = 0;

		for (int i = 0; i < array.length; i++) {// mesela ilk harfi kendisinden sonra gelen harfler kadar tekrar ediyot
												// bir for daha
			for (int j = i + 1; j < array.length; j++) {// karsilastiran kararkter kontrol�, ilk harfden sonra
														// baslayacak

				if (array[i].equalsIgnoreCase(array[j])) { // ald�g�n iler j ile esitse bunlari sayd�racaz
					// esit karakter kontrolu
					sayac++;

				}

			}
			if (sayac > maxSayac) {
				maxSayac = sayac;
				enCokTekrarEden= array[i];
			} else if (sayac == maxSayac) {
				enCokTekrarEden+=", "+ array[i];
			}
			sayac = 0;
		}
		System.out.println(enCokTekrarEden);
	}
}
