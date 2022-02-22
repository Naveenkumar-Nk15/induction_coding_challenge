import java.util.*;
public class Main3
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String c[] = s.split(" ");
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                int k=0;
                while(c[i].charAt(k)==c[j].charAt(k))
                {
                    k++;
                }
                if(c[i].charAt(k)>c[j].charAt(k))
                {
                    String t = c[i];
                    c[i] = c[j];
                    c[j] = t;
                }
            }
        }
        for(int i=0;i<c.length;i++)
        {
            System.out.print(c[i]+" ");
        }
	}
}

