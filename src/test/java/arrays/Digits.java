package arrays;

public class Digits {

	public static void main(String[] args) {
		int n=56;
		int remainder=0;

		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				 remainder=n%10;//6
				sum=sum+remainder;//0+6=6
				n=n/10;//5
			}
			n=sum;
		}
		System.out.println(n);

	}
}
