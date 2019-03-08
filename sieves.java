package sieves;
import java.util.*;
/**
 *
 * @author akil
 */
 class sieves {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int o=n;
        int sum=0;
        int h;
        int mul=1;
        int temp=n;
        int cnt=0;
        while(n!=0)
        {
            
            n=n/10;
            
            cnt++;
        }
        
        while(cnt!=0)
        {
            int cn=cnt;
             h= temp%10;
             
            int k=h;
            mul=1;
            for(int i=0;i<3;i++)
            {
                mul=mul*k;
                System.out.println(mul);
            }
            sum=sum+mul;
            temp=temp/10;
            cnt--;
        }
      //System.out.println(sum);
      //System.out.println(o);
        if(o==sum)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
       // System.out.println(cnt);
            
    }
     
    
}
