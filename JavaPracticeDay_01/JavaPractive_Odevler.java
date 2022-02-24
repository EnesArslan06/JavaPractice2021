package JavaPracticeDay_01;

import java.util.Scanner;

public class JavaPractive_Odevler {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);	
		 /*
		  Primitive data type	
		  byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiriniz.*/

/*System.out.println(Byte.MAX_VALUE);	127
System.out.println(Byte.MIN_VALUE);-128
System.out.println(Short.MIN_VALUE);-32768
System.out.println(Short.MAX_VALUE); 32767
System.out.println(Integer.MIN_VALUE);-2147483648
System.out.println(Integer.MAX_VALUE);	//2147483647	
System.out.println(Long.MIN_VALUE); -9223372036854775808
System.out.println(Long.MAX_VALUE); 9223372036854775807
System.out.println(Double.MIN_VALUE); 4.9E-324
System.out.println(Double.MAX_VALUE);1.7976931348623157E308
System.out.println(Float.MIN_VALUE);1.4E-45
System.out.println(Float.MAX_VALUE);3.4028235E38  */

		 

		 /*Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * Ornek : Inputs : 853 3276732767
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8	 */
		
/*System.out.println("Lutfen uc basamakli bir sayi giriniz:");
int sayi=scan.nextInt();
int birler=sayi%10;
int onlar=(sayi/10)%10;
int yuzler=(sayi/100)%10;
System.out.println("Birler basamagi:" + birler + 
"\n" + "Onlar basamagi:" + onlar + "\n" + "Yuzler basamagi:" + yuzler);*/
	
	
		/*
		 *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 
		 *  ve son iki basamagindaki rakamlari toplamini bulunuz.		  
		 *   Ex :
		 *   input  : 12345
		 *   output : 12    */		
	
/*System.out.println("Lutfen 5 basamakli bir sayi giriniz:");
int sayi=scan.nextInt();
int birler=sayi%10;
int onlar=(sayi/10)%10;	
int yuzler=(sayi/100)%10;
int binler=(sayi/1000)%10;
int onbinler=(sayi/10000)%10;
System.out.println("�lk iki ve son iki basamagindaki rakamlarin toplami:"+ (birler+onlar+binler+onbinler));*/
	
		/*  Problem Tan�m�
        Bir dik ��genin iki dik kenar�n� alarak hipoten�s�n� hesaplayan kod yaz�n�z.
        �rnek Ekran ��kt�s�
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
		
/*System.out.print("ucgenin 1. kenar uzunlugunu giriniz : ");
double kenar1 = scan.nextDouble();	
System.out.print("ucgenin 1. kenar uzunlugunu giriniz : ");
double kenar2 = scan.nextDouble();
double h2=Math.sqrt(kenar1*kenar1 + kenar2*kenar2);
System.out.println("Ucgenin hipotenus uzunlugu : " + h2);*/
	

		/*  Problem Tan�m�
        Mesafeyi ve h�z� al�p s�reyi hesaplayan bir kod yaz�n�z.
        �rne�in:�stanbul ile Ankara aras� 400km olarak �l��lmektedir. Bu yolu ortalama
        120 km/saat h�zla giden bir ara� ne kadar s�rede hedefe var�r?
        �rnek Ekran ��kt�s�
        Mesafeyi giriniz: 400
        H�z� giriniz: 100
        S�re 4 saattir.
		 */
/*System.out.print("Lutfen Gidilecek mesafeyi belirtiniz:");
double mesafe=scan.nextDouble();
System.out.print("Lutfen hizi belirtiniz:");
int hiz=scan.nextInt();
double sure=(mesafe/hiz);
System.out.print("Gidilecek Sure:" + sure);*/
	
	
		
		 /*	Kullanicidan kilosunu ve boyunu alip
		 Vucut kitle indeksini hesaplayan bir program yaziniz.
		 Ipucu : Vucut 
		 Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
		 ORNEK:
		 INPUT      : Kilo: 71
		                   Boy: 1,72
		 OUTPUT  : Vucut Kitle Indeksiniz : 23 */
		 	 

