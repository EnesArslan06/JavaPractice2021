package JavaPracticeDay_14Encapsulation.Q01;

public class ArabaMain {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

@SuppressWarnings("unused")
Araba honda=new Araba();//parametresiz constroctur ile obje olusturduk

//honda.setMotor(1300);;
//honda.setModel("civic");
//honda.setYil(2021);

//honda.getModel();
//System.out.println(honda.getYil());
	
Araba volvo=new Araba("XC90","Beyaz",95,2020)	;//parametreli constrocturdan obje olusturduk

Araba ww=new Araba("Passat","Kirmizi",100, -2021);//parametreli constrocturdan obje olusturduk


System.out.println("sectiginiz arac volvo: "+  "yili: "+volvo.getYil()+" rengi: "+volvo.getRenk()+" motoru: "+volvo.getMotor());

//System.out.println("sectiginiz arac ww: "+ "yili: "+ww.getYil()+" rengi: "+ww.getRenk()+" motoru: "+ww.getMotor());
	}

}
