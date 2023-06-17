package module.exam;

import java.util.Arrays;

public class HighestNumber {

	public static int num(int[]arr, int posi) {
		Arrays.sort(arr);
		return arr[posi];
	}
	public static void main(String args[]) {
		int numbers[]= {10,40,60,20,90,60,70,90};
		int arr[]=new int[2];
		arr[0]= num(numbers,numbers.length-2);
		arr[1]= num(numbers,numbers.length-3);
		System.out.println(Arrays.toString(arr));
		
	}
}

// time complexity == O(1)
// space complexity == O(1)