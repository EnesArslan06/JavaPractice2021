package JavaPracticeDay_09DateTimeSoru;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Registration {

	 
	ArrayList<User> kullanicilar=new ArrayList<>();
	
	public List<User> register (){
		
	Scanner scan=new Scanner(System.in);
	System.out.println("adinizi giriniz : ");
	String isim=scan.nextLine();
		
	User user=new User(isim, LocalDateTime.now());
	kullanicilar.add(user);		
			
		return kullanicilar;
		
	}	
	
	public  void printHappyUsers(ArrayList<User>users) {
	for (User each : users) {
		if (each.registerDate.getSecond()<10) {
			System.out.println("Sansli kisisiniz " + each.name+" 5 kilo bal kazandiniz");
		}else {
			System.out.println("Maalesef "+each.name+" bali kazanamadiniz");
		}
		
		
	}
		  
	}
	public void listele(ArrayList<User>users) {//bu methodu kendimiz yapiyoruz
		for (User each : users) {
		System.out.println("Adi: " +each.name+" kayit zamani" + each.registerDate);	
		}
		
	}
}
