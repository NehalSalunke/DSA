package day.two;

public class MaxMinValue {

	public static void main(String[] args) {
		int []arr={1,5,4,2,8,7,6,3,9};
        int max=arr[0];
        int min=arr[0];
        for(int i=0; i<arr.length; i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                
            }
        }
        System.out.println("maximum value is : "+max);
        for(int i =0; i<arr.length; i++)
        {
        	if(min>arr[i])
        	{
        		min=arr[i];
        	}
        }
        System.out.println("minimum value is : "+ min);
	}
}
