
public class javacourse_lesson3 {

	public static void main(String[] args) {
		// Switch - Case
		
		char grade='A';
		
		switch(grade) {
		
		case 'A':
			System.out.println("4.00"); break;
		case 'B':
			System.out.println("3.50"); break;
		case 'D':
		case 'F':
			System.out.println("0.00"); break;		
		default:
			System.out.println("Doğru Not Giriniz");
		}

	}

}
