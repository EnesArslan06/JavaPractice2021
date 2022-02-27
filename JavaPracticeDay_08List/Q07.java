package JavaPracticeDay_08List;

public class Q07 {

	public static void main(String[] args) {
		/*
		ayna check sorusu:
		 input : int arr1[] = { 1, 2, 3, 4, 4, 3, 2, 1 };
		 output : verilen array simetriktir
		 */
		int array[] = { 1, 2, 3 , 4, 4, 3, 2, 1 };

	boolean simetrik=false;
		
		for (int i = 0; i < array.length/2; i++) {
			if (array[i]==array[array.length-1-i]) {//-i yazmaliyiz cunku bastan i kadar git sondanda i kadar sil
				simetrik=true;
			} else {simetrik=false;
			break;//break koymazsak en son degere bakar en son esitse true verir
				//bir tane else durumu olumlu olursa break ile donguyu kýracaz ve false dondurecez
			}
			
			
			
		}
System.out.println(simetrik);
}
}