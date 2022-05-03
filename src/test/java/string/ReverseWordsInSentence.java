package string;

import java.util.HashSet;

public class ReverseWordsInSentence {

	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		String[] str = s.split(" ");
        
		for (String s1 : str) {
			for(int i=s1.length()-1;i>=0;i--)
			{
			 	System.out.print(s1.charAt(i));
			}
			System.out.print(" ");
		}
}
}
