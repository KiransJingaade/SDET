package pattern;

public class Alphabeticalpyramid {

	public static void main(String[] args) {
		int n=5;
		for (int rows = 1; rows<=n; rows++) {
			char ch='a';

			for (int col = rows;col<=n; col++) {
      
				System.out.print(" ");
			} 
			for (int col=1; col<=rows; col++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println( );
		}
	}

}
