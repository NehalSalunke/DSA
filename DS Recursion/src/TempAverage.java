import java.lang.reflect.Array;
import java.util.Scanner;

public class TempAverage {
	Scanner sc =new Scanner(System.in);
	
	public static void main(String[] args) {
		int temp =1; int day = 0; float sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of days : ");
		int number = sc.nextInt();
		int[] arr = new int[number];
		while(temp <= number)
		{
			System.out.println("Enter temperature of day "+ temp);
			day = sc.nextInt();
			sum = sum+day;
			temp++;
		
		float average = sum/number;
		System.out.println(" average temperature = "+ average);
		// finding more than average temperature 
		System.out.println("finding more than average temperature days");
		for(int iTmp =0;iTmp<arr.length;iTmp++)
		{
			if(iTmp>=average)
			{
				System.out.println("day "+ temp + " has crossed average temperature which is "+arr[iTmp]);
			}
			else
				System.out.println(arr[iTmp]);
			{System.out.println("no output");}
		}
        }
}
}
