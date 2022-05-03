package arrays;

public class BubblesortwithMinimum {

	public static void main(String[] args) {
		int [] a= {4,5,2,3};
		int fmin=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<fmin) {
				fmin=a[i];
			}
		}
		System.out.println(fmin);
	}
	}


