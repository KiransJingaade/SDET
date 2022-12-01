package string;

import java.util.Scanner;

public class ConvertToUppercase {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("enter the string");
		
		String str = s.nextLine();
		String[] s1 = str.split(" ");
		
		String first="";
		for(String s2:s1) {
		for (int i = 0; i < s2.length(); i++) {
			String f1 = s2.substring(0, 1);
			first=f1.toUpperCase();
		}	
		System.out.print(first);
		}
	}

}
