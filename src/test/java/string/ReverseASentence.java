package string;

public class ReverseASentence {

	public static void main(String[] args) {
		String s="khatam ta ta bye bye";
		
		String[] str = s.split(" ");
		//reverse a sentence
//		for(int i=str.length-1;i>=0;i--)
//		{
//			System.out.print(str[i]+" ");	
//		}
		//reverse both sentence and word
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);	
	}
}
