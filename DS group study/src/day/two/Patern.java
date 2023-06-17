package day.two;

public class Patern {

	public static void main(String[] args) {

				for(int i=0;i<10;i++)//row
				{
					for(int j=0;j<10;j++)//column
					{
						if(i==j || i==9-j || j==0 || j==9 )
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
						
					}
					System.out.println();
				}
	}

}
