package Arraydemo;

public class Duplicate {
	
int[] arr= {3,5,7,3,5,4,1};
public void dup()
{
	for(int i=0;i<arr.length;i++)
	{
		int n=arr[i];
		for(int j=i+1;j<arr.length;j++)
		{
			int m=arr[j];
	if(n==m)
	{
		System.out.println("Duplicate value is :"+n);
		System.out.println(" Position of Duplicate value is :"+(j+1));
		System.out.println(" Position of original value is :"+(i+1));
		
	}
	}
	}
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Duplicate oo=new Duplicate();
oo.dup();
	}

}
