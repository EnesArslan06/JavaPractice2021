package JavaPracticeDay_07Arrays;

import java.util.Arrays;

public class Q08 {

	public static void main(String[] args) {

		/*
		 * $ ve £ isareti olanlarin toplamlarini ayri ayri bulun
		 * 
		 * String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
		 */
//String arraye atarým sonra " " gore parcalarim. for acarim

		String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

		String paraarr[] = str.split(" ");
		System.out.println(Arrays.toString(paraarr));

		int dolartoplam = 0;
		int eurotoplam = 0;

		for (int i = 0; i < paraarr.length; i++) {
			if (paraarr[i].contains("$")) {

				dolartoplam += Integer.parseInt(paraarr[i].replace("$", ""));// string i int cevirdik $ iceriyorsa
																				// hiclikle degistir

			}

			else {
				eurotoplam += Integer.parseInt(paraarr[i].replace("£", ""));

			}
		}
System.out.println("Toplam dolar: "+ dolartoplam);
System.out.println("Toplam Euro: " + eurotoplam);	

	}
}
