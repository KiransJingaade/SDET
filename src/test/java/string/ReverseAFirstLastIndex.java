package string;

public class ReverseAFirstLastIndex {

	public static void main(String[] args) {

		String s="my name is kiran";
		String[] str = s.split(" ");	
			
		String temp=str[0];//int temp=a[i];
		
		str[0]=str[str.length-1];//a[i]=a[j];
		
		str[str.length-1]=temp; //a[j]=temp;
		for (int j = 0; j < str.length; j++) {
			System.out.print(str[j]+" ");
		}
		}
	}

	


