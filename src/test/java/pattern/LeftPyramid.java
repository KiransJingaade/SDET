package pattern;

public class LeftPyramid {

	public static void main(String[] args) {

		int n=3;
		for(int rows=1;rows<n;rows++)
		{
			for(int col=1;col<=n;col++)
			{
				if(rows+col>=n+1)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;col<=n;col++)
			{
				if(rows<=col)
				{
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
	}

}
