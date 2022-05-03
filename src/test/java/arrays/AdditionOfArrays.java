package arrays;

public class AdditionOfArrays {

	public static void main(String[] args) {

		int []a= {1,2,3};
		int []b= {9,9,9};
		int remainder=0;
		int quotient=0;
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				sum=a[i]+b[j];	
			}
			int number1 = sum/10;
			int number2=sum-10;
			System.out.print(number1+" "+number2);
			System.out.print(" ");
		}

	}
}


