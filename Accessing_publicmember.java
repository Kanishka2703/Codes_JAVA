class Sum
{
    public int x,y,z;
    public void getvalue()
    {
        x=5;
        y=8;
    }
    void add()
    {
        getvalue();
        z=x+y;
    }
    void display()
    {
        System.out.println("Sum of the numbers" +z);
    }
}

class Main
{
    public static void main(String args[])
    {
        Sum ob=new Sum();
        ob.add();
        ob.display();
    }
}
