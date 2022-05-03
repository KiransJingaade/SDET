package pattern;

public class SquarePattern2 {

	public static void main(String[] args) {

		int n=5;
		int temp=2;
		int count=1;
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
