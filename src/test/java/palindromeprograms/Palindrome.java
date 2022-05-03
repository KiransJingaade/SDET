package palindromeprograms;

public class Palindrome {

	public static void main(String[] args) {

		/**
		 * 1.Check Palindrome for String 	
		 */
		String s="ABCD";
			String rev="";
			for (int i =s.length()-1; i>=0; i--) {
				rev=rev+s.charAt(i);
			}
			if(rev.equals(s)) {
			System.out.println(s+" is a Palindrome");
				}else {
					System.out.println(s+" is not a Palindrome");
				}
		/**
		 * 2.Check Palindrome for Number
		 */
//			int num=141;
//			int  temp=num;
//			int rev=0;
//			while(num>0) 
//			{
//				int rem=num%10;
//				rev=(rev*10)+rem;
//				num=num/10;
//			}
//			if(temp==rev) {
//				System.out.println(temp+" is a Palindrome");
//			}else {
//				System.out.println(temp+" is not a Palindrome");	
//		}
	}

}
