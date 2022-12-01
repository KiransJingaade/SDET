package javapractice;

public class Factorial {

	public static void main(String[] args) {

		int fact=1;
		int num=6;
		
		for (int i = 2; i <=num; i++) {
			fact=fact*i;//1*2,2*3,4*6,24*5,120*6
		}
		System.out.println(fact);
	}

}
