package day.two;

public class DuplicateString {

	public static void main(String[] args) {
		String[] arr= {"ah","bj","kf","dk","bj","ah"};
		for(int i=0;i<arr.length-1;i++)
		{
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{System.out.println(arr[j]+ " is duplicate");}
			}
		}

	}

}
