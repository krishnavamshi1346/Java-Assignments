abstract class Cycle{
Cycle()
{
System.out.println("This is a Cycle Class");
}
abstract void code();
abstract void factory();
}
class Unicycle extends Cycle
{
Unicycle()
{
System.out.println("This is a Unicycle Class");
}
public void code()
{
factory();
}
public void factory()
{
System.out.println("This is a Unicycle Factory");

}

}
class Bicycle extends Cycle
{
Bicycle()
{
System.out.println("This is a Bicycle Class");
}
public void code()
{
factory();
}
public void factory()
{
System.out.println("This is a Bicycle Factory");

}
}
class Tricycle extends Cycle
{
Tricycle()
{
System.out.println("This is a UniCycle Class");
}
public void code()
{
factory();
}
public void factory()
{
System.out.println("This is a Tricycle Factory");

}

}
class CycleProgram
{
public static void main(String args[])
{
Cycle[] c=new Cycle[3];
c[0]=new Unicycle();
c[0].code();
c[1]=new Bicycle();
c[1].code();
c[2]=new Tricycle();
c[2].code();
}
}



