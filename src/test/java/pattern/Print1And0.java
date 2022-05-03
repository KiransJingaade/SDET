package pattern;

public class Print1And0 {

	public static void main(String[] args) {

		int n=4;
		
		for(int rows=1;rows<=n;rows++)
		{
			for(int col=1;rows>=col;col++)
			{
				if((rows+col)%2==0)
				{
					System.out.print("1"+" ");
				}else {
					System.out.print("0"+" ");
				}
			}
			System.out.println();
		}
	}

}
