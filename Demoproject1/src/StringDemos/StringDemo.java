package StringDemos;

public class StringDemo {
	String Name=new String("Manav");
	String fname="Sharma";
	int a=5;
	char a1='y';
	public void print()
	
	{
		System.out.println(Name+a+a1);
		fname=Name.concat(fname);
		System.out.println(fname);
		
	}
		

	public static void main(String[] args) {
		StringDemo oo=new StringDemo();
		oo.print();
		// TODO Auto-generated method stub

	}

}
