package week1.day2.classroom.arrays;

import java.util.Arrays;

public class MissingElementsInArray {

	public static void main(String[] args) {
    
		int[] arr = {1,2,3,4,7,6,8};
		//Arrays.sort(arr);
		int len = arr.length;
		//System.out.println(len);
	    for(int i = 0; i<arr.length;i++)
	    {
	    	if(arr[i]!=i+1)
	    	{
	    		System.out.println(i+1);
	    		break;
	    	}
	    	
	    }
	}

}
