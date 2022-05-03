package pattern;

public class RightTriangle {

	public static void main(String[] args) {

		int n=4;
		for(int rows=1;rows<=n;rows++)
		{
			int count=rows;
			int temp=n-1;
			for(int col=1;rows>=col;col++)
			{
				System.out.print(count+" ");
				count=count+temp--;
			}
			System.out.println();
		}
		
	}

}
