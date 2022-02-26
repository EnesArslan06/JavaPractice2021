package JavaPracticeDay_05ForLoop;
	
			
	

	



//*******************************************************************************************
/*
A
A B
A B C
A B C D
A B C D E
A B C D E F
şeklini yazdırınız.  65=A'nın ascıı değeri
*/
/*public static void main(String[] args) {
int harf=65;
for (int baba = 0; baba < 6; baba++) {
  for (int evlat = 0; evlat <=baba; evlat++) {
	  System.out.print((char)(harf+evlat)+" ");
	
}
System.out.println();
}*/

/*System.out.println("lutfen bir palindrom bir kelime girin");
String kelime=scan.next();
String tersKelime="";

for (int i =kelime.length()-1; i>=0; i--) {//bu satırda kelimeyi ters cevirir
	tersKelime+=kelime.charAt(i); 
}
if (kelime.contains(tersKelime)) {//burada kelime ile ters kelimenin aynı olup olmadıgını kontrol ediyor 
	System.out.println("girilen kelime palinrom");
	
}else 
	System.out.println("kelime palindrom degil");


/*
         
          *
         * * 
        * * * 
       * * * * 
      * * * * * 
     * * * * * * 
      * * * * * 
       * * * * 
        * * * 
         * * 
          * 
    
   
        
        for (int satir = 6; satir >= 1 ; satir--) {
            
            for (int bosluk = 1 ; bosluk <= satir ; bosluk++) {
                System.out.print(" ");
            }
            
            for (int sutun = satir ; sutun <= 6 ; sutun++) {
                System.out.print("*"+" ");
                
            }
            System.out.println("");
            
        }
        for (int satir = 1; satir <= 6 ; satir++) {
            
            for (int bosluk = 0 ; bosluk <= satir ; bosluk++) {
                System.out.print(" ");
                
            }
            for (int sutun = 5; sutun >= satir; sutun--) {
                System.out.print("*"+" ");
                
                    }
            System.out.println("");
            
   /************************************************************************************************************



//*****************************************************************************************

/*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
        1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
Sesli harfler: a,e,i,o,u
Test Data:
a
Beklenen Çıktı:
a harfi sesli harfdir.
Test Data:
d
Beklenen Çıktı:
d harfi sesiz harftir.
Test Data:
we  yada %
Beklenen Çıktı:
Yanlis karakter girdiniz!
 */
/*public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("harf giriniz: ");
    String kelime = scan.next();

    String sesliHarf = "aeuoi";
    String sessizHarf = "bcdfghjklmnprstvyzxwq";

    if (kelime.length() == 1) {

        for (int i = 0; i <= sessizHarf.length(); i++) {
            if (sesliHarf.contains(kelime)) {
                System.out.println("sesli");
                break;
            } else if (sessizHarf.contains(kelime)) {
                System.out.println("sessiz");
                break;
            } else System.out.println("Yanlis karakter girdiniz!!!");
            break;
        }
    } else System.out.println("Yanlis karakter girdiniz!!!");*/


//*******************************************************************************************
/*
Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
ORNEK:
INPUT     : 6
OUTPUT : 1,2,3
              1+2+3 = 6 = 6 (Mükemmel)
              mukemmel sayi kontrolu
              1. kullanicidan sayi alalim
              2. bir toplam degiskeni olusturuyoruz
              3. sayinin bolenleri bul
              4. bolenleri toplamla topla
              5. sayiyla toplamin esitligini kontrol et*/

/*public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print("Lutfen bir sayi giriniz : ");
int sayi = scan.nextInt();

System.out.println(checkPerfectNumber(sayi));
boolean flag;
flag = checkPerfectNumber(sayi);
System.out.println(flag);

String result = checkPerfectNumber(sayi) ? "Sayi mukemmel sayidir"
        : "Sayi mukemmel sayi degildir";
System.out.println(result);
}

public static boolean checkPerfectNumber(int sayi) {
int toplam = 0;
boolean flag = false; // durum kontrolu (acik kapali gibi) "flag ismi bir onem arzetmiyor"
for (int i = 1; i < sayi; i++) {
    if (sayi % i == 0) {
        toplam = toplam + i; // toplam += i;
    }
}
if (toplam == sayi) {
    flag = true;
}

return flag;*/

//***************************************************************************


//****************************************************************************


//*********************************************************************************
/*  Problem Tanımı
Girilen bir sayı kadar satır ve sütünu olan ve
sağ kenara dayalı üçgeni basan kodu yazınız.
Ekran Çıktısı
Bir sayi giriniz: 5
    *
   **
  ***
 ****
*****
*/

