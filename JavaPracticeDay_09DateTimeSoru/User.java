package JavaPracticeDay_09DateTimeSoru;

import java.security.PublicKey;
import java.time.LocalDateTime;

import javax.imageio.spi.RegisterableService;

public class User {

	
	String name;
	LocalDateTime registerDate;//bunlar intence variableler diger classlardan obje le ulasaabiliriz
	
	 public User() {
		//bos constroctur
	
	}	
	
	
	public User(String name, LocalDateTime registerDate) {
		this.name=name;
		this.registerDate=registerDate;
		//parametreli constructor
	}	
	
		
		
		

}
