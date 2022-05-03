package javapractice;

abstract class Z{

	abstract void test();
	
	void print(String text) {
		System.out.println("hi");
	}
}
class P9 extends Z
{
	void test()
	{
		System.out.println("implemented from sub class");
	}
}
