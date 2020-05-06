package week1.day1.assignment;

import java.util.*;
public class FibonacciSeries {

	public static void main(String[] args) {
    
		Scanner sc = new Scanner(System.in);
		int num1 = 0, num2 = 0, num3 = 0, sum = 0;
		System.out.println("Enter the first number");
		num1 = sc.nextInt();
		
		System.out.println("Enter the number of terms:");
			    num3 = sc.nextInt();
			    if(num3<=0)
			    {
			    	System.out.println("Invalid Input");
			    }
			    else
			    {
			      System.out.println(num1+ " , " +num2+", ");
			      for(int i =1;i<=num3-2;i++) // Two numbers 0 & 1 already given as input so num3-2 
			      {
			    	  sum = num1+num2;
			      
			    	num1 = num2;
			    	num2 = sum;
			      
					if(i<num3)
			    	{
			    		System.out.println(sum+ ", ");
			    	}
			    	if(i==num3) 
			    	{
			    		System.out.println(sum+ " ,");
			    	}
			    		
			      }	
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    		
			    	
			    	
			    }
			
			}
		
		
		
	}


