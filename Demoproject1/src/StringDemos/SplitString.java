package StringDemos;

public class SplitString 
{
	String str="Manav Sharma";
	String st[];
	public void acc()
	{
		System.out.println("Splitting String");
		st=str.split(" ");
		System.out.println(st[0]);

	}

			public static void main(String[] args) {
				SplitString oo=new SplitString();
				oo.acc();
			}
		}
