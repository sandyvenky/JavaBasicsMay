package week1.day2.assignments.mandatory;

import java.util.*;
public class ReverseEvenWords {

	public static void main(String[] args)
	{
      Scanner sc = new Scanner(System.in);
      String text = "I am a software tester";
      String[] str = text.split(" "); // splitting the string into words by using whitespace between them
      int len = str.length;
      for(int i =0; i<str.length;i++) // traversing each and every word
      {
    	  if(i%2!=0) { // even place according to index in question checking 
    		  char[] word = str[i].toCharArray(); // splitting am into separate characters
    		  for(int j=word.length-1;j>=0;j--) // to reverse the word
    		  {
    			  System.out.print(word[j]);
    		  }
    	  System.out.print(" ");
    	  
    	  }
    	  else
    	  {
    		  System.out.print(str[i]+" ");
    	  }
    	  
      }
      
    	  }
      
	}

