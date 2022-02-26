package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q16 {
	public static void main(String[] args) {
		/*
		 * Write a method which accepts string as parameter and prints the sum of digits
		 * present in thr given string input :"ade1r4d3" output : 8 trick : Use -->
		 * Character.isDigit() --> Integer.valueOf()
		 */
//hiclige gore parcala array at karakterlere bak rakamsa toplamin icine at

		String str = "ade1r4d3";
		String arr[] = str.split("");
		System.out.println(Arrays.toString(arr)); // [a, d, e, 1, r, 4, d, 3]
		int toplam = 0;
		for (int i = 0; i < arr.length; i++) {

			if (Character.isDigit(arr[i].charAt(0))) {
				toplam += Integer.valueOf(arr[i]);//karakterler stringdir yani array stringlerden olusuyor.
				//Integer valueOf bunu ýnteger a cevirir mesela 4 arrayde string iken Integer of value ile ýnt degeri olarak toplar

			} else {
				continue;
			}

		}

		System.out.println(toplam);
	}
}
