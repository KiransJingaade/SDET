package collections;

import java.util.HashSet;

public class DemoSet {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add(10);//insertion order not maintained
		set.add(24);
		set.add(76);
		set.add(1);
		set.add(76);//duplicates not alowed
		set.add(null);//1 null
		set.add(null);//takes only 1  null
		set.add('v');
		set.add("tyss");//heterogenous nature
		System.out.println(set);
	}
}
