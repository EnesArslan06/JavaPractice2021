package JavaPracticeDay_02;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
          Problem tanimi : 
        Kulan�c�dan arac�n�n h�z�n� al�n�z
        Trafik cezas�n�n de�erini hesaplay�n.
            45 h�z s�n�r�d�r.
            E�er h�z�n�z 55-74 aras�nda ise:
            Ceza 100 $'d�r.

            E�er h�z�n�z 75 - 84 aras�nda ise:
            Ceza 150 $'d�r.

            E�er h�z�n�z 85 -94 aras�nda ise:
            Ceza 320 $'d�r.

            E�er h�z�n�z 94'den daha fazla ise:
            Ceza 500 $'d�r.

            ve ayr�ca,
            E�er s�r�c�n�n ehliyeti yoksa cezaya 200 $ eklenir.

            �rn: H�z�n�z 77 iken cezan�z 150$'d�r ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            �rn;

            currentSpeed(H�z�n�z) 87
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = true;

            sonu� 320 olmal�d�r.

            currentSpeed(H�z�n�z) 65
            ve isDriverLicenceAvailable(Ehliyeti var m�?) = false;

            sonu� 300 olmal�d�r.*/
     
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen H�z�n�z� Giriniz: \nEhliyetiniz Varsa 'E' yoksa 'H' yaz�n�z");
 double hiz=scan.nextDouble();
 char ehliyet=scan.next().toLowerCase().charAt(0);
 
 if (ehliyet=='e') {if (hiz>55 && hiz<=74) {System.out.println("Cezan�z 100$ ");} 
 else if (hiz>74 && hiz<=84) {System.out.println("Cezan�z 150$");}
 else if (hiz>85 && hiz<=94){System.out.println("Cezan�z 320$");}
 else if (hiz>94) {System.out.println("Cezan�z 500$");}}
 else if (ehliyet=='h'){if (hiz>55 && hiz<=74) {System.out.println("Cezan�z 300$ ");} 
 else if (hiz>74 && hiz<=84) {System.out.println("Cezan�z 350$");}
 else if (hiz>85 && hiz<=94){System.out.println("Cezan�z 520$");}
 else if (hiz>94) {System.out.println("Cezan�z 700$");}}
 else {System.out.println("Lutfen Gecerli bir giri� yap�n�z");}	
	
scan.close(); 
}}
