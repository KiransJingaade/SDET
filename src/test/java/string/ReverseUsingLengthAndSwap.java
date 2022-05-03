package string;

public class ReverseUsingLengthAndSwap {

	public static void main(String[] args) {

		String s="solar";
		System.out.println(s);
		
		char[] ar=s.toCharArray();
		for (int i=0, j=ar.length-1;i<ar.length/2;i++ ,j--) {
			char temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
		String str=new String(ar);
		System.out.println(str);
	}
}
