package JavaPracticeDay_10Varargs;

import day06_Wrapper.C02_Concatination;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
	// output : merve
	
		concat("h","a","c","e","r");
		concat("haným"," basrili"," qa");
	}
	
public static void concat(String...str)	{	
		
	String yenistr="";
	
	for (String w : str) {
		yenistr=yenistr.concat(w);
		
	}
		
		
	System.out.println(yenistr);	
}
}
