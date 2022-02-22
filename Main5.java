import java.util.*;
public class Main5
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        if(n<1)
        {
            System.out.println("Invalid");
            return ; 
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j< n-i-1; j++)
                System.out.print(" ");
             
            int ntp=1;
            for (int j=0;j<=i;j++) 
            {
                if(j!=0)
                {
                    ntp = ntp * (i - j + 1) / j;
                }
                System.out.print(ntp+" ");
            }
            System.out.println();
       }
	}
}
