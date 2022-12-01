package arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {

		int []ar= {14,18,25,32};
		for (int i = 0; i < ar.length-1; i++) {
			for (int temp = ar[i]+1; temp < ar[i+1]; temp++) {
				System.out.println(temp);
			}
		}
	}

}
