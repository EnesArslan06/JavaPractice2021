package JavaPracticeDay_02;

public class Q09 {

    public static void main(String[] args) {

       /*   45 deðerinde bir double oluþturun.
            Eðer double 5'e bölününce kalan 0 ise ve double 8'e bölününce kalan 0 ise
            "able to divide by 5 and 8" yazdýrýnýz.

            Eðer double 10'a bölününce kalan 5 ise ve double 9'a bölününce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazdýrýnýz.*/
     int sayi=100 ;
    		
     System.out.println();
     if (sayi%5==0 && sayi%8==0) {System.out.println("Girmiþ oldugunuz sayi 5 ve 8 e bölünebilmektedir.");}
     else if (sayi%10==0 && sayi%9==0) {System.out.println("Girmiþ oldugunuz sayi 10 ve 9 a bölünebilmektedir.");}
     else {System.out.println("Tekrar Deneyin");}
	

        
  
}}  
