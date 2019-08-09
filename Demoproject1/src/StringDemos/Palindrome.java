package StringDemos;

public class Palindrome {
	String str="MOM";
	int count=str.length();
    String rev="";
    
	public void acc()
	{
		System.out.println("The String is: "+str);
		for(int i=count-1;i>=0;i--)
		{
			rev+=str.charAt(i);   // you can also take rev=rev +str.charAt(i);
		
		}
	System.out.println("The reverse of the string is:"+rev);
	
	if(str.equals(rev))
	{
		System.out.println("It is palindrome");
	}
	else
	{
		System.out.println("It is not a palindrome");
	}
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Palindrome oo=new Palindrome();
		oo.acc();
	}

}
