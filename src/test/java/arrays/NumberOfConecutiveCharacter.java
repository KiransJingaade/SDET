package arrays;

public class NumberOfConecutiveCharacter {

	public static void main(String[] args) {

		String s="aassdddcx";
		System.out.println(s);
		
		for(int i=0;i<s.length();i++)
		{
			int count=1;
			for(int j=i+1;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					count++;
					i++;
				}
				else
				{
					break;
				}
			}
			System.out.print(s.charAt(i)+""+count);
		}
	}

}
