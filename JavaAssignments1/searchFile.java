import java.io.*;
import java.util.*;
class searchFile
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
find("/home/krisva",str);
}
public static void find(String path,String find)
{
File directory=new File(path);
File[] files=directory.listFiles();
if(files!=null && files.length>0)
{
for(File file:files)
{
if(file.isDirectory()){
find(file.getAbsolutePath(),find); 
}
else{
String newfile=file.getName();
if(newfile.matches(".*\\b\\b"))
{
String st=file.getAbsolutePath()+"."+newfile;
if(st.contains(find))
{
System.out.println(file.getAbsolutePath()+" "+newfile);
}
}
}
}
}
}
}


