package JavaPracticeDay_05ForLoop;

public class Q15 {
	public static void main(String[] args) {
   
     /* A
        A B
        A B C
        A B C D
        A B C D E
        A B C D E F
        seklini yazd�r�n�z.  65=A'n�n ascii degeri*/
        int harf=65;
    for (int baba = 0; baba < 6; baba++) {
		for (int evlat = 0; evlat <=baba; evlat++) { //baba kadar evlat olacak
			System.out.print((char)(harf+evlat)+" "); //buras� carp�m tablosu gibi deger verdi.
		
		//int degerini A ya cevirdik  (char)(harf+evlat) bu sek�lde yapmazsak 65 66 67 olarak gider
			//data casting yaparak int degeri chara cevirdik.
		}
	
      System.out.println();
    }    
    
}}
