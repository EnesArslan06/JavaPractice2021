package JavaPracticeDay_02;

import java.util.Scanner;
public class Q08 
{public static void main(String[] args) {

	
	 /* Problem tanimi : 
	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapin*/
	 
	Scanner scan=new Scanner(System.in);
	System.out.println("Aldıgınız urunun adedi: \nUrunun liste fiyatı: "
			+ "\nMusteri kartınız varsa E yoksa H seceneginin giriniz:") ;
	int adet=scan.nextInt();
	double fiyat=scan.nextDouble();
	char kart=scan.next().toLowerCase().charAt(0);

	double toplamfiyat=adet*fiyat;


	if (kart=='e') {if (adet>10){System.out.println("Toplam Fiyatınız:" + (toplamfiyat*0.8));} 
	else {System.out.println("Toplam Fiyatınız:" + (toplamfiyat*0.85));}}
	else if (kart=='h') {if (adet>10){System.out.println("Toplam Fiyatınız:" + (toplamfiyat*0.85));} 
	else {System.out.println("Toplam Fiyatınız:" + (toplamfiyat*0.90));}}
	else {System.out.println("gecerli bir secim yapınız");}

	
		
/*if (kart=='E') {if (adet>10){System.out.println("yuzde 20 indirim kazandınız");} 
	else {System.out.println("yuzde 15 indirim kazandınız");}}
	else if(kart=='H') {if (adet>10){System.out.println("yuzde 15 indirim kazandınız");}
	else{System.out.println("yuzde 10 indirim kazandınız");}} else{System.out.println("Lutfen Gecerli bir harf giriniz");}  */	 

		/*System.out.println("Lutfen aldiginiz urunun adedini giriniz");
		int quantity = giris.nextInt();
​
		System.out.println("Lutfen aldiginiz urunun fiyatini giriniz");
		double price = giris.nextInt();
		double totalPrice = quantity * price;
​
		System.out.println("Lutfen musteri kartiniz varsa E yoksa H giriniz");
		char card = giris.next().toLowerCase().charAt(0);	*/		
		
scan.close();
}}
