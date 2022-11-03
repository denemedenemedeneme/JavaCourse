
public class javacourse_lesson8 {

	public static void main(String[] args) {
		
		int number=0;
		boolean isPrime=true;
		

	
		for(int i=2; i<number;i++) {
			
			if(number == 1) {
				isPrime=true;
			}
			if(number%i == 0) {
				isPrime = false;
			}		
		}
		
		if(number < 0 || number == 0) {
			System.out.println("Sayı Sıfıra Eşit ya da Negatiftir");
			return;
		}
		
		System.out.println("Sayı: " + number + " Asallık: " + isPrime);
		
	}

	}


