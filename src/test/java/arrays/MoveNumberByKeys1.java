package arrays;

public class MoveNumberByKeys1 {

	public static void main(String[] args) {

		int []a= {1,2,3,4,5};
		int key=3;
		if(key<a.length)
		{
		for(int i=key;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		for(int j=0;j<key;j++)
		{
			System.out.print(a[j]);
		}
		}
	}
}
