package string;

import java.util.HashSet;

public class SentencesOccurencesUnique {

	public static void main(String[] args) {

		String s="khatam ta ta bye bye";
		String[] str=s.split(" ");

     HashSet<String> hs = new HashSet<String>();

		for(int i=0;i<str.length;i++)
		{
			hs.add(str[i]);
		}
		for(String ch:hs)
		{
			int count=0;
			for(int i=0;i<str.length;i++)
			{
				if(ch.equals(str[i]))
				{
					count++;
				}
			}
			if(count<=1)
			{
				System.out.println(ch+" "+count);
			}	
		}
	}
}