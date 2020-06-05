package InterviewExperience;

import java.util.HashMap;
import java.util.Scanner;

public class CountMaxOccurenceAndLargest {

	public static void main(String[] args) {
		int[] arr= {3,4,5,6,7,7,7,7,3,3,6,6};
		//System.out.println("Enter the count of numbers you will enter");
		CountMaxOccurenceAndLargest.inputArray(arr);

}
	public static void inputArray(int arr[])
	{
		HashMap<Integer,Integer> elementCount=new HashMap<Integer,Integer>();
		
		for(int key:arr)
		{
			if(elementCount.containsKey(key))
			{
				elementCount.put(key,elementCount.get(key)+1);
			}
			else elementCount.put(key, 1);
		}
		System.out.println(elementCount);
		
	}
}