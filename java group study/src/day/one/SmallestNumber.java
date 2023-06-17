package day.one;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Find the smallest number");
		System.out.println("first number : ");
		int num1 = scan.nextInt();
		System.out.println("second number : ");
		int num2 = scan.nextInt();
		System.out.println("third number  : ");
		int num3 = scan.nextInt();

		smallestNumber(num1, num2, num3);
		
	}
	public static void smallestNumber(int num1, int num2, int num3)
	{
		if (num1<num2 && num1<num3)
		{
			System.out.println(num1 + " is smallest number");
			return;
		}
		else if(num2<num1 && num2<num3)
		{
			System.out.println(num2 + " is smallest number");
			return;
		}
		else
		{
			System.out.println(num3 + " is smallest number");
		}
	}

}
