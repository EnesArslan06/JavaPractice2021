package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q10 {

	public static void main(String[] args) {
		/*  you have a string "GayetBasarýlý"
         * with arrays change it to "CoookBasarýlý" and write changing array
         *(String iniz: "GayetBasarýlý"  Diziyi "CoookBasarýlý" ye cevirin )
         *
         */
		
String cumle="GayetBasarýlý";
cumle=cumle.replace("Gayet", "Coook");
System.out.println(cumle);

String arr[]=new String[1];
arr[0]=cumle;
System.out.println(Arrays.toString(arr));

	}

}
