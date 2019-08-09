package StringDemos;

public class RevFullname {
	String str1="Manav";
	String str2="Sharma";
	int count=str1.length();
    String rev="";
   String st[];
    
	public void acc()
	{
		System.out.println("Th String is: "+str1);
		st=str1.split(" ");
		System.out.println(st[0]);
		for(int i=count-1;i>=0;i--)
		{
			rev+=str1.charAt(i);   // you can also take rev=rev +str.charAt(i);
		
		}
		
		System.out.println("Th String is: "+str2);
		st=str2.split(" ");
		System.out.println(st[0]);
		for(int i=count-1;i>=0;i--)
		{
			rev+=str2.charAt(i);
		
		

	System.out.println(rev);
		}
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		RevFullname oo=new RevFullname();
		oo.acc();
	}

}