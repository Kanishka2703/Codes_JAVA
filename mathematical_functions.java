//to show the use of Mathematical functions in java
public class Main
{
    public static void main(String args[])
    {
        double m=6.25;
        double n=8.75;
        System.out.println("The Output of different Mathematical functions are");
        System.out.println("SQUARE ROOT OF 6.25=" +Math.sqrt(m));
        System.out.println("Minimum value between 6.25 & 8.75=" +Math.min(m,n));
        System.out.println("Maximum value between 6.25 & 8.75=" +Math.max(m,n));
        System.out.println("6.25 raised to the power =" +Math.pow(m,3));
        System.out.println("Natural log of 6.25 =" +Math.log(m));
        System.out.println("Absolute value of (6.25 - 8.75) =" +(float)Math.abs(m-n));
        System.out.println("Rounded value of 6.25 =" +Math.round(m));
        System.out.println("The floor value of 6.25 =" +Math.floor(m));
        System.out.println("The ceil value of 6.25 =" +Math.ceil(m));
        System.out.println("Truncated value of 6.25 =" +Math.rint(m));
        System.out.println("Exponent value of 6.25 =" +Math.exp(m));
    }
}