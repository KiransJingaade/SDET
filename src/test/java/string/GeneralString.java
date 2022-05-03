package string;

public class GeneralString {

	public static void main(String[] args) {
		String s="testyantra";
		for (int i = 0; i <s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.out.println("==============reverse a string================");
		
		for (int i = s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
	}
}
