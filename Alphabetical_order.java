//to arrange the Characters of the string in alphabetical order
import java.util.*;
public class Main
{
    public static void main (String args[])
    {
       Scanner in=new Scanner(System.in);
       int i,j,p;
       char ch;
       String str1;
       System.out.println("Enter the String");
       str1= in.nextLine();
       p=str1.length();
       for(i=65;i<=90;i++)
       {
           for(j=0;j<p;j++)
           {
               ch=str1.charAt(j);
               if(ch==(char)i||ch==(char)(i+32))
               System.out.print(ch);
           }
       }
    }
    
}

