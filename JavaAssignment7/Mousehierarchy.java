abstract class Rodent{
Rodent()
{
System.out.println("This is Rodent Class");
}
abstract public void show();
};

class Mouse extends Rodent{
Mouse()
{
System.out.println("This is Mouse Class");
}
public void show()
{
System.out.println("This is method in Mouse Class");
}
};
class Gerbil extends Rodent{
Gerbil()
{
System.out.println("This is Gerbil Class");
}
public void show()
{
System.out.println("This is method in Gerbil Class");
}

};
class Hamster extends Rodent{
Hamster()
{
System.out.println("This is Hamster Class");
}
public void show()
{
System.out.println("This is method in Hamster Class");
}

};
class Mousehierarchy
{
public static void main(String args[])
{
Rodent[] r=new Rodent[3];
r[0]=new Mouse();
r[0].show();
r[1]=new Gerbil();
r[1].show();
r[2]=new Hamster();
r[2].show();
}
}


