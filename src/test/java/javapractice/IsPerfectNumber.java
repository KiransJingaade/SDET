package javapractice;

public class IsPerfectNumber {

	static boolean isPerfect(int num)
	{
		int sum=0;
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
			sum=sum+i;
		}
		}
		System.out.println(num);
		System.out.println(sum);
		return sum==num;
	}
	public static void main(String[] args) {

		int num=6;
		boolean answer=isPerfect(num);
		if(answer)
		{
			System.out.println("it is perfect number");
		}
		else
		{
			System.out.println("it is not perfect number");
		}
	}
}
