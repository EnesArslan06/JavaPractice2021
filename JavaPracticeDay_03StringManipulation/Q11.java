package JavaPracticeDay_03StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 

        String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // 1.yol
        System.out.println("istenilen str= " + pickName.charAt(0) + " "
                + pickName.substring(11,12) + " " + pickName.toLowerCase().substring(8,9));

        // 2 .yol

        int A=pickName.indexOf("A");
        int L=pickName.indexOf("L");
        int I=pickName.indexOf("I");
        char A1=pickName.charAt(A);
        char L1=pickName.charAt(L);
        char I1=pickName.toLowerCase().charAt(I);
        System.out.println(A1+" "+L1+ " "+I1);
        System.out.println(""+A1+L1+I1);*/
    
    String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";  //Ali yazdıracaz, a yı bul l yi bul i yi bul ali yazdır.
    char A=str.charAt(str.indexOf("A"));			//toLowerCase yapmamız lazım
    char L=str.charAt(str.indexOf("L"));
    char I=str.charAt(str.indexOf("I"));  //str ye git char I için I nın indexine git
    
    System.out.println("ALI :" +A+" "+L+" "+I);
    
    }

}
