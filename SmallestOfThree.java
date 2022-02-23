import java.util.Scanner;

class SmallestOfThree
{


	public void m1(int a,int b,int c)
	{
		int count=0;
		while(a!=0 && b!=0 && c!=0)
		{
			a--;
			b--;
			c--;
			count++;
			
		}
		System.out.println("samllest number is"+count);
				
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
	SmallestOfThree obj= new SmallestOfThree();
	obj.m1(a,b,c);
	
	}

}