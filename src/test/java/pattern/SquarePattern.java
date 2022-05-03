package pattern;

public class SquarePattern {

	public static void main(String[] args) {

		int n=4;
		for (int rows = 0; rows <n; rows++) {
			for (int col = 0; col <n; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
