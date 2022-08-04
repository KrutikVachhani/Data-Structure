/*1)read n numbers an array tham read two different numbers replay first numbers with secoend numbers an array and print index*/

import java.util.Scanner;
class Replace{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of Array");
		int n=sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter element of Array");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		
		}
		System.out.println("Enter Number a=");
		int a= sc.nextInt();
		System.out.println("Enter Number b=");
		int b= sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==a)
			{
				arr[i]=b;
				System.out.println(i);
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);

		}

	}

}
