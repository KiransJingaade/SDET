package arrays;

public class Digits1 {

	public static void main(String[] args) {

		int n=568;
		int remainder=0;
		
		while(n>9)
		{
			int sum=0;
			while(n>0)
			{
				remainder=n%10;
				sum=sum+remainder;
				n=n/10;
			}
			n=sum;
		}
		System.out.println(n);
	}

}
