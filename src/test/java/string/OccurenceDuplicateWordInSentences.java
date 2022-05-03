package string;

import java.util.HashSet;

public class OccurenceDuplicateWordInSentences {

	public static void main(String[] args) {

		String s="khatham ta ta bye bye";
		String[] str = s.split(" ");
	
		HashSet<String> hs = new HashSet<String>();
		for(int i=0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		for(String s1:hs)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(s1.equals(str[i]))
				{
					count++;				
				}
			}
			if(count>1)
			{
				System.out.println(s1+" "+count);

			}
		}
	}

}
