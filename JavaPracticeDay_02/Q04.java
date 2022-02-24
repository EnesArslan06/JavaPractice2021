package JavaPracticeDay_02;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
		 *  Kullanicidan IT alanini isteyerek
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		yazdiriniz	*/
		 
Scanner scan=new Scanner(System.in);
System.out.println("Lutfen IT alanýnýzý Belirtiniz: \nqa: \ndev: \nba:\npm:");
		String alani=scan.next().toLowerCase();

if (alani.equals("qa")) {System.out.println("Quality Analyst");}
else if (alani.equals("dev")) {System.out.println("Developer");} 
else if(alani.equals("ba")) {System.out.println("Business Analyst");}
else if (alani.equals("pm")) {System.out.println("Project Manager");} 
else {System.out.println("Lutfen Tercihinizi Kontrol ediniz");}

scan.close();
		
		/*Scanner input = new Scanner (System.in);
		System.out.println("qa\ndev\nba\npm\nLutfen mesleginizi giriniz :");
		String jobTitle=input.next();

		String qa="Qualty Analyst";
		String dev = "Developer";
		String ba = "Business Analyst";
		String pm = "Project Manager";

		if(jobTitle.equalsIgnoreCase("qa")) {
			System.out.println("Mesleginiz: " + qa);

		}else if (jobTitle.toLowerCase().equals("dev")) {
			System.out.println("Mesleginiz: " + dev);
		}else if (jobTitle.toLowerCase().equals("ba")) {
			System.out.println("Mesleginiz: " + ba);
		}else if (jobTitle.equalsIgnoreCase("pm")) {
			System.out.println("Mesleginiz: " + pm);
		}else {
			System.out.println("Hatali secim yaptiniz");
		}

		input.close();*/



	}

}
