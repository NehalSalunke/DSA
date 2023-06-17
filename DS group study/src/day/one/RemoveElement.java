package day.one;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to remove : ");
		int index = sc.nextInt();
		for(int a:arr)
		{
			for(int i=0; i<arr.length; i++)
			{
				
				System.out.println("number removed " );
				System.out.println(Arrays.toString(arr));
			}
			
		}
		System.out.println("number not found");
	}

}
