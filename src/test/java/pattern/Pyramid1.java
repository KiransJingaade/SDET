package pattern;

public class Pyramid1 {

	public static void main(String[] args) {

		int n=3;
		for(int rows=1;rows<=n;rows++)
		{
			for(int spaces=1;spaces<=n-rows;spaces++)
			{
				System.out.print("  ");
			}
				for(int star=1;2*rows>star;star++)
				{
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}


