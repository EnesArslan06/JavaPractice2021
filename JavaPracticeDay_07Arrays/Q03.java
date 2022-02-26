package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q03 {

	public static void main(String[] args) {
		// bir int Array elemanlarinin iþaretini(+-)degistiren bir method yaziniz.
		// input : 1,2,-3,4,-5,-6
		// output :-1,-2,3,-4,5,6
		// artýlari eksi ile carp forla gir - ile carp

		int[] arr = { 1, 2, -3, 4, -5, -6 };

		for (int i = 0; i < arr.length; i++) {

		arr[i]=(-1*arr[i]);	
		
		
		}

		System.out.println(Arrays.toString(arr));
	}

}
