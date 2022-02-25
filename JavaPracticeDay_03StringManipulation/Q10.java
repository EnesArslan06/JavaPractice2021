package JavaPracticeDay_03StringManipulation;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
    	/*

         * Kullanýcýdan aldýðýnýz  Adý, Soyadý ve kredi kartý numaralarýný aþaðýdaki gibi özel forma dönüþtürün
         * Kredi kartý numarasýný kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartý numarasý" yazdýrýn.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adýn baþ harfleri ve soyadý büyük olmalýdýr)
         */

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Lutfen isminizi giriniz :");
        String isim = scan.next();
        System.out.print("Lutfen bir soyisim giriniz :");
        String soyisim = scan.next();
        System.out.print("Lutfen kart numaranizi giriniz :");
        String kartno=scan.next();

        if (kartno.length()==16) {

            isim= isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*");
            soyisim=soyisim.substring(0,1).toUpperCase() + soyisim.substring(1).replaceAll("\\w", "*");
            kartno="**** **** **** "+ kartno.substring(kartno.length()-4);

        }else {
            System.out.print("lutfen 16 haneli kart numarasi giriniz :");
        }

        System.out.println(isim + " " +  soyisim + " " + kartno);

        scan.close();

    }
}
