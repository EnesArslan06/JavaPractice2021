package JavaPracticeDay_05ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /*
         Girilen bir stringdeki a harfi say�s�n� bulunuz.
        ama  c harfine  gelirse d�ng�den ��k�ls�n
		Bug�n hava oldukca g�zel.-> 2*/
        
      Scanner scan=new Scanner(System.in);   
System.out.println("Bir cumle giriniz");
 String cumle=scan.nextLine();


 
 
 
 
int amiktari=0;
 
 for (int i = 0; i < cumle.length(); i++) {
	
 if (cumle.toLowerCase().charAt(i)=='a') {
	amiktari++;
	} else if(cumle.toLowerCase().charAt(i)=='c') {
		break;
	
}

 }       
 System.out.println("Girdiginiiz cumledeki a sayisi: " + amiktari);
 scan.close();  
      

}}
