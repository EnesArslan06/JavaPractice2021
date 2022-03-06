package JavaPracticeDay15_KitapYonetimi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


	/*
	1.	Kullan�c�n�n Kitap ekleme, silme ve listeleme gibi
		i�lemleri yapmas�na imkan tan�yan bir uygulama yaz�n�z.

	2.	Program, kitaplara 1001�den ba�layarak s�ral� ve otomatik numara vermeli.
		Bunun yan�nda, her bir kitap i�in Kitap Ad�, Yazar Ad�, Yay�n Y�l� ve Fiyat gibi bilgiler girilebilmelidir.

	3.	Program�n ba�lang�c�nda Kullan�c�ya a�a��daki gibi bir men� sunulmal�d�r.
		Kullan�c� program� bitirene kadar i�lemlere devam edebilmelidir.

		========= K�TAP PROGRAMI =============
			1: Kitap ekle
			2: Numara ile kitap sil
			3: T�m kitaplar� listele
			4: Bitir

 */

public class Kitapci {	
	
static List<Kitap> kitapListe=new ArrayList<>();	
static Scanner scan=new Scanner(System.in);
static int kitapNo=1000;


	public static void main(String[] args) {
	KitapMethod.kitaplarEkle(kitapListe);
	KitapMethod.menu(kitapListe);	//kitapmethodu clas�ndan menu(kitapliste) methodu calisti 


}

//	public static void menu(List<Kitap> liste) {//burasi sadece menuyu yazdiracak 
		
/*		System.out.println("========= K�TAP PROGRAMI =============\n1: Kitap ekle\n2:numara ile kitap sil\n3:"
				+ "Tum kitaplari listele\n4: Bitir");

		System.out.println("�sleminizi seciniz : ");//kullan�c�ya sorduk ne yapmak istedigini
		int tercih=scan.nextInt();
		
		switch (tercih) {
		case 1:
			kitapEkle(liste);//methoddaki parametre ile gelen kitap adi lesteye eklenecek
			break;
		case 2:
			noIlesil(liste);//method call yaptik
			break;
		case 3:	
			listele(liste);
			break;
		case 4:
			bitir();
			break;
		default:
			System.out.println("Gecerli tercih yapin");
			break;
		}
	}

	private static void listele(List<Kitap> liste) {//girdigimiz kitaplari listeleyecek
		for (Kitap k : liste) {//kitap class�ndan k isminde objelerimizi getiriyoruz listenin icinden 
			System.out.println(k.toString());//diger classda olusturdugumuz to string methodu bu listedekileri yazacak
			
			menu(liste);//listeledikten sonra tekrar ana menuye gidiyoruz.
			
		}
		
	}*/

/*	private static void noIlesil(List<Kitap> liste) {
		System.out.println("Silinecek kitap no giriniz: ");
		int silinecekNo=scan.nextInt();
		
		for (Kitap k : liste) {//degerlerini listeden al k lari getir
			if (k.getNo()==silinecekNo) {//k objesi uzerinden diger class daki methoda getNo methoduna
				liste.remove(k);
				menu(liste);//bu istenen kitabi sildikten sonra ne yapacagi ile ilgili cozum. tekrardan menu methoduna gidecek oradan devam edecdek
				//burada biz donduleri for while ile saglamadik metodlar araciligi ile sagladik.
			} 
			
		}
		System.out.println(silinecekNo+ " ait kitap bulunamadi");//if calismazsa bu yazacak ve tekrardan methoda donecek
		menu(liste);
		
	}*/

/*	private static void kitapEkle(List<Kitap> liste) {
		System.out.println("Kitap ismi giriniz : ");
		scan.nextLine();//dummy diye gecer iki tane arka arkaya nextLine oldugundan sikinti olur. oyuzden bos scan atiyoruz.
		String kitapAdi=scan.nextLine();
		//scan.nextLine();//dummy diye gecer iki tane arka arkaya nextLine oldugundan sikinti olur. oyuzden bos scan atiyoruz.
		System.out.println("Yazar ismini giriniz : ");
		String yazarAdi=scan.nextLine();
		System.out.println(" Yayin yili giriniz : ");
		int yayinYili=scan.nextInt();
		System.out.println("Kitap fiyatini giriniz : ");
		double fiyat=scan.nextDouble();
		
		Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,fiyat);//kitap clas�ndan obje create edildi. Bu parametrelerinden olacak
		liste.add(kitap);//kitabi olusturduk constroctur ile olusturduk ve burada liste ekliyoruz
		System.out.println(kitap.toString()+ " eklendi");//burada kitabi yazdirdik ancak kitapclasindakilere to string methodu uyguladik.
											//referanslari yazmasin ekledigi kitabi yazsin diye.
		menu(liste);//kitap ekledikten sonra tekrar ana menuye donme methodu uyguluyor.
	}

	private static void bitir() {
		System.out.println("Yine Bekleriz");*/
		
	
	
	
}	

