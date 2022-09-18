import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int i,p;
        char ch;
        String st,st2=" ";
        System.out.println("Enter a word");
        st=in.next();
        p=st.length();
        for(i=0;i<p;i++)
        {
            ch=st.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') continue;
            st2=st2+ch;
        }
        System.out.println("New word after deleting vowels:" +st2);
    }
}