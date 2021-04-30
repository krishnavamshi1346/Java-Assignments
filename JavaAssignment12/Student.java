import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.*;

class Student{
private int id;
private int age;
private String name;
private String gender;
private String engDepartment;
private int year_of_enrollment ;
private double perTillDate;
public Student(int id ,  String name ,int age, String gender , String engDepartment, int year_of_enrollment ,double perTillDate)
{
this.id=id;
this.name=name;
this.age=age;
this.gender=gender;
this.engDepartment=engDepartment;
this.year_of_enrollment=year_of_enrollment;
this.perTillDate=perTillDate;
}
public static void query1(ArrayList<Student> list)
{
list.stream().map(x->x.engDepartment).distinct().forEach(System.out::println);
}
public static void query2(ArrayList<Student> list)
{
list.stream().filter(x->x.year_of_enrollment>2018).forEach(x->System.out.println(x.name));
}
public static void query3(ArrayList<Student> list)
{
        list.stream()
                .filter(x -> x.engDepartment.equalsIgnoreCase("Computer Science"))
                .filter(x -> x.gender.equalsIgnoreCase("male"))
                .forEach(x -> System.out.println(x.name));

}
public static void query4(ArrayList<Student> list)
{
list.stream().collect(groupingBy(Student::getGender)).forEach((x,y) -> System.out.println("Count of "+x+"is"+y.size()));
}
public static void query5(ArrayList<Student> list)
{list.stream().collect(groupingBy(Student::getGender, averagingInt(Student::getAge))).forEach((x,y) -> System.out.println("Average age of "+ x + "is" +y));
}
        

public static void query6(ArrayList<Student> list)
{
list.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student :: getMarks))).toString();
}
public static void query7(ArrayList<Student> list)
{
list.stream().collect(groupingBy(Student::getDept)).forEach((x,y)->System.out.println("Count of " +x + " is "+ y.size()));
}
public static void query8(ArrayList<Student> list)
{
list.stream().collect(groupingBy(Student::getDept , averagingDouble(Student::getMarks))).forEach((x,y) -> System.out.println("Averae percentage for " + x + "is" + y));
        
}
    public static String query9(ArrayList<Student> list) {
        return list.stream()
                .filter(x -> x.gender.equals("Male"))
                .filter(x -> x.engDepartment.equalsIgnoreCase("Electronic"))
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge))).toString();
    }

    public static void query10(ArrayList<Student> list) {
        list.stream()
                .filter(x -> x.engDepartment.equalsIgnoreCase("computer science"))
                .collect(Collectors.groupingBy(Student::getGender))
                .forEach((x, y) -> System.out.println("No of " + x + " in Computer Science is " + y.size()));
    }
    public String toString() {
        return this.name + " " + this.engDepartment + " " + this.age + " " + this.gender;
    }

    public String getGender() {
        return this.gender;
    }

    public int getAge() {
        return this.age;
    }

    public String getDept() {
        return this.engDepartment;
    }

    public double getMarks() {
        return this.perTillDate;
    }

public static void main(String args[])
{
ArrayList<Student> list=new ArrayList<Student>();
list.add(new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8));
        list.add(new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2));
        list.add(new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3));
        list.add(new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80));
        list.add(new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70));
        list.add(new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70));
        list.add(new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70));
        list.add(new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80));
        list.add(new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85));
        list.add(new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82));
        list.add(new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83));
        list.add(new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4));
        list.add(new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6));
        list.add(new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8));
        list.add(new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4));
        list.add(new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4));
        list.add(new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5));
System.out.println("Query 1");
query1(list);
System.out.println("Query 2");
query2(list);
System.out.println("Query 3");
query3(list);
System.out.println("Query 4");
query4(list);
System.out.println("Query 5");
query5(list);
System.out.println("Query 6");
query6(list);
System.out.println("Query 7");
query7(list);
System.out.println("Query 8");
query8(list);
System.out.println("Query 9");
        System.out.println("Details Of young student"+query9(list).substring(8));

System.out.println("Query 10");
query10(list);

}
}
