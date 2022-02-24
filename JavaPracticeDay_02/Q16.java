package JavaPracticeDay_02;
import java.util.Scanner;

public class Q16 {
public static void main(String[] args){
   /* Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
    en kucuk olanlarini konsola yazdiriniz
    int num1 
    int num2 
    int num3
*/
Scanner scan=new Scanner(System.in);
	
System.out.println("Lutfen 3 tane sayi giriniz;");   
 int sayi1=scan.nextInt();   
 int sayi2=scan.nextInt();
 int sayi3=scan.nextInt();       
        
if ((sayi1>sayi3 && sayi3>sayi2) || (sayi1>sayi2 && sayi2>sayi3)) {System.out.println("En buyuk sayi:" + sayi1);} 
else if ((sayi2>sayi3 && sayi3>sayi1) || (sayi2>sayi1 && sayi1>sayi3)) {System.out.println("En buyuk sayi:" + sayi2);}
else if ((sayi3>sayi1 && sayi1>sayi2) || (sayi3>sayi2 && sayi2>sayi1)) {System.out.println("En buyuk sayi:" + sayi3);}	
else {System.out.println("Girdiginiz Degerleri Kontrol Ediniz...");} 
   
scan.close();
}}

