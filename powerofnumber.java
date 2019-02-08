import java.io.*;
import java.util.*;
class powerofnumber
{
	public static void main(String args[])
	{
		int a,b;
		long result=1;
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		while (b != 0)
        {
            result *= a;
            --b;
        }
        System.out.println(result);
	}
}
