package StringDemos;

public class containsDemo {
	String str="Manav Sharma";
	public void acc()
	{
		if(str.contains("Sharma"))
		{
			System.out.println("valid");
		}
		else
		{
			System.out.println("Not Contains");
		}
	}
			public static void main(String[] args) {
				containsDemo oo=new containsDemo();
				oo.acc();
			}
		}

