package string;

import java.util.TreeSet;

public class ReverseStringInAlphabetical {

	public static void main(String[] args) {

		String s="this is a mock";
		String[] str = s.split(" ");
		
		TreeSet<String> ts = new TreeSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
		ts.add(str[i]);	
		}
		
		System.out.println(ts);
		
		for(String string:ts)
		{
			System.out.print(string+" ");
		}
	}

}
