package week1.day2.classroom.arrays;

import java.util.Arrays;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	int len = arr.length;
	int count = 0;
	Arrays.sort(arr);
	for(int i =0;i<len;i++)
	{
		for(int j=i+1;j<len;j++) 
		{
		if(arr[i] == arr[j])
			{
				count++;
			System.out.println(arr[i]+" ");
			break;
		
	
	
	}
	}

	}
}

}