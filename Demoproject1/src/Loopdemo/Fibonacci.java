package Loopdemo;

public class Fibonacci {
	public static void acc()
	{
		int a=0, c=0;
		
				
				for(int b=0;b<10; b++)
				{
					a=b;
					b=c;
					c=a+b;
					
					
					
					
					System.out.println("fibonaci"+a);
					
					
				}
				
	}


	public  static void main(String[] args) {
		// TODO Auto-generated method stub
               acc();

	}

}
