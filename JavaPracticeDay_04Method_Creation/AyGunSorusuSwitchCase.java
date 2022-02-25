package JavaPracticeDay_04Method_Creation;

import java.util.Scanner;

public class AyGunSorusuSwitchCase {

	public static void main(String[] args) {
		// Girilen bir ay numarasýna göre ayýn kacgun oldugunu sayi ile yazdýrýn
		 Scanner scan=new Scanner(System.in);
System.out.println("Gununu Merak ettiginiz  ay numarasýný giriniz : ");
	int ayno=scan.nextInt();

switch (ayno) {
case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	System.out.println("Girdiginiz Ay 31 gun");
	break;
case 4:
case 6:
case 9:
case 11:	
	System.out.println("Girdiginiz Ay 30 gun");
	break;
case 2:
	System.out.println("Yýlý Giriniz : ");
	int yil=scan.nextInt();
	if (yil%4==0) {System.out.println("Girdiginiz ay 29 gundur");
	}else {	System.out.println("Girdiginiz ay 28 gundur");
	}
	break;
	
default: System.out.println("Hatalý veri girdiniz");
	break;
}
scan.close();
}}
