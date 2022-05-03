package string;

import java.util.LinkedHashSet;

public class GroupDuplicateSentences {

	public static void main(String[] args) {
      String s="khatam ta bye ta bye";
     String[] str = s.split(" ");
   
      LinkedHashSet<String> hs = new LinkedHashSet<String>();
     for(int i=0;i<str.length;i++)
     {
    	 hs.add(str[i]);
     }
     for(String s1:hs)
     {
    	 int count=0;
    	 for(int i=0;i<str.length;i++)
    	 {
    		if(s1.equals(str[i]))
    		{
    			System.out.print(s1);
    		}
    	 }
    	System.out.println(" "); 
     }
	}
}
