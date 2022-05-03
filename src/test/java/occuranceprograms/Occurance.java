package occuranceprograms;

import java.util.LinkedHashSet;

public class Occurance {

	public static void main(String[] args) {

		//String s="apple";
		/**
		 * 1.Finding the repeatitions		
		 */
//				String s="apple";
//				char[] ch = s.toCharArray();
//				int n=ch.length;
//				for (int i = 0; i < n; i++) {
//					int count=0;
//					for (int j = i+1; j <n; j++) {
//						if(ch[i]==ch[j]) {
//							count++;
//							for (int k = j; k <n-1.; k++) {
//								ch[k]=ch[k+1];
//							}
//							n--;
//							j--;
//						}
//					}
//					System.out.println(ch[i]+" is occurrence "+count+" times");
				
		/**
		 * 2.Occurrence finding		
		 */
				
//				String s="apple";
//			HashSet<Character> hs = new HashSet<Character>();
//			for (int i = 0; i <s.length(); i++) {
//				hs.add(s.charAt(i));
//				}
//			for (Character ch : hs) {
//				int count=0;
//				for (int i = 0; i <s.length(); i++) 
//				{
//					if (ch.equals(s.charAt(i))) 
//					{
//						count++;
//					}
//				}
//				System.out.println(ch+" is occurring "+count);
//			}

		/**
		 * 3.Printing only repeated Letters numbers
		 */
//				String s="apple";		
//				HashSet<Character> hs = new HashSet<Character>();
//				for (int i = 0; i <s.length(); i++) {
//					hs.add(s.charAt(i));
//					}
//				for (Character ch : hs) {
//					int count=0;
//					for (int i = 0; i <s.length(); i++) 
//					{
//						if (ch.equals(s.charAt(i))) 
//						{
//							count++;
//						}
//					}if(count>1) {
//					System.out.println(ch+" is occurring "+count+" times");
//				}
//					
		//  }
				
		/**
		 * 4.Print only unique characters
		 */
//				String s="apple";
//				HashSet<Character> hs = new HashSet<Character>();
//				for (int i = 0; i <s.length(); i++) {
//					hs.add(s.charAt(i));
//					}
//				for (Character ch : hs) {
//					int count=0;
//					for (int i = 0; i <s.length(); i++) 
//					{
//						if (ch.equals(s.charAt(i))) 
//						{
//							count++;
//						}
//					}if(count<=1) {
//					System.out.println(ch+" is occurring "+count+" times");
//				}
//					
		//  }
				
				
		/**
		 * 5.Printing the position of the characters
		 */
				
//				String s="apple";
//				int index=0;
//				for (int i = 0; i <s.length(); i++) {
//					System.out.print(s.charAt(i)+" ");
//					System.out.println(index++);
//					
//				}

				
		/**
		 * 6.Print the unique elements with their position
		 */
				
//				String s="apple";
//			LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
//			for (int i = 0; i <s.length(); i++) {
//				hs.add(s.charAt(i));
//			}
//				for (Character ch : hs) {
//					int count=0;
//					for (int i = 0; i <s.length(); i++) {
//						if(ch.equals(s.charAt(i)))
//						{
//							System.out.println(ch+" position is "+i);
//						}
//						
//					}
//				}
			
				
		/**
		 * 7.Group the Duplicates for the strings
		 */
//				String s="abcdabcdabcd";
//			LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
//			for (int i = 0; i <s.length(); i++) {
//				hs.add(s.charAt(i));
//			}
//				for (Character ch : hs) {
//					int count=0;
//					for (int i = 0; i <s.length(); i++) {
//						if(ch.equals(s.charAt(i)))
//						{
//							System.out.print(ch);
//						}
//					}
//					System.out.println(" ");
//				}
				
				
		/**
		 * 8.Group the Duplicates for words
		 */
			
				String s="Khatham ta ta bye bye";
				String [] str=s.split(" ");
				LinkedHashSet<String> hs = new LinkedHashSet<String>();
				for (int i = 0; i <str.length; i++) {
					hs.add(str[i]);
				}
					for (String ch : hs) {
						int count=0;
						for (int i = 0; i <str.length; i++) {
							if(ch.equals(str[i]))
							{
								count++;
							}
						}
						System.out.println(ch+" "+count);
					}

				
			}
	}


