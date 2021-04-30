class A extends Exception
{
public A(String str){
super(str);
}
}
class B extends Exception
{
public B(String str){
super(str);
}
}

class C extends Exception
{
public C(String str){
super(str);
}
}
class Handler{
public void verify(int a,int b,int c) throws A,B,C
{
if(a<100)
{
throw new A("This is First type of exception.A value is less than 100");
}
if(b<100)
{
throw new B("This is Second type of exception.B value is less than 100");
}
if(c<100)
{
throw new C("This is Third type of exception.C value is less than 100");
}
}
}
class ExcpetionHandling
{
public static void main(String args[])
{
try{
Handler h =new Handler();
h.verify(10,20,30);
}
catch(A | B | C  e)
{
System.out.println(e.getMessage());
//System.out.println(e);

} 
finally
{
System.out.println("This is finally block");

}
}
}

