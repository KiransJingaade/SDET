package javapractice;

public class Runner {

	public static void main(String[] args) {
		P9 obj=new P9();
		obj.test();//implemented from sub class
		
		Z obj1=new P9();//upcasting
		obj1.test();//implemented from sub class
	}

}
