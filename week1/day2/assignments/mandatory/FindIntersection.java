package week1.day2.assignments.mandatory;

public class FindIntersection {

	public static void main(String[] args) 
	{
      int[] num1 = {3,2,11,4,6,7};
      int[] num2 = {1,2,8,4,9,7};
      int len1 = num1.length;
      int len2 = num2.length;
      for(int i=0;i<len1;i++)
      {
    	  for(int j=0;j<len2;j++)
    	  {
    		  if(num1[i]==num2[j])
    		  {
    			  System.out.print(num1[i]+",");
    			  break;
    		  }
    	  }
      }
	}

}
