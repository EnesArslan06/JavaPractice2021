package JavaPracticeDay_08List;

import java.util.ArrayList;
import java.util.Scanner;


public class Q05 {
   
@SuppressWarnings("resource")
public static void main(String[] args) {
	 // Kullan�c�dan alaca��n�z 6 elemanl� bir dizinin
    // sadece tek sayi olan elemanlar�n� ayr� diziye bir metodda atayarak
    // main de yazd�r�n�z.
	
Scanner scan=new Scanner(System.in);	
	
int array[]=new int[6];

for (int i = 0; i <6; i++) {
	System.out.println("Sayi giriniz");
	array[i]=scan.nextInt();

}

System.out.println(tekEleman(array));

}

private static ArrayList<Integer> tekEleman(int[] array) {//bu method bize list dondurecek
	ArrayList<Integer> list=new ArrayList<>();//yukardan ne kadar veri gelecegini bilmiyoruz o yuzden ListEditor ekliyoruz
	
	for (int i = 0; i < array.length; i++) {
		if (array[i]%2==1) {
			list.add(array[i]);
		} 
	}
	
	
	return list;
	
	
}
}

