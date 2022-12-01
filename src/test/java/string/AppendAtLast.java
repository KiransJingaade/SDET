package string;

public class AppendAtLast {

	public static void main(String[] args) {

		String s="Qspider";
		System.out.println(s);
		
		StringBuilder sb=new StringBuilder(s);
		sb.append("o");
		System.out.println(sb);
	}
}
