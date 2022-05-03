package string;

import java.util.HashSet;

public class OccurencesWithSpecialCharacters {

	public static void main(String[] args) {

		char[]ch= {'@','!','#','$','@','#'};
		
		HashSet<Character> hs = new HashSet<Character>();
		for(int i=0;i<ch.length;i++)
		{
			hs.add(ch[i]);
		}
		for(Character c:hs)
		{
			int count=0;
			for(int i=0;i<ch.length;i++)
			{
				if(c.equals(ch[i]))
				{
					count++;
				}
			}
			System.out.println(c+" "+count);
		}
	}

}
