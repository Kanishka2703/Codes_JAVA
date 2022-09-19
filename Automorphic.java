import java.io.*;
public class Main
{
    public static void main(String args[])throws IOException
    {
        int num,p,f=0;
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        System.out.println("Enter the number to be checked");
        num=in.readLine();
        p=num*num;
        do{
            if(num%10!=p%10)
            {
                f=1;
                break;
            }
            else
            {
                num=num/10;
                p=p/10;
            }
        }
        while(num>0);
        if(f==0)
        System.out.println("It is an Automorphic number");
        else
        System.out.println("It is not an Automorphic number");
    }
}