package day.one;

import java.util.Scanner;

public class AverageArray {
static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		AverageArray obj = new AverageArray();
		int [] arr={1,2,3,4,5,6,7,8,9};
		int sum=0; float average=0;
	      for(int a : arr)
	      {
	          sum=sum+a;
	          average= sum/9;
	      }
	      System.out.println(average);
	      obj.searchNumber();
	     }

	  public static void searchNumber()
	     {
	        int[] arr= {1,2,3,4,5,6,7,8,9}; 
	         System.out.println("enter target number : ");
	         int target = sc.nextInt();
	         for(int a=0; a<arr.length;a++)
	         {
	             if(arr[a]!=target)
	             {
	            	 return;
	             }
	             else
	             {
	            	 System.out.println(" target value "+arr[a]+ " is found ");
	             }
	         }
          
	     }
	}

