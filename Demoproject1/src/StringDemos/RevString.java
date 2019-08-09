package StringDemos;

public class RevString {
	String str="Manav Sharma";
	int count=str.length();
    String rev="";
    
	public void acc()
	{
		System.out.println("The length of the String: "+count);
		for(int i=count-1;i>=0;i--)
		{
			rev+=str.charAt(i);   // you can also take rev=rev +str.charAt(i);
		
		}
	System.out.println(rev);
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		RevString oo=new RevString();
		oo.acc();
	}

}
