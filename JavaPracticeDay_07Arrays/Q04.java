package JavaPracticeDay_07Arrays;

public class Q04 {

	public static void main(String[] args) {
		/*
		 * verilen bir int Arrayde toplamlari istenen degere esit olan sayi ciftlerini
		 * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1}; int
		 * istenenToplam=9;
		 */

		int[] arr = { 5, 7, -6, 4, 2, 15, 3, 8, 1 };
		int istenenToplam = 9; // burada herhangi 2 elemanin toplami 9 ise onlari ayir diyor

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {// mesela 5 i aldýk diger elemanlarla topla demek
				// j, i+1 den baslar i cunku i den sonraki elamanlari toplariz
				// her elemanin sonraki elemanlar ile toplamini ariyoruz.
				if (arr[i] + arr[j] == istenenToplam) {
					System.out.println(arr[i] + " ile " + arr[j] + " toplami: " + istenenToplam);
				}

			}

		}

	}
}
