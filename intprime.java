import java.util.Scanner;
class Intprime
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int s=sc.nextInt();
int l=sc.nextInt();
int count=0;
for(int i=s+1;i<l;i++)
{
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
    count++;
}
}
if(count==0)
System.out.print(i);
count=0;
}
}
}
