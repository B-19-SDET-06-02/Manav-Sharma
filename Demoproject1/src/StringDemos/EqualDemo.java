package StringDemos;

import java.util.Scanner;

public class EqualDemo {
	String loginid;
	String pass;
	Scanner sc=new Scanner(System.in);
	
	public void checkLogin()
	{
		System.out.println("Enter Login id");
		loginid=sc.next();
		
		System.out.println("Enter password");
		pass=sc.next();
		
		if(loginid.equals("admin") && pass.equals("password"))
				{
			System.out.println("you are a valid user");
				}
	else
	{
		System.out.println("you are not a valid user");
	}
	}

	public static void main(String[] args) {
		EqualDemo oo=new EqualDemo();
		oo.checkLogin();
	}
	}
		// TODO Auto-generated method stub

	


