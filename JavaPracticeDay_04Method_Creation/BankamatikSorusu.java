package JavaPracticeDay_04Method_Creation;

import java.util.Scanner;

public class BankamatikSorusu {

	public static void main(String[] args) {
		// i�lem sec
		//1-Bakiye  2-Para cekme 3 -para yat�r 4-C�k�s
		
	Scanner scan=new Scanner(System.in);	
	System.out.println("***ATM'ye hosgeldiniz***");
	//yapmak istedigi islemi sectirirz onun icin variable olustururuz.
	String islem="\n1.islem : Bakiye \n2.islem : Para Yatirma\n3.islem : Para Cekme\n4.islem : Cikis ";
	//kullan�c�ya secmesi icin 1,2,3,4 seceneklerini olusturuyoruz
	System.out.print("Yapacag�n�z i�lemi secin: " +islem);
	
	int bakiye=5000; //bu degeri kendimiz belirledik.bir baslang�c bakiyesi
	
	String secilenIslem=scan.nextLine(); //kullan�c�n�n deger girecegi bolum icin olusturduk
	
	switch (secilenIslem) {//secilen ifade String int degil
		case "1":							
			System.out.println("Bakiyeniz:" + bakiye);
		break;
		case "2":							
		System.out.print("Cekeceginiz miktar� giriniz");
		int cekilecekMiktar=scan.nextInt(); //cekilecek miktar� kullan�c�dan almam�z laz�m.
		if (cekilecekMiktar<=bakiye) {
			bakiye-=cekilecekMiktar;
			System.out.println("Yeni bakiyeniz: " + bakiye);}
		else {System.out.println("Bakiyeniz Yetersiz");}
		
		break;
		case "3":							
			System.out.println("Yatirilacak miktari giriniz: ");
			int yatirilacakMiktar=scan.nextInt();
			bakiye+=yatirilacakMiktar;
			System.out.println("Yeni Hesap Bakiyeniz: "+ bakiye);
		break;
		case "4":							
				System.out.println("C�k�s isleminiz basari ile yap�ld�");
		break;
		default:System.out.println("Gecersiz islem yapt�n�z");
		break;
	}
scan.close();
}}