/*public static void main(String[] args) {



Scanner scan = new Scanner(System.in);
System.out.print("pozitif bir tam sayı giriniz : ");
int sayi = scan.nextInt();

for (int satir = 1; satir <= sayi; satir++) {//satır kontrolu
    for (int bosluk = sayi - satir; bosluk >= 0; bosluk--) {//bosluk kontrolu
        System.out.print(" ");
    }
    for (int yildiz = 1; yildiz <= satir; yildiz++) {//yıldız kontrolu
        System.out.print("*");

    }
    System.out.println();
}*///***********************************************************************************
 /*
            *
            * *
            * * *
            * * * *
            * * * * *
            şeklini yazdırınız
     */

/*for (int satir = 1; satir <= sayi; satir++) {//satır kontrolu

    for (int yildiz = 1; yildiz <= satir; yildiz++) {//yıldız kontrolu
        System.out.print("*");

    }
    System.out.println();
}
}
}*/
//******************************************************************************
/*
A
A B
A B C
A B C D
A B C D E
A B C D E F
şeklini yazdırınız.  65=A'nın ascıı değeri
*/
/*public static void main(String[] args) {
int harf=65;
for (int satir = 0; satir <6 ; satir++) { //satır kontrolu

    for (int sutun = 0; sutun <= satir; sutun++) {// sutun kontrolu
        System.out.print((char) (harf+sutun)+" ");
    }
    System.out.println();*/

//***************************************************
//1 2 3 4 5 6
//2 3 4 5 6
//3 4 5 6
//4 5 6
// 5 6
//  6

/*for (int satir = 1; satir <= 6; satir++) {//satır kontrolü

 for (int bosluk = 1; bosluk < satir; bosluk++) {// boşluk yazdırma

     System.out.print(" ");
 }
 for (int rakam = satir; rakam <= 6; rakam++) {//sutun kontrolu

    System.out.print(rakam + " ");// rakam+ " " olazsa sağa dayalı olur düzgün üçgen olmaz
 }
 System.out.println();
}
}
}*/

//*******************************************************************************************

//1
//2 3
//4 5 6
//7 8 9 10
//11 12 13 14 15
//16 17 18 19 20 21
//22 23 24 25 26 27 28
//29 30 31 32 33 34 35 36

/*int a =1;
for (int baba = 1; baba <=8; baba++) {//satır kontrolu
  for (int ogul = 1; ogul <=baba; ogul++) { //sutun kontrolu
      System.out.print(a++ +" ");
  }System.out.println();
}
}
}*/
//************************************************************************

/*
Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
       Sonuç böyle olmalıdır;
              *
             * *
            * * *
           * * * *
          * * * * *
*/

/*public static void main(String[] args) {


   for ( int satir = 1; satir < 6; satir++) {//satır kontrolu

       for (int bosluk = 5- satir; bosluk > 1; bosluk--) {//bosluklari 4,3,2,1 tane yazdırmalıyım
           System.out.print(" ");
       }

       for (int yildiz =  1; yildiz <=satir; yildiz++) {//yıldız kontrolu
           System.out.print("* ");//"*" yapılırsa sağa dayalı üçgen olur
       }

       System.out.println();
   }
}
}*/

//************************************************************************************************
//Eğer bir döngünün gövdesinde diğer bir döngü bulunuyorsa,
//Bu tür döngüler iç-içe döngüler olarak bilinir
//içteki döngü dıştaki döngünün her adımında yeniden çalıştırılacaktır
//İç içe döngülerde en içteki döngü en önce tamamlanır.


/*for (int i = 1; i <=10 ; i++) {

   System.out.println("dis dongu i = "+ i);

   for (int j = 0; j < 5 ; j++) {

       System.out.println("ic dongu i ="+ i + " j = "+ j);


   }

   System.out.println();
}


int deger = 0;

for (int i = 1; i <=10 ; i++) {

   for (int j = 1; j <=5; j++) {

       deger+=1;
   }
}
System.out.println("deger = " + deger);


deger=0;

for (int i = 1; i <=10 ; i++) {                 // i    j   deger
                                               // 1    1     1
   for (int j = 1; j <= i ; j++) {             // 2    1     2
       deger+=1;                               // 2    2     3
   }                                           // 3    1     4
}                                               // 3    2     5
System.out.println("deger = " + deger);         // 3    3     6

// 1+2+3+4+.....+10 =55


}


}*/
//****************************************************************************************

