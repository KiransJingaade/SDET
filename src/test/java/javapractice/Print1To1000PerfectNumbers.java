package javapractice;

public class Print1To1000PerfectNumbers {

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
		return sum==num;
	}
	public static void main(String[] args) {

		for(int num=1;num<=1000;num++)
		{
			boolean answer=isPerfect(num);
			if(answer)
			{
				System.out.println(num);
			}
		}
	}

}
