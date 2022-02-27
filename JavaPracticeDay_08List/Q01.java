package JavaPracticeDay_08List;

import java.nio.file.Watchable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
    	 /*
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

String arr1[]= {"Ali","Veli","Ayse","Fatma","Omer", "Tugba", "aaaAAA"};
 List<String> list=new ArrayList<>();
 List<String> list2=new ArrayList<>();
for (int i = 0; i < arr1.length; i++) {
	list.add(arr1[i]);
}
  
System.out.println(list);

for (String i : list) {
	if (!i.toLowerCase().contains("a")) {
		list2.add(i);
	}
}
	


System.out.println(list2);


    }



}
