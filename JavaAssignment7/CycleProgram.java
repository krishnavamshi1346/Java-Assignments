abstract class Cycle{
Cycle()
{
System.out.println("This is a Cycle Class");
}
abstract void balance();
}
class Unicycle extends Cycle
{
Unicycle()
{
System.out.println("This is a Unicycle Class");
}
void balance()
{
System.out.println("This is a balance method in Unicycle");
}
}
class Bicycle extends Cycle
{
Bicycle()
{
System.out.println("This is a Bicycle Class");
}
void balance()
{
System.out.println("This is a balance method in Bicycle");
}
}
/*class Tricycle extends Cycle
{
Tricycle()
{
System.out.println("This is a UniCycle Class");
}
//Produces error as it doesn't implement Balance Method
}*/
class CycleProgram
{
public static void main(String args[])
{
Cycle[] c=new Cycle[3];
c[0]=new Unicycle();
c[0].balance();
c[1]=new Bicycle();
c[1].balance();
//c[2]=new Tricycle();//Produces error
//c[2].balance();//Produces error as there is no balance method
}
}



