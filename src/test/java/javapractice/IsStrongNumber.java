package javapractice;

public class IsStrongNumber {

	static int isFact(int num)//5,4
	{
		int fact=1;
		for (int i = 2; i <=num; i++) {
			fact=fact*i;//1*2,2*3,4*6,5*24=120,
		}              //1*2,2*3,4*6=24
		               //
		return fact;
	}
	static boolean isStrong(int num)
	{
		int out=0;
		int temp=num;
		while(num!=0)
		{
			int last=num%10;
			out=out+isFact(last);//120,24,1=145
			num=num/10;//14
		}
		return out==temp;
	}
	public static void main(String[] args) {

		int num=145;
		boolean answer=isStrong(num);
		if(answer)
		{
			System.out.println("it is strong no");
		}else {
			System.out.println("it is not strong no");
		}
	}
}
