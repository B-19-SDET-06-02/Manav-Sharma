package Loopdemo;

public class prime {
	
	
	public void Prim()
	{
		 int i,n=77;
		for(i=2; i<=n/2; i++)
		{
			//System.out.println(n/2);
			
			if(n%i==0)
			{
				System.out.println("not Prime no");
				break;
			}
				
		else
	      {
		    System.out.println(" prime");	
		      break;
	      }
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prime oo=new prime();
		oo.Prim();
		
	}

}
