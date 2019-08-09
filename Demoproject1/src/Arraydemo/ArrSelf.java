package Arraydemo;

import java.util.Scanner;

public class ArrSelf 
{

	int[] arr;
	int size;
	
	Scanner s=new Scanner(System.in);
	
	public void ac()
	{

		System.out.println("Enter size of array");
		size=s.nextInt();
		arr=new int[size];
		
		System.out.print("Enter value of array");
			for(int n=0;n<size;n++)
			{
				arr[n]=s.nextInt();
				
			}
			System.out.println("Array is ");
			for(int i=0;i<size;i++)
			{
				System.out.println(arr[i]);			
		}
	}


	public static void main(String[] args) {
		ArrSelf oo=new ArrSelf();
		oo.ac();
	}
}
