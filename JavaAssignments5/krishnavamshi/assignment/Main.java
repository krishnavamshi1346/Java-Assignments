package krishnavamshi.assignment.main;
import krishnavamshi.assignment.data.First;
import krishnavamshi.assignment.singleton.Second;

class Main
{
public static void main(String args[])
{
First f=new First();
f.display();
f.local();
Second s=new Second("Python");
System.out.println(s.method("Java"));
s.show();
}
}
