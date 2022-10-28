
public class javacourse_lesson6 {

	public static void main(String[] args) {
		// RECAP 2 
		
		double[] myList= {1.2,1.3,4.3,5.6};
		double total=0;
		double max = myList[0];
		
		for(double number:myList) {
			if(max>number) {
				max=number;
			}
			total=total+number;
		}
		
		System.out.println("Total:"+total);
		System.out.println("Big:"+max);
		
		
		
		//Cok Boyutlu Dizi
		
		String [][] sehirler = new String[2][2];
		sehirler[0][0] ="ist";
		sehirler[1][0] ="ista";
		sehirler[0][1] ="ist";
		sehirler[1][1] ="ista";
		
		for (int i=0;i<=1;i++) {
			for(int j=0;j<=1;j++) {
				System.out.println(sehirler[i][j]);
			}
			
		}
		
	}

}
