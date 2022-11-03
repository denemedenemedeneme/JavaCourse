
public class javacourse_lesson2 {

	public static void main(String[] args) {
		//ReCap Demo 1 - En Büyük Sayı Hangisi
		
		int sayi1=50;
		int sayi2=20;
		int sayi3=35;
		int enBuyuk = sayi1;
		
		if(enBuyuk < sayi2) {
			enBuyuk=sayi2;
		}
		if(enBuyuk<sayi3) {
			enBuyuk=sayi3;
		}
		
		System.out.println("En Büyük Sayı:" + enBuyuk);
	}

}
