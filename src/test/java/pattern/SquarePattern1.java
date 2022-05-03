package pattern;

public class SquarePattern1 {

	public static void main(String[] args) {

		int count=1;
		int n=5;
		int temp=2;
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;col<=n;col++)
			{
				System.out.print(count+++" ");
			}
			if(rows<=n/2)
			{
				count=count+n;
			}else {
				count=count-(n*temp++);
			}
			System.out.println();		
		}
	}

}
