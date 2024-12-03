

import java.util.*;

abstract class Shape

{

int a,b;

abstract void printArea();

}

class Rectangle extends Shape

{

void printArea()

{

System.out.println("\t\tCalculating Area of Rectangle");

Scanner input=new Scanner(System.in);

System.out.print("Enter length: ");

a=input.nextInt();

System.out.print("\nEnter breadth: ");

b=input.nextInt();

int area=a*b;

System.out.println("Area of Rectangle: "+area);

}

}

class Triangle extends Shape

{

void printArea()

{

System.out.println("\t\tCalculating Area of Triangle");

Scanner input=new Scanner(System.in);

System.out.print("Enter height: ");

a=input.nextInt();

System.out.println("\nEnter breadth: ");

b=input.nextInt();

double area=0.5*a*b;

System.out.println("Area of Triangle: "+area);

}
}
class Circle extends Shape

{

void printArea()

{

System.out.println("\t\tCalculating Area of Circle");

Scanner input=new Scanner(System.in);

System.out.print("Enter radius: ");

a=input.nextInt();

double area=3.14*a*a;

System.out.println("Area of Circle: "+area);

}

}

class AbstractArea

{

public static void main(String[] args)

{

Shape obj;

obj=new Rectangle();

obj.printArea();

obj=new Triangle();

obj.printArea();

obj=new Circle();

obj.printArea();

}

}
