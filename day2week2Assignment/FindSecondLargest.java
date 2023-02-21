package week2.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		/*
		 Pseudo Code:
		 1) Arrange the array in ascending order
		 2) Pick the 2nd element from the last and print it
		 */
		int sizeData=data.length;
		Arrays.sort(data);
		System.out.println(data[sizeData-2]);
//int largest=0;
//	
//	for(int i=0;i<sizeData;i++)
//	{
//		if(data[i]>largest )
//		{
//			largest=data[i];
//		}
//	}
//System.out.println(largest);
}
}