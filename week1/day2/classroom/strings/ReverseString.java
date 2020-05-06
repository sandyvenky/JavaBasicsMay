package week1.day2.classroom.strings;

public class ReverseString {

	public static void main(String[] args) {
    String test = "feeling good";
    char [] ch = test.toCharArray();
    int len = ch.length;
    for(int i =len-1;i>=0;i--)
    {
    	System.out.print(ch[i]);
    }
	}

}
