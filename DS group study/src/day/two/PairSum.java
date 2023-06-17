package day.two;

public class PairSum {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
        int sum =7;
        int flag=0;
        for(int i =0; i<arr.length-1; i++) {
            for(int j =i+1; j<arr.length; j++) {
                if(arr[i]+arr[j]==sum) 
                {
                    System.out.println("pair found -->"+arr[i]+" , "+arr[j]);
                    flag=1;

                }
                }
            }
        if(flag==0)
        {
        	System.out.println("pair not found");
        }
        	
        }

	}


