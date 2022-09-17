import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int a,b,p=0;
        for(a=1;a<=5;a++)
        {
            for(b=1;b<=a;b++)
            {
                p=p+1;
                System.out.print(p+" ");
            }
            System.out.println();
        }
    }
}
