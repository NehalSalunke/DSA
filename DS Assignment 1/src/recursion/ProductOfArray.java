package recursion;

import java.lang.reflect.Array;

public class ProductOfArray {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		productOfArray(arr);

	}
	public static void productOfArray(int arr[])
	{
	   int product = 1;
	   for(int i = 1; i<= Array.getLength(arr); i++)
	   product=i*product; 
	   System.out.println("product of array is: "+product);
	}

}
