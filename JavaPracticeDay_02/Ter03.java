package JavaPracticeDay_02;

import java.util.Scanner;

public class Ter03 {

    public static void main(String[] args) {
    	// Kullan�c�dan bir pozitif tamsay� girmesini isteyin, 
    	//o pozitif tamsay� 3 basamakl� ise ekrana �3 Basamakl�� yazd�r�n.
        // 3 basamakl� degilse �ift olup olmadigini kontrol edin. 
    	//�ift ise �3 basamakl� olmayan �ift say�� yazd�r�n.
        // �ift say� degilse �3 basamakl� olmayan tek say� yazd�r�n.�
    	
Scanner scan=new Scanner(System.in);

System.out.println("Lutfen Pozitif bir tam say� giriniz");
int sayi=scan.nextInt();

if(sayi>=100 && sayi<1000) {if (sayi%2==0){System.out.println("3 Basamakl� Cift Sayi");} 
else{System.out.println("3 basamakl� tek sayi");}}
else if (sayi<100 || sayi>=1000) {if (sayi%2==0){System.out.println("3 basamakl� olmayan cift sayi");} 
else {System.out.println("3 basamakl� olmayan tek sayi");}}
else {System.out.println("Lutfen Bir Tam sayi giriniz....");}


scan.close();

}}