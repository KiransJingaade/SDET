package arrays;

public class SumOfFirstThreeMin {

	public static void main(String[] args) {
		int []a= {5,6,2,8,9};
		for (int i = 0; i < a.length; i++) {
		
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					}
				}
			}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int sum=0;
		for (int i = 0; i <3; i++) {
			sum=sum+a[i];
		}
		System.out.println("==============");
		System.out.println(sum);

		}
	}


