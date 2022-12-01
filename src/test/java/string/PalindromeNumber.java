package string;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		String str = s.nextLine();

		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		if(str.equals(rev))
		{
			System.out.println("given string is palindrome ");
		}
		else
		{
			System.out.println("given string is not palindrome");
		}
	}
}
