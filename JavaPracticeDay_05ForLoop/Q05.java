package JavaPracticeDay_05ForLoop;

public class Q05 {

    public static void main(String[] args) {
    	//A�a��daki �ekilde ��kt� veren program� print i�erisinde
    	// sadece bir tane # kullanarak yaz�d�r�n�z

//    	            #####
//    	            #####
//    	            #####
//    	            #####
//    	            #####
//5 sat�rl�k dongu icice for yapacag�z 5 sat�rl�kda sutun. 
 //sat�r lar baba sutunlar ogul diyebiliriz   	
    	
       for (int satir = 1; satir <=5; satir++) {
		for (int sutun = 1; sutun <=5; sutun++) {
			System.out.print("#"); //yanyana yazd�racaz 
		}
	System.out.println();//birinci forun her cal�st�ktan sonra asag� inmesi icin bos syso koyuyoruz
       }

    
    
    }
}
