package javapractice;

public class IsFibonacci {

	static void isFibo(int count)
	{
		int num1=0;
		int num2=1;
		for (int i = 2; i < count; i++) {
			int num3=num1+num2;
			System.out.println(num1);
			num1=num2;
			num2=num3;
		}
	}
	public static void main(String[] args) {

		isFibo(10);
	}

}
