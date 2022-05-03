package collections;

import java.util.ArrayList;

public class DemoList {

	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add(10);
		list.add(7);
		list.add(23);
		list.add(12);
		list.add(23);
		list.add(null);
		list.add('a');
		System.out.println(list);
	}
}
