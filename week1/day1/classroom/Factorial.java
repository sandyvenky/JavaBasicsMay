package week1.day1.classroom;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    int fact =1, num = 0;
		    System.out.println("ENTER THE NUMBER");
		    num = sc.nextInt();
		    for(int i =1;i<=num;i++) 
		    {
		    	fact = fact*i;
		    }
		    System.out.println(fact);
	}

}
