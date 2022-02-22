
import java.util.*;
public class Main2
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        StringBuffer sb = new StringBuffer();
        char c[] = s.toCharArray();
        int j=0;
        for(int i=0;i<c.length;)
        {
            j=0;
            while(i+j+1<c.length && c[i]==c[i+j+1])
            {
                j++;
            }
            // System.out.println(c[i]+" "+j+" "+i);
            sb.append(c[i]);
            sb.append(j+1);
            if(j==0)
            {
                i++;
            }
            else
            {
                i=i+j+1;
            }
        }
        System.out.println(sb);
	}
}
