package JavaPracticeDay_03StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*Kullanıcıdan alacağını bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
        
        System.out.print("Bir string giriniz = "); // Java ogren
        String text = scan.nextLine();

        boolean boslukVarMi = text.contains(" ");
        System.out.println("boslukVarMi = " + boslukVarMi); //boslukVarMi = true

        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
        boolean bosMu = text.isEmpty();
        System.out.println("bosMu = " + bosMu); //bosMu = false*/
    	
    	Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz: ");
        String str=scan.nextLine();
        str.contains(" "); //burdan boolean bir deger alacaz bozluk varmı yok mu
        boolean varMi=str.contains(" ");
        System.out.println("girilen stringde bosluk var mı?" +varMi );
     
        
        // Kullanıcıdan alacağını bir stringin bos olup olmadığını kontrol ediniz.
        
        str.isEmpty();
        System.out.println("Girilen String Bosmu?:"+str.isEmpty());
        
        
        
        
        scan.close();
    }
}

