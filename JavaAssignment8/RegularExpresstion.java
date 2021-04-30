import java.util.*;
public class RegularExpression
{ 
    public void Check(String s1) {
        String regexPattern="[A-Z].*[.]";
        boolean expr=Pattern.matches(regexPattern, s1);
        if(expr){
        System.out.println(" The given pattern matches the regex: "+expr);
        }
        else{
        System.out.println("The given pattern does not matches the regex: "+expr);  
        }
    }
  
    public static void main(String[] args) 
    { 
        String s1; 
        Scanner in = new Scanner(System.in);
        System.out.println(" Enter the string: ");
        s1 = in.nextLine();
        RegularExpression obj = new RegularExpression();
        obj.Check(s1); 
    } 
} 
