Program:

import java.util.Scanner;

public class SelectionSort

{

 public static void main(String args[])

 {

 int size,i,j,temp;

 int arr[]=new int[50];

 Scanner scan=new Scanner(System.in);

 System.out.println("Enter array size");

 size=scan.nextInt();

 System.out.println("Enter array elements");

 for(i=0;i<size;i++)

 arr[i]=scan.nextInt();

 System.out.println("Sorting array using selection sort");

 for(i=0;i<size;i++)

 {

 for(j=i+1;j<size;j++)

 {

 if(arr[i]>arr[j])

 {

 temp=arr[i];

 arr[i]=arr[j];

 arr[j]=temp;

 }

 }

 }
    System.out.println("Array after sorting");

 for(i=0;i<size;i++)

 System.out.println(arr[i]+" ");

 }

}
