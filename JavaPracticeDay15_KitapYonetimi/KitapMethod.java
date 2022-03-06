package JavaPracticeDay15_KitapYonetimi;

import java.util.List;
import java.util.Scanner;

public class KitapMethod {
	
	static Scanner scan=new Scanner(System.in);
	static int kitapNo=1000;
	
public static void menu(List<Kitap> liste) {//burasi sadece menuyu yazdiracak 
		
		System.out.println("========= KÝTAP PROGRAMI =============\n1: Kitap ekle\n2:numara ile kitap sil\n3:"
				+ "Tum kitaplari listele\n4: Bitir");

		System.out.println("Ýsleminizi seciniz : ");//kullanýcýya sorduk ne yapmak istedigini
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

	public static void listele(List<Kitap> liste) {//girdigimiz kitaplari listeleyecek
		for (Kitap k : liste) {//kitap classýndan k isminde objelerimizi getiriyoruz listenin icinden 
			System.out.println(k.toString());//diger classda olusturdugumuz to string methodu bu listedekileri yazacak
			
			menu(liste);//listeledikten sonra tekrar ana menuye gidiyoruz.
			
		}
		
	}

	public static void noIlesil(List<Kitap> liste) {
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
		
	}

	public static void kitapEkle(List<Kitap> liste) {
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
		
		Kitap kitap=new Kitap(++kitapNo,kitapAdi,yazarAdi,yayinYili,fiyat);//kitap clasýndan obje create edildi. Bu parametrelerinden olacak
		liste.add(kitap);//kitabi olusturduk constroctur ile olusturduk ve burada liste ekliyoruz
		System.out.println(kitap.toString()+ " eklendi");//burada kitabi yazdirdik ancak kitapclasindakilere to string methodu uyguladik.
											//referanslari yazmasin ekledigi kitabi yazsin diye.
		menu(liste);//kitap ekledikten sonra tekrar ana menuye donme methodu uyguluyor.
	}

	public static void bitir() {
		System.out.println("Yine Bekleriz");
		
	}
	
	public static void kitaplarEkle(List<Kitap>liste) {
		Kitap kitap1=new Kitap(++kitapNo, "sefiller", "victor Hugo", 1890, 100);
		Kitap kitap2=new Kitap(++kitapNo, "serend", "zulfu", 2010, 60);
		Kitap kitap3=new Kitap(++kitapNo, "insan ne ile yasar", "tolstoy", 1900, 8);
		Kitap kitap4=new Kitap(++kitapNo, "korler", "isa muncur", 2005, 20);
		Kitap kitap5=new Kitap(++kitapNo ,"1984", "george orewall", 1945, 22);
		
		liste.add(kitap1);
		liste.add(kitap2);
		liste.add(kitap3);
		liste.add(kitap4);
		liste.add(kitap5);
	}
	
}
