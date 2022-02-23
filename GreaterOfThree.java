import java.util.Scanner;

class GreaterOfThree
{


	public void m1(int a,int b,int c)
	{
		if(a>b)
		{
			if(a>c)
				System.out.println("greater of number is"+a);
			else
				System.out.println("greater of number is"+c);
		}
		else
		{
			if(b>c)
				System.out.println("greater of number is"+b);
			else
				System.out.println("greater of number is"+" "+c);
		}
				
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter first number");
	int a=s1.nextInt();
	System.out.println("please enter Second number");
	int b=s1.nextInt();
	System.out.println("please enter third number");
	int c=s1.nextInt();
	GreaterOfThree obj= new GreaterOfThree();
	obj.m1(a,b,c);
	
	}

}