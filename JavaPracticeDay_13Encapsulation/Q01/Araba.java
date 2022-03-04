package JavaPracticeDay_14Encapsulation.Q01;

public class Araba {

	private String model;
	private String renk;
	private int motor;
	private int yil;
	
	public Araba() {//parametresiz constroctur
		
	}
	
	public Araba(String model, String renk, int motor, int yil) {
		this.model = model;
		this.renk = renk;
		//this.motor = motor;
		//this.yil = yil;
		setYil(yil);//burada bunlari this yaparsak methoda gitmeden yukaridan direk variableyi alýr
		setMotor(motor);
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		if (motor>=100) {
			this.motor=motor;
			System.out.println("Agam tekerine tas degmesin");
		}
		else {
			System.out.println("Agam eglenir 100 un altýnda motor gucu olmaz :)");
		}
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {//mesela kullanici eksi girdi
		if (yil<0) {//yili eksi girerse bu uygulanacak
			System.out.println("Negatif yil giremezsiniz");
			this.yil = (-1)*yil;
			
		} else {
			
		this.yil = yil;
		}
		
	}
	
	
	
}
