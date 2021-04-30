class Part2
{
Part2()
{
System.out.println("This is default constructor");
}
Part2(String s)
{
this();
System.out.println("This is second constructor with string"+s);
}
public static void main(String args[])
{
Part2 p=new Part2("Java");

}
}
