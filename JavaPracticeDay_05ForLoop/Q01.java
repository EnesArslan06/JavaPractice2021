package JavaPracticeDay_05ForLoop;

public class Q01 {
	 public static void main(String[] args) {
	

    /*  sayac� ritmik ilerleyen ve ad�m say�s� belli ise FOR kullan�l�r.
       DE��LSE While kullan�l�r, E�er d�ng�ye bir kez mutlaka girilecekse DO_WHILE kullan�l�r.

       Problem Tan�m�
        100'den 0'a kadar 13'e tam b�l�nebilen say�lar� ve toplamlar�n� ekrana yazd�r�n�z (b�y�kten k����e).

         Ekran ��kt�s�
        91
        78
        65
        52
        39
        26
        13    */
   
  
		 
    	//sart sayi%13=0 olacak   
    	
    	int toplam=0;
    	for (int i = 100; i >=0; i--) {
			if (i%13==0) {
				System.out.print(i+" ");
			toplam+=i; //13 e bolunen sayilar� toplam�n icene her seferinde at demek if sart�n� saglayan ifler
			}
			
		}
    	System.out.println(" ");//buraya bos syso atarsak alta gecer sayilar�n toplami icin \n koymadan bu sekilde yap�l�r
    	System.out.println("\n13 e tam bolunen say�lar�n toplami: "+ toplam);
    }
}
