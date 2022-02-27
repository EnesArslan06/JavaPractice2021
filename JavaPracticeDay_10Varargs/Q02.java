package JavaPracticeDay_10Varargs;

import java.security.PublicKey;

public class Q02 {
	public static void main(String[] args) {
		         // verilen int lerden ilki haric tum sayilari toplayan ve
				// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

toplama(3,4,5,6,7,8,9,2);
		
}		
	public	static void toplama(int a, int ...b)	{	
			int toplam=0;
		for (int i : b) {
			toplam+=i;
		}
	System.out.println(a*toplam);	
	
	}		
}
