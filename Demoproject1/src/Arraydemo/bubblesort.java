package Arraydemo;

public class bubblesort 
{
	int[] arr= {4,2,5,3,1};
	int temp;
	
	public void sort()
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;i<arr.length-1;i++)
				
			{
				
		 if(arr[j]>arr[j+1])
		 {
			 temp=arr[j];
		   arr[j]=arr[j+1];
		 arr[j+1]=temp;
			}
		}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		}

	   public static void main(String[] args) {
		bubblesort oo=new bubblesort();
		oo.sort();
		// TODO Auto-generated method stub

	}

}
