package Loopdemo;

public class fact {
	public void acc()
	{
		int fact=1;
	
		int count;
		
		for(count=5; count>=1;count--)
		{
			fact
			=fact*count;
			
			
		}
		
		System.out.println("factorial"+fact);
		
	}
	
	public static void main(String[]args) {
		fact oo=new fact();
		oo.acc();
		
		
		
		
	}
}
