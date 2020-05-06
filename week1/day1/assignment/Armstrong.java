package week1.day1.assignment;

public class Armstrong {

	public static void main(String[] args) {
		
		int num = 153, count = 0, sum = 0;
		count = num;
		while(count!=0)
		{
			int temp = count%10;
			int cube = temp*temp*temp;
			sum = sum+cube;
			count = count/10;
		}
		if(sum == num)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("Not an Armstrong number");
		}

	}

}
