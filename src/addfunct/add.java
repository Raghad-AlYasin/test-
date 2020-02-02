package addfunct;

import java.util.Scanner;

class add
{
	int res=0;
	add(int x,int y)
	{
	 res=x+y;
	}
}
class Add
{
public static void main(String[] arg)
{
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	a=sc.nextInt();
	System.out.println("Enter second number");
	b=sc.nextInt();
	add c=new add(a,b);
	System.out.println("Addition of two numbers is : "+c.res);
}
}