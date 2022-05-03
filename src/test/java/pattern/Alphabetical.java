package pattern;

public class Alphabetical {

	public static void main(String[] args) {
		int n=5;
		char count='a';
		for (int rows = 0; rows <n; rows++) {
			for (int col = 1; col <=n; col++) {
				System.out.print(count);//for incremental count++
			}
			count++;
			System.out.println();
		}
	}
}
