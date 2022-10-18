public class Main 
{
    public static void main(String args[])
    {
        String input = "java is best";
        System.out.println("String is : " + input);
        char strArr[] = input.toCharArray();
        for (int i = 0; i < strArr.length; i++)
        {
            if (strArr[i] >= 'a' && strArr[i] <= 'z') 
            {
                strArr[i] = (char) ((int) strArr[i] - 32);
            }
        }
                System.out.print("Upper case string is : ");
                for (int i = 0; i < strArr.length; i++)
                {
                    System.out.print(strArr[i]);
                }
    }
}