package module.exam;
//import java.util.Arrays;
public class RemoveDuplicate {
	public void removeDupli(int arr[])
	{
	int len = arr.length;
	int j = 0;
	for (int i = 0; i < len - 1; i++) //O(n)
	{
		if (arr[i] != arr[i + 1])
		{
			arr[j++] = arr[i];
		}
	}	
	arr[j++] = arr[len - 1];
	System.out.print("[");
	for (int k = 0; k < j; k++)
	{
		System.out.print(arr[k] + ",");
	}
	System.out.print("]");
//	System.out.println(Arrays.toString(arr));
}

public static void main(String[] args)
{
	int arr[] = { 10, 20, 30, 30, 40, 40, 50, 60, 70 };
	RemoveDuplicate obj = new RemoveDuplicate();
	obj.removeDupli(arr);
}
}


// Time Complexity == O(log n)
// Space Complexity == O(1)


