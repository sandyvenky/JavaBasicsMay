package week1.day2.assignments.mandatory;

public class RemoveDuplicates {

	public static void main(String[] args)
	{

		String text = "we learn java basics as part of java session in java week1";
		String[] chararray = text.split(" ");
		int len = chararray.length; 
				int count = 0;
	
		for(int i =0; i<len; i++)
		{
			if(chararray[i]!=null) 
			{
				for(int j =i+1;j<len;j++) 
				{
					if(chararray[i].equals(chararray[j]))
					{
						chararray[j] = null;
						
					}
				}
			}
		}
	      for(int k =0;k<len;k++) {
	    	  if(chararray[k]!=null)
	    	  {
	    		  System.out.print(chararray[k]+ " ");
	    	  }
	      }
	
	
	
	}

}
