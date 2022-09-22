import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        int a,b,n,ar,pm;
        double d;
        System.out.println("Enter length and breath of a rectangle");
        a=in.nextInt();
        b=in.nextInt();
        System.out.println("Enter 1 for Area, 2 for Perimeter, 3 for diagonal");
        System.out.println("Enter your choice");
        n=in.nextInt();
        switch(n)
        {
            case 1:
                ar=a*b;
                System.out.println("Area of Rectangle= " +ar);
                break;
            case 2:
                pm=2*(a+b);
                System.out.println("Perimeter of rectangle= " +pm);
                break;
            case 3:
                d=Math.sqrt(a*a+b*b);
                System.out.println("Diagonal of reactangle= " +d);
                break;
            default:
            System.out.println("Wrong choice!!!!");
        }
        
    }
}