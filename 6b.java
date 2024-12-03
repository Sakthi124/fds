Program:

class MyException extends Exception

{

String str1;

MyException(String str2)

{

str1=str2;

}

public String toString()

{

return("MyException occurred:"+str1);

}

}

class example

{

public static void main(String args[])

{

try

{

System.out.println("Starting of try block");

throw new MyException("this is my error message");

}

catch(MyException exp)

{

System.out.println("catch block");

System.out.println(exp);

}

}

}
