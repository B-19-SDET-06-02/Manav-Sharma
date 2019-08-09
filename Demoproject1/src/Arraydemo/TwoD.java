package Arraydemo;

import java.util.Scanner;

public class TwoD
{
	int[][]mat=new int[3][3];
	
	Scanner acc=new Scanner(System.in);
	
	public void acc()
	{
	System.out.println("Enter elements");
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			mat[i][j]=acc.nextInt();
			
		}
	}
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print("\t"+mat[i][j]);
		}
	System.out.println();
	}
	}
	
	public static void main(String[] args) {
		TwoD oo=new TwoD();
		oo.acc();
	}
}

	

