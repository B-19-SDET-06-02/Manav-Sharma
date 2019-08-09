package Loopdemo;

public class primeseries {
	
	public static void primeser() {
		
		int i,j,n=10,a=0;
		for(i=2;i<n;i++)
		{
			for (j=2; j<i;j++)
			{
				if(i%j==0)
				{
				
					a=1;
	
				}}
				
		if(a==0)	
				{
					System.out.println(j);
					
				}
		a=0;
			}
			
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		primeser();
	}

}
