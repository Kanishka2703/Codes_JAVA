import java.io.*;
public class Main
    {
        public static void main(String args[])throws IOException
        {
            InputStreamReader read =new InputStreamReader(System.in);
            BufferedReader in =new BufferedReader(read);
            int p,n,s=0,d;
            System.out.println("Enter the number");
            n=Integer.parseInt(in.readLine());
            p=n*n;
            do
            {
                d=p%10;
                s=s+d;
                p=p/10;
            }
            while(p!=0);
            if(s==n)
            System.out.println("It is a neon number");
            else
            System.out.println("It is not a neon number");
        }
    }
