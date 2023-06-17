package day.one;

import java.util.Scanner;

public class IndexArray {

	public static void main(String[] args) {
		int [] arr={1,2,3,4,5,6,7,8,9};
		Scanner sc = new Scanner(System.in);
		System.out.println("find index of : ");
		int index = sc.nextInt();
		for(int i = 1; i<=arr.length; i++)
		{
		    if(arr[i]==index)
		    {
		        System.out.println("found at index :" + i);
		        return;
		    }
		}
		System.out.println("not found");
		

	}

}
