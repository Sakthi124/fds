import java.io.*;
import java.util.*;
class exp8
{
public static void main(String args[])
{
String filename;
Scanner s=new Scanner(System.in);
System.out.println("Enter the filename:");
filename=s.nextLine();
File f1=new File(filename);
System.out.println("*******************");
System.out.println("FILE INFORMATION");
System.out.println("*******************");
System.out.println("NAME OF FILE:"+f1.getName());
System.out.println("PATH OF THE FILE:"+f1.getPath());
System.out.println("PARENT:"+f1.getParent());
if(f1.exists())
System.out.println("THE FILE EXISTS");
else
System.out.println(" THE FILE DOES NOT EXISTS");
if(f1.canRead())
System.out.println("THE FILE CAN BE READ");
else
System.out.println(" THE FILE CANNOT BE READ");
if(f1.canWrite())
System.out.println("WRITE OPERATION IS PERMITTED");
else
System.out.println("WRITE OPERATION IS NOT PERMITTED");
if(f1.isDirectory())
System.out.println("IT IS A DIRECTORY");
else
System.out.println("NOT A DIRECTORY");
if(f1.isFile())
System.out.println("IT IS A FILE");
elseSystem.out.println("NOT A FILE");
System.out.println("FILE LAST MODIFIED:"+f1.lastModified());
System.out.println("LENGTH OF THE FILE:"+f1.length());
System.out.println("FILE DELETED"+f1.delete());
}
}
