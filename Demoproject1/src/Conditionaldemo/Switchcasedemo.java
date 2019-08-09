package Conditionaldemo;

import java.util.Scanner;

public class Switchcasedemo {
int num1,num2,res,choice;
Scanner sc=new Scanner(System.in);
  public void enter()
  {
	  System.out.print("Enter value for num1");
       num1=sc.nextInt();    // takes input from the user 
       
       System.out.print("Enter value for num2");
       num2=sc.nextInt();      // takes input from the user 
       
  }
  
  public void check()
  {
	System.out.println("1.Add\t  2.Subtract\n 3.Multipy\t 4.Divide");
	                                                                    // it means   1.Add        2.Subtract
	System.out.println("Enter your choice");                             // and       3.Multiply      4.Divide
	choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
		enter();
		res=num1+num2;
		System.out.print("Result of Addition is:"+res);
		break;
		
		
	case 2:
		enter();
		res=num1-num2;
		System.out.print("Result of Subtraction is:"+res);
		break;
		
		
	case 3:
		enter();
		res=num1*num2;
		System.out.print("Result of Multiplication is:"+res);
		break;
		
	case 4:
		enter();
		res=num1/num2;
		System.out.print("Result of Division is:"+res);
		break;
		
		default:
	    System.out.println("Sorry you have enteered the wrong choice");
	    break;
		
	}
	

  }                                                                       
	public static void main(String[] args)
  {
		// TODO Auto-generated method stub
         Switchcasedemo oo=new Switchcasedemo();
         oo.check();
	}

}
