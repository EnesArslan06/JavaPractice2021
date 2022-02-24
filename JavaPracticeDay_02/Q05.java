package JavaPracticeDay_02;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		// Kullanicidan  yasini ve kilosunu alaliniz
		// 18 yasindan kucuk ise kan bagisi yapamaz
		// 18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		// 18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.

Scanner scan=new Scanner(System.in);
System.out.println("Lutfen Yasinizi ve kilonuzu belirtiniz");
int yas=scan.nextInt();
double kilo=scan.nextDouble();
		
/*if (yas>18){if (kilo>50){System.out.println("Kan bagısı yapabilir");} else {System.out.println("Kan bagısı yapamaz");}} 
else if(yas<18 && yas>0){System.out.println("Kan bagısı yapamaz");}
else {System.out.println("Lutfen girisinizi kontrol ediniz");} */

System.out.println(yas>18 ? (kilo>50 ? "Kan bagısı yapabilir" : "Kan bagısı yapamaz") : "Kan bagısı yaptıramaz");


scan.close();
	
	}

}
