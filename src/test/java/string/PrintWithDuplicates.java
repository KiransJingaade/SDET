package string;

import java.util.LinkedHashSet;

public class PrintWithDuplicates {

	public static void main(String[] args) {

		String[] str={"hi","hello","india"};
		
		for(int i=0;i<str.length;i++)
		{
			String s=str[i];
			int count=0;
			LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
			for(int j=0;j<s.length();j++)
			{
				hs.add(s.charAt(j));
			}
	
			for(Character character:hs)
			{
				if(character=='a' || character=='e' || character=='i' || character=='o' || character=='u')
				{
					count++;
				}
			}
			System.out.println(s+" "+count);
		}
	}

}
