package string;

import java.util.HashSet;

public class OccurenceWithInteger {

	public static void main(String[] args) {
		int[] a= {1,1,2,3,4,2,1,2,3};
       
		 HashSet<Integer> hs = new HashSet<Integer>();
		 
		 for(int i=0;i<a.length;i++) {
			 hs.add(a[i]);
		 }
		 for (Integer n : hs) {
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(n.equals(a[i]))
				{
					count++;
				}
			}
			System.out.println(n+" "+count);
		}
	}

}
