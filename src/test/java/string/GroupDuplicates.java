package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class GroupDuplicates {

	public static void main(String[] args) {
		String s="acdabcdaabdc";
		HashSet<Character> hs = new HashSet<Character>();
		
		for(int i=0;i<s.length();i++)
		{
			hs.add(s.charAt(i));
		}
		for(Character ch:hs)
		{
			int count=0;
			for (int i = 0; i <s.length(); i++) {
				if(ch.equals(s.charAt(i)))
				{
					System.out.print(ch);
				}
			}
			System.out.println(" ");
		}
	}

}
