package week1.day2.classroom.strings;

public class CharOccurance {

	public static void main(String[] args) {
    String str = "welcome to chennai";
    int count = 0;
    char[] ch = str.toCharArray();
    int len = ch.length;
    for(int i =0; i<len;i++)
    {
    	if(ch[i] == 'e') 
    	{
    		count++;
    	}
    }
    System.out.println(count);
	}

}
