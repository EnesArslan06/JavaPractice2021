package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q06 {
    public static void main(String[] args) {
	
	/*    write a java program to find the second largest number in the array?
	Maximum and minimum number in the array?
	(Dizideki en büyükk ikinci sayyiyi, maksimum ve minimum sayiyi
	bulmak için bir java programi yazin)
	
	int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };
	*/
	
int arr[]={ 100, 10001, -90, 845, 8787, 898, 0, 1, -90 };

Arrays.sort(arr);  
System.out.println(Arrays.toString(arr));

int enbuyuksayi=0;
for (int i = 0; i < arr.length; i++) {
	if (arr[i]>enbuyuksayi) {
	enbuyuksayi=arr[i];	
	}
	

}

System.out.println(enbuyuksayi);
System.out.println(Arrays.toString(arr));
System.out.println("En kucuk deger: "+ arr[0]+ "\nenbuyuk 2. sayi: " + arr[arr.length-2]+
		"\nEnbuyuk deger: "+ enbuyuksayi);

}}