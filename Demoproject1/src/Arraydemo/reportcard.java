package Arraydemo;

import java.util.Scanner;

public class reportcard
{
	int[] rollno=new int[3];
	String[] name=new String[3];
	double[] Eng=new double[3];
	double[] Hindi=new double[3];
	double[] total=new double[3];
	float[] Average=new float[3];
	int counter;
	Scanner s=new Scanner(System.in);
	
	public void result()
	{
		
			
			
			for(counter=0;counter<3;counter++)
			{
				
				System.out.println("Enter rollno of student");
				rollno[counter]=s.nextInt();
				System.out.println("Enter name of student");
				name[counter]=s.next();
				System.out.println("Enter marks of Eng of student");
				Eng[counter]=s.nextDouble();
				System.out.println("Enter marks of Hindi of student");
				Hindi[counter]=s.nextDouble();
				
			}
			System.out.print("Rollno \tname \tEng \tHindi \ttotal \tAverage \n");
			for(int n=0;n<3;n++) 
			{
				System.out.print(rollno[n]+"\t");
				System.out.print(name[n]+"\t");
				System.out.print(Eng[n]+"\t");
				System.out.print(Hindi[n]+"\t");
				System.out.print(Hindi[n]+Eng[n]+"\t");
				System.out.print((Hindi[n]+Eng[n])/2 +"\t");
				System.out.println();
				
				
			}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reportcard oo=new reportcard();
		oo.result();
	}

}
