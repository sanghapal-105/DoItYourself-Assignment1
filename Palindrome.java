import java.util.Scanner;
import java.lang.Math;

class Palindrome
{


	public void m1(int a)
	{
		int temp=a;
		int power=a;
		int rev=0;
		int n=0;
		while(a>0)
		{
			n++;
			power=power/10;
		}
		
		while(temp>0)
		{
			int b=temp%10;
			int c=(int)Math.pow(10,n-1);
			rev=rev+b*c;
			n--;
			temp=temp/10;
		}
		
		if(a==rev)
		System.out.println("number is palindrome");
		else 
		System.out.println("number is not palindrome");
				
	}



	public static void main(String args[])
	{
	Scanner s1= new Scanner(System.in);
	System.out.println("please enter first number");
	int a=s1.nextInt();
	Palindrome obj= new Palindrome();
	obj.m1(a);
	
	}

}