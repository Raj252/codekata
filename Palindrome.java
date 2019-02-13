import java.io.*;
import java.util.*;
class Palindrome
{
    public static void main(String[] args) 
    {
        int num, reversedInteger = 0, remainder, originalInteger;
        Scanner s=new Scanner(Systen.in);
        num=s.nextInt();
        originalInteger = num;
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }
        if (originalInteger == reversedInteger)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
