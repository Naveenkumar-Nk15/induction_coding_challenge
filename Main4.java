
import java.util.*;
public class Main4
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String c[] = s.split(" ");
        int max=-9999;
        int ind=0;
        for(int i=0;i<c.length;i++)
        {
            if(c[i].length()>max)
            {
                ind = i;
                max = c[i].length();
            }
        }
       System.out.println(c[ind]+" "+max);
	}
}
