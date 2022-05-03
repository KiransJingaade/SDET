package string;

public class Palindrome {

	public static void main(String[] args) {
		String s="radar";
//		char[] ar = s.toCharArray();
//		int count=0;
//		for (int i = 0, j=ar.length-1;i<ar.length/2; i++,j--) {
//			if(ar[i]!=ar[j]) {
//				count=1;
//				break;
//			}
//		}
//		if(count==0) {
//			System.out.println("String is  palindrome");
//		}else {
//			System.out.println("string is  not palindrome");
//		}
		String rev="";
		for(int i=s.length()-1 ;i>=0; i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("The string is a palindrome");
		}else
		{
			System.out.println("The string is not a palindrome");
		}
        }		
	}


