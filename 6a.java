Program:

import java.util.*;

class NegativeAmtException extends Exception

{

String msg;

NegativeAmtException(String msg)

{

this.msg=msg;

}

}

public class userdefined

{

public static void main(String args[])

{

Scanner s=new Scanner(System.in);

System.out.println("Enter amount:");

int a=s.nextInt();

try

{

if(a<0)

{

throw new NegativeAmtException("invalid amount");

}

System.out.println("amount deposited");

}

catch(NegativeAmtException e)

{

System.out.println(e);

}

}
}
