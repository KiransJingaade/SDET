package arrays;

public class SumOfThreeMax {

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
		//sum of first 3 max 
		int sum=0;
		for (int i = 0; i < 3; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
		}
	}


