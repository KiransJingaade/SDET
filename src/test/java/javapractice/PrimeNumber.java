package javapractice;

public class PrimeNumber {

	public static void main(String[] args) {

		int num=3;
		boolean isprime=true;
		for (int i = 2; i < num; i++) {
			
			if(num%i==0)
			{
				isprime=false;
				break;
			}
		}
		if(isprime==true)
		{
			System.out.println(num+" is a prime number");
		}else {
			System.out.println(num+" is not prime number");
		}
	}

}
