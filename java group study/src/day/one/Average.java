package day.one;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Find the average of three numbers");
		System.out.println("first number : ");
		int num1 = scan.nextInt();
		System.out.println("second number : ");
		int num2 = scan.nextInt();
		System.out.println("third number  : ");
		int num3 = scan.nextInt();
		average(num1, num2, num3);
	}

	public static void average(int num1, int num2, int num3)
	{
		float average = (num1+num2+num3)/ 3;
		System.out.println("average of the three numbers is : "+ average);
	}
}
