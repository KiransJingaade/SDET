package javapractice;

public class IsArmstrongNumber {

	static int countOfDigits(int num)
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		}
		return count;
	}
	static int power(int last,int pwr, int num)
	{
		int out=1;
		for (int i = 0; i < pwr; i++) {
			out=out*num;
		}
		return out;
	}
	static boolean isArmstrong(int num)
	{
		int pwr=countOfDigits(num);
		int res=0;
		int temp=num;
		while(num!=0)
		{
			int last=num%10;
			res=res+power(last,pwr, last);
			num=num/10;
		}
		return temp==res;
	}
	
	public static void main(String[] args) {

		int num=1634;
		boolean answer=isArmstrong(num);
		if(answer)
		{
			System.out.println("it is armstrong no");
		}else {
			System.out.println("it is not armstrong no");
		}
	}

}
