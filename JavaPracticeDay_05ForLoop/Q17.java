package JavaPracticeDay_05ForLoop;

import java.util.Iterator;
import java.util.Scanner;


public class Q17 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       ÅŸeklini konsola yazdiriniz.

     Scanner scan=new Scanner(System.in);
     
     	System.out.println("Satir Sayisiný belietin");
     int satirsayisi=scan.nextInt();
     	/*for (int satir = 0; satir < satirsayisi; satir++) {
		for (int bosluk = 0; bosluk < satirsayisi-(satir+1); bosluk++) {
			System.out.print(" ");
		}
     		for (int yildiz = 0; yildiz <1+(2*satir); yildiz++) {
			System.out.print("*");
		}System.out.println();
	}*/

     for (int satir = satirsayisi-1; satir >= 0; satir--) {
 		for (int bosluk = 0; bosluk < satirsayisi-satir; bosluk++) {
 			System.out.print(" ");
 		}
      		for (int yildiz = 1; yildiz <2*satir; yildiz++) {
 			System.out.print(yildiz);
 		}System.out.println();
 	}

}}