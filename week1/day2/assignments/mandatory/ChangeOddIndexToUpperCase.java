package week1.day2.assignments.mandatory;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) 
	{
	
		String test = "changeme";
		char[] ch = test.toCharArray();
		int len = ch.length;
		for(int i =0;i<len;i++)
		{
			char c = ch[i];
			if(i%2==1)
			{
				c = Character.toUpperCase(c);
				}
			System.out.print(c);
		}
	}

}
