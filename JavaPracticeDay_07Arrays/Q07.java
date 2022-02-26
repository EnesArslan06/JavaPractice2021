package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q07 {

	public static void main(String[] args) {
		/*
		 * write a method that accepts a 2 dimensional array and finds the max value (2
		 * boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir method yazin )
		 * Input : {{1,2,3},{4,5},{6,7,8}} Output : 8 //yeni bir arr acarim
		 * iceridekilerin hepsini yeni arr ye atarim
		 */
		int array[][] = { { 1, 2, -3 }, { 41, 55 }, { -61, -17, 80 } };

		System.out.println("Arrayin en buyuk elemani:" +maxdegerBul(array));
	}

	private static int maxdegerBul(int[][] array) {
		int max = array[0][0];//bos bir deger sayilir, bir kýyas icin olusturduk

		for (int kat = 0; kat < array.length; kat++) {

			for (int daire = 0; daire < array[kat].length; daire++) {

				if (array[kat][daire] > max) {
					max = array[kat][daire];
				}

			}
		}

		return max;

	}
}