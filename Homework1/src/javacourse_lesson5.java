
public class javacourse_lesson5 {
	public static void main(String[] args) {
		String[] ogrenciler = new String[3];
		ogrenciler[0]="ali";
		ogrenciler[1]="veli";
		ogrenciler[2]="deli";
		
		for (int i=0; i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
