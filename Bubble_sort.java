//To arrange numbers by using bubble sort technique on Arrays
import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int i,j,t;
        int m[] =new int[10];
        for(i=0;i<10;i++)
        {
            System.out.println("Enter numbers");
            m[i]=in.nextInt();
        }
        for(i=0;i<9;i++)
        {
            for(j=0;j<(9-i);j++)
            {
            if(m[j]>m[j+1])
            {
                t=m[j];
                m[j]=m[j+1];
                m[j+1]=t;
            }
            }
        }
        System.out.println("Numbers arranged in ascending order are:");
        for(i=0;i<10;i++)
        System.out.println(m[i]);
    }
}