package javapractice;

public class Print1To100PrimeNumbers {

	static boolean isPrime(int num)
	{
		for(int i=2;i<num/2;i++)
		{
		if(num%i==0)
		{
			return false;
		}
		}
		return true;
	}
	public static void main(String[] args) {

		for (int num=1; num<=100; num++) {
			boolean answer=isPrime(num);
			if(answer)
			{
				System.out.println(num);
			}
		}
	}

}
