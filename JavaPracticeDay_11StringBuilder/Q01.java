package JavaPracticeDay_11StringBuilder;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
    	/*
		Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren ve cümlenin palindrom
	        olup olmadýðýný kontrol eden (büyük/küçük harf duyarlýlýðý olmadan) bir Java programý yazýn.
	     (without case sensitivity)
	     Eg : input : I love Java
	     Output: "Reversed sentence : avaJ evol I 
	        It is not a palindrome"
		 */

 Scanner scan=new Scanner(System.in);
 System.out.println("bir metin giriniz");
 String metin=scan.nextLine();
 
 StringBuilder sB=new StringBuilder(metin);
 //sB.append(metin);   	
 
 String tersMetin=sB.reverse().toString();//reverse ters cevirme, to stringde String builderi stringe ceviriyor
 
 if (tersMetin.equalsIgnoreCase(metin)) {
	System.out.println("Girilen metin polindromdur: " + tersMetin);
}else {
	System.out.println("polindrom bir metin degildir: "+ tersMetin);
}
 
 
 
    }

}
