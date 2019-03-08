
import java.util.*;
import java.lang.*;
import java.io.*;
class Ideonev
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,a,b;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=a+1;i<b;i++)
		if(i%2==0)
		{
			System.out.println(i);
		}
	}
}
