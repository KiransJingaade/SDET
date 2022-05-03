package pattern;

public class LeftAngledTrianglePattern {

	public static void main(String[] args) {

		int n=5;
		for (int rows = 1; rows<=n; rows++) {
			for (int col = rows;col<=n; col++) {
					System.out.print(" ");
				} 
			for (int col = 1; col <=rows; col++) {
				System.out.print("* ");
			}
			System.out.println();
			}
		}
	}
	


