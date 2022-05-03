package string;

import java.util.LinkedHashSet;

public class PrintUniqueVowelscountWithoutduplicates {

	public static void main(String[] args) {

		String s="india";
		int count=0;

		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		for(int j=0;j<s.length();j++)
		{
			hs.add(s.charAt(j));
		}
		for(Character c:hs)
		{
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
              {
				System.out.println(c);
        	    count++;
	           }
		}
		System.out.print("vowels without duplicates = "+count);
		
	}

}
