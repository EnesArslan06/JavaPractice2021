package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q05 {

	public static void main(String[] args) {
		/*
		 * write a java program that calculates the average value of array elements
		 * Print elements that are greater than avarage
		 * (dizi elemanlarinin ortalama degerini hesaplayan ve
		 * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
		 * input[]= {1,2,3,4,5,6,7} 
		 * Output : 4
		 */
		
int arr[]={1,2,3,4,5,6,7} ;



int toplam=0;

		
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		
	int ortalama=toplam/arr.length;

	System.out.println(Arrays.toString(arr));
	System.out.println(ortalama);
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]>ortalama) {
		System.out.print(arr[i] +" ");	
		}
	}
		
	}}


