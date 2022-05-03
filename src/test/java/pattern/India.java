package pattern;

public class India {

	public static void main(String[] args) {

		String s="India";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
			}
}
