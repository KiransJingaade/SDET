package arrays;

public class NumberIsPresentInArray {

	public static void main(String[] args) {

		int[]ar= {14,52,35,78,25};
		int num=59;
		int count=0;
		for (int i = 0; i < ar.length; i++) {
			if(num==ar[i])
			{
				count=1;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("number is present in array");
		}else {
			System.out.println("number is not present in array");
		}
	}

}
