package Arraydemo;

import java.util.Scanner;

public class SingleD {

	int[] rollno=new int[10];
	int counter;
	Scanner s=new Scanner(System.in);
	public void acceptdet()
	{
		System.out.println("Enter 10 elements");
		for(counter=0;counter<10;counter++)
		{
			rollno[counter]=s.nextInt();
		}
		for(int n=0;n<10;n++)                  //or  we can use for(int n:rollno) so that for(int n=0;n<10;n++) work can be done easily
		//for(int n:rollno)
		{
			System.out.println(rollno[n]);
		}
	}
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleD oo=new SingleD();
		oo.acceptdet();

	}

}
