package JavaPracticeDay_08List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Q02 {

    public static void main(String[] args) {
    	 //2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanlarý bir
        //listeye kopyalayan ve harf sýrasýna göre yazdýran bir METHOD yazýnýz.
        //Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        //   Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

String[][] array={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

 
listeAktar(array);

}

	private static void listeAktar(String[][] array) {
		
		List<String> isimlerList=new ArrayList<>();
		for (int i = 0; i < array.length; i++) {
		for (int j = 0; j < array[i].length; j++) {
			isimlerList.add(array[i][j]);
			
		}
    	
    	
	}
    	
    System.out.println(isimlerList);
		
	}

}
