import java.util.*;
import java.io.File;
import java.io.*;
class ReadWrite{
HashMap< Character,Integer > Map=new HashMap< Character,Integer >();
public void readfile()
{
try{
FileReader f=new FileReader("/home/krisva/Desktop/Training/JavaAssignments/JavaAssignment11/file1.txt");
int index;
while((index=f.read())!=-1)
{
if(!Character.isWhitespace((char)index))
{
if(Map.containsKey((char) index))
{
Map.put((char)index,Map.get((char)index)+1);
}
else
{
Map.put((char)index,1);
}
}
}
f.close();
writefile();
}

catch (Exception e) {
			e.printStackTrace();
		}
}
public void writefile()
{
try{
FileWriter f=new FileWriter("/home/krisva/Desktop/Training/JavaAssignments/JavaAssignment11/file2.txt");
f.write(Map.toString());
f.close();
}
catch (Exception e) {
			e.printStackTrace();
		}
}
public static void main(String args[])
{
ReadWrite r=new ReadWrite();
r.readfile();
r.writefile();
}
}


