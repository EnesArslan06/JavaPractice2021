package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q02 {
    public static void main(String[] args) {


    	 //multidimensional arrayin i� array lerindeki t�m elemanlar�n toplam�n� birer birer bulan
        // ve herbir sonucu yeni bir arrayin eleman� yapan ve yeni array i ekrana yazd�ran program� yaziniz.
        //input {{10,20,30},{4},{6,7,20}}==> output ={60,4,33}


 int array[][]= {{10,20,30},{4},{6,7,20}};
 int newarray[]= new int[array.length];

 
 for (int kat = 0; kat < array.length; kat++) {
for (int daire = 0; daire < array[kat].length; daire++) {
	newarray[kat]+=array[kat][daire];
}
 
 }	
System.out.println(Arrays.toString(newarray));
 
    
    } }