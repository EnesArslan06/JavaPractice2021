package JavaPracticeDay_07Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {
	
	public static void main(String[] args) {
	// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	// java programi yazin

Scanner scan=new Scanner(System.in);		
		System.out.println("Arrayin boyutunu giriniz");
		int arrboyutu=scan.nextInt();
		
		int array[]=new int[arrboyutu];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Arrayin "+(i+1) + ". elemanini giriniz");
			array[i]=scan.nextInt();//arrayin elemanlarýný scan ile kullanici giriyor
			
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		System.out.println("Girdiginiz arrayin max-min eleman degerin farki: "+(array[array.length-1]-array[0]));
		
scan.close();		
	}

}
