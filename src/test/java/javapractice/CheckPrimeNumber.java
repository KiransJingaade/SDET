package javapractice;

public class CheckPrimeNumber {

	static boolean isPrime(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {

		int num=12;
		boolean answer=isPrime(num);
		if(answer)
		{
			System.out.println("it is prime no");
		}else
		{
			System.out.println("it is not prime no");
		}
	}
}
