package week1.day2.classroom.strings;

public class FindTypes {

	public static void main(String[] args) {
    String test = "$$ welcome to 2nd class of Automation $$";
    int letter = 0, space = 0, num = 0, specialchar = 0;
    char[] ch = test.toCharArray();
    int len = ch.length;
    for(int i =0; i<len; i++)
    {
    	char c = ch[i];
    	if(Character.isLetter(c)) {
    		letter++;
    	}
    	else if(Character.isDigit(c))
    	{
    		num++;
    	}
    	else if(Character.isSpaceChar(c))
    			{
    		space++;
    		
    	}
    	else
    	{
    		specialchar++;
    		
    	}
    }
    	System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialchar);
		
    
	}

	
}
