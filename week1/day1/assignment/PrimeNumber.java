package week1.day1.assignment;

public class PrimeNumber {

	public static void main(String[] args) {
    int num = 13, flag = 0;
    for(int i =2; i<=num/2; i++)
    {
     
    	if(num%i==0) 
    	{
    		flag = 1; 
    	    break;
    	    
    }
    
	}
    if(flag ==0) 
    {
    	System.out.println("Prime Number");
    }
    else {
    	System.out.println("Not a Prime Number");
    }
    

}

}