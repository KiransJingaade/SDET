package stringprograms;

public class ReverseAString {

	public static void main(String[] args) {

		String s="ABCD";
		/**
		 * 1.without storing		
		 */
				for (int i = s.length()-1; i >=0; i--) {
					System.out.print(s.charAt(i));
		/**
		 * 2.storing string		
		 */
//				String rev="";
//				int len = s.length();
//				for (int i = len-1; i >=0; i--) {
//					rev=rev+s.charAt(i);
//				}
//				System.out.print(rev);
		/**
		 * 3.Using String Buffer		
		 */
				
//				StringBuffer sb = new StringBuffer(s);
//				sb.reverse();
//				System.out.print(sb);
				
		/**
		 * 4.Reverse without using Length method	
		 */
//				char[] ar = s.toCharArray();
//				int count=0;
//				for (char c : ar) {
//					count++;
//				}
//				for (int i = count-1; i >=0; i--) {
//					System.out.print(s.charAt(i));
//				}

		/**
		 * 	5. Using 4 & 2	
		 */
//				char[] ar = s.toCharArray();
//				int count=0;
//				for (char c : ar) {
//					count++;
//				}
//				String rev="";
//				for (int i = count-1; i >=0; i--) {
//					rev=rev+s.charAt(i);
//				}
//				System.out.println(rev);
				
			
			
			}
				}
	}


