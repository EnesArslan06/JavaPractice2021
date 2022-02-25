package JavaPracticeDay_04Method_Creation;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {

		/* StringMethods
           String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
           Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
          ORNEK:
           INPUT      :  goat
                         photo
                         ghost
                         kalem
           OUTPUT :      gat
                         hoto
                         ghost
                         lem
		 */
       
Scanner scan=new Scanner(System.in);
    	
 System.out.print("Lutfen bir kelime Giriniz:");
 String kelime=scan.nextLine().toLowerCase();
 
System.out.println(ilkikisiz(kelime));
 
    	
 scan.close();   
}
public static String ilkikisiz(String kelime) {
		String kalanHarfler="";
		
		if (kelime.startsWith("gh")) {
			kalanHarfler=kelime;
		} else if(kelime.startsWith("g")){
				kalanHarfler=kelime.charAt(0)+ kelime.substring(2);
		
	}	else if(kelime.charAt(1)=='h') {
				kalanHarfler=kelime.substring(1);
	}	
		else  {
			kalanHarfler=kelime.substring(2);
			}
		
		return kalanHarfler;
    


  //***************************Void ile cozumum***************************************  
   /* public static void ilkikisiz(String kelime) {
		
		if (kelime.startsWith("gh")) {
			System.out.println(kelime);
		} else if(kelime.startsWith("g")){
				System.out.println(kelime.charAt(0)+ kelime.substring(2));
		
	}	else if(kelime.charAt(1)=='h') {
				System.out.println(kelime.substring(1));
	}	
		else  {System.out.println(kelime.substring(2));}*/


		



}}
