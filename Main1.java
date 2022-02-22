
import java.util.*;
public class Main1
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c[] = s.toCharArray();
        if(c.length%2 != 0)
        {
		System.out.print("Invalid");
            return ;
        }
        for(int i=0;i<c.length-1;i=i+2)
        {
            int j=0;
            int k=c[i+1]-'0';
            while(j<k)
            {
                System.out.print(c[i]);
                j++;
            }
        }
	}
}

