class A
{
A(String s)
{
System.out.println("String is  " + s);
}
}
class Part3
{
public static void main(String args[])
{
A[] a=new A[3];
a[0]=new A("Java");
a[1]=new A("Python");
a[2]=new A("Cpp");
}
}
