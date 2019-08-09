package Loopdemo;

public class Reversestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<5;i++)
		{
			for(int s=4;s>=i;s--)
			{
				System.out.print(" ");
			}
		
			
			for(int c=0;c<i;c++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
			
			
	