/*System.out.print("Kilonuz:");
double kilo=scan.nextDouble();
System.out.print("Boyunuz");
double boy=scan.nextDouble();
double vki=kilo/(boy*boy);
System.out.print("Vucut Kitle Endeksi:" + vki);*/
	
	
    	 /* Kullanicidan alacaginiz vize1, vize2 ve final notlarini 
    	 vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz*/
    	 
System.out.println("Vize1 notunuzu giriniz:");	
double vize1=scan.nextDouble();
System.out.println("Vize2 notunuzu giriniz:");
double vize2=scan.nextDouble();
System.out.println("Final notunuzu giriniz:");		
double finals=scan.nextDouble();
double ortalama=((vize1 + vize2) / 2) * 30 / 100 + finals * 70 / 100;
System.out.println("Ortalama notunuz:" + ortalama);

if (ortalama>=50) {System.out.println("Gectiniz");}
if (ortalama<50) { System.out.println("Kald�n�z");}			
	


			/*  Problem Tan�m�
	        Kullan�c�dan a,b ve c say�lar�n� okuyarak a�a��daki i�lemi yapan kodu yaz�n�z
	        a'n�n karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
	        �rnek Ekran ��kt�s�
	        a say�s�n� giriniz: 5
	        b say�s�n� giriniz: 3
	        c say�s�n� giriniz: 1
	        sonu� : 5.333333333333333					*/

/*System.out.println("Lutfen bir sayi giriniz:");
int sayia=scan.nextInt();
System.out.println("Lutfen 2.sayiyi giriniz:");
int sayib=scan.nextInt();
System.out.println("Lutfen 3.sayiyi giriniz:");
int sayic=scan.nextInt();
double sonuc=((Math.pow(sayia,2))-(Math.pow(sayib,2)))/(3*sayic);
System.out.println(sonuc);	  */       
		
		
	
			/* Write a Java program to convert temperature from Fahrenheit to Celsius degree.
			formula;c = (f-32)*5/9       */ 

/*System.out.println("Bir farenheit derecesi belirtin:");
double f=scan.nextDouble();
double c=(f-32)*5/9;
System.out.println("Celsius Derecesi:" + c);  */
	
	
			/*
	        TechProEd spor salonu i�in kullan�c�dan isim soyisim, ya�, kilo, boy, 
	        salona devam edece�i ay s�resini bilgilerini al�p ayl�k $20 olarak toplam �cretini yazd�r�n�z.*/
    
/*System.out.print("�sim ve Soyisim:");
String isim=scan.nextLine();
System.out.print("Yas:");
byte yas=scan.nextByte();
System.out.print("Kilo:");
double kilo=scan.nextDouble();
System.out.print("Boy:");
double boy=scan.nextDouble();
System.out.print("Salona devam edecegi sure(ay):");
int ay=scan.nextInt();
int ucret=20*ay;
System.out.println("Ad�n�z:" + isim + "\n" + "Yas�n�z:" + yas + "\n" + "Kilonuz:" + kilo + "\n"
+ "Boyunuz:" + boy + "\n" + "Sureniz(ay):" + ay + "\n" + "\n" + "\t" 
+ "Odeyeceginiz Toplam Ucret:" + ucret + "dolardir.");*/
	
			/*  Problem Tan�m�
	        Bir i��inin i�i bitirme s�resini ve toplam i��i say�s�n� alarak, i�in bitme s�resini
	        hesaplayan kodu yaz�n�z.
	        �rne�in, Bir i��i bir i�i 10 g�nde yapabilmektedir.
	        Buna g�re 2 i��i ayn� i�i ka� g�nde yapar?
	        �rnek Ekran ��kt�s�
	        Bir i��i i�i ka� g�nde bitirmektedir? 10
	        Toplam ka� i��i �al��acak? 2
	        ��in bitme s�resi 5 g�nd�r.*/
	
/*System.out.println("Bir iscinin isi bitirme s�resi:");
double gun=scan.nextDouble();
System.out.println("Toplam isci say�s�:");
int iscisayisi=scan.nextInt();				
double bitmesuresi=gun/iscisayisi;
System.out.println("isin bitme suresi:" + bitmesuresi +" gundur..."); */
		 
scan.close();

	}

}
