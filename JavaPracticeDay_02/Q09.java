package JavaPracticeDay_02;

public class Q09 {

    public static void main(String[] args) {

       /*   45 de�erinde bir double olu�turun.
            E�er double 5'e b�l�n�nce kalan 0 ise ve double 8'e b�l�n�nce kalan 0 ise
            "able to divide by 5 and 8" yazd�r�n�z.

            E�er double 10'a b�l�n�nce kalan 5 ise ve double 9'a b�l�n�nce kalan 0 ise
            "able to divide by 9 and divide by 10 reminder is 5" yazd�r�n�z.*/
     int sayi=100 ;
    		
     System.out.println();
     if (sayi%5==0 && sayi%8==0) {System.out.println("Girmi� oldugunuz sayi 5 ve 8 e b�l�nebilmektedir.");}
     else if (sayi%10==0 && sayi%9==0) {System.out.println("Girmi� oldugunuz sayi 10 ve 9 a b�l�nebilmektedir.");}
     else {System.out.println("Tekrar Deneyin");}
	

        
  
}}  
