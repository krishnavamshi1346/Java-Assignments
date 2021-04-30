import java.io.*;
import java.util.*;
class containsAllAlphabets
{
public  static boolean checkAllAlphabets(String input)
{
        int index = 0;
        boolean[] visited = new boolean[26];

        for (int id = 0; id < input.length(); id++) {
            if ('a' <= input.charAt(id) && input.charAt(id) <= 'z') {
                index = input.charAt(id) - 'a';
            } else if ('A' <= input.charAt(id) && input.charAt(id) <= 'Z') {
                index = input.charAt(id) - 'A';
            }
            visited[index] = true;
        }

        for (int id = 0; id < 26; id++) {
            if (!visited[id]) {
                return false;
            }
        }
        return true;
    }
    
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
boolean check=checkAllAlphabets(s);
if(check==true)
{
System.out.println("String  contain all the alphabets");
}
else{
System.out.println("String Doesn't contain  all the alphabets");

}

}
}
