package week1.day1.classroom;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int num = 0, count = 0, sum = 0;
	    System.out.println("ENTER THE NUMBER");
	    num = sc.nextInt();
	    count = num;
	    while(count!=0)
	    {
	    	int temp = count%10;
	    	sum= sum+temp;
	    	count = count/10;
	    }
	    
	    System.out.println(sum);

	}

}
