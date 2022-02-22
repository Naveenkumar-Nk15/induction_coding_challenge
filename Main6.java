
import java.util.*;
public class Main6
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        long p=1;
        for(int i=1;i<=n;i++)
        {
            p=p*i;
        }
        int c=0;
        while(p%10==0)
        {
            p=p/10;
            c++;
        }
        System.out.println(c);
	}
}

