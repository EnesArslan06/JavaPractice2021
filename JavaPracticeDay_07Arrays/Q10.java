package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasar�l�"
         * with arrays change it to "CoookBasar�l�" and write changing array
         *(String iniz: "GayetBasar�l�"  Diziyi "CoookBasar�l�" ye cevirin )
         *
         */
		
String cumle="GayetBasar�l�";
cumle=cumle.replace("Gayet", "Coook");
System.out.println(cumle);

String arr[]=new String[1];
arr[0]=cumle;
System.out.println(Arrays.toString(arr));

	}

}
