package JavaPracticeDay_05ForLoop;

public class Q05 {

    public static void main(String[] args) {
    	//Aþaðýdaki þekilde çýktý veren programý print içerisinde
    	// sadece bir tane # kullanarak yazýdýrýnýz

//    	            #####
//    	            #####
//    	            #####
//    	            #####
//    	            #####
//5 satýrlýk dongu icice for yapacagýz 5 satýrlýkda sutun. 
 //satýr lar baba sutunlar ogul diyebiliriz   	
    	
       for (int satir = 1; satir <=5; satir++) {
		for (int sutun = 1; sutun <=5; sutun++) {
			System.out.print("#"); //yanyana yazdýracaz 
		}
	System.out.println();//birinci forun her calýstýktan sonra asagý inmesi icin bos syso koyuyoruz
       }

    
    
    }
}
