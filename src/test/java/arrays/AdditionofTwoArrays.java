package arrays;

public class AdditionofTwoArrays {

	public static void main(String[] args) {
		int a[]= {1,4,5};
		int b[]= {1,5,7,3};
		
		int count = a.length;
		
		if(a.length<b.length) {
			count=b.length;
		}
		
		for (int i = 0; i < count; i++) {
			
			try {
				System.out.println(a[i]+b[i]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				if(a.length>b.length) {
					System.out.print(a[i]);
				}else {
					System.out.println(b[i]);
				}
			}
		}
		}	
	}




