package pattern;

public class Pattern1 {

	public static void main(String[] args) {

		int n=5;
		for (int i = 1; i <=n; i++) {
			int count=1;

			for (int j = 1; i>=j; j++) {
				System.out.print(count+++" ");
			}
			System.out.println();

		}
	}

}
