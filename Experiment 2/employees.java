import java.util.*;
class Employees
{
 int empno;
 String a;
 String phno;
 void read()
 {
  Scanner o=new Scanner(System.in);
  System.out.println("Enter employee no : ");
  empno=o.nextInt();
  System.out.println("Enter the Name : ");
  a=o.next();
  System.out.println("Enter the phone number");
  phno=o.next();
 }
 void display()
 {
  System.out.println("Employee id : "+empno);
  System.out.println("Name : "+a);
  System.out.println("Phone no : "+phno);
 }
 public static void main(String args[])
 {
  Employees e[]=new Employees[5];
  for(int i=0;i<5;i++)
  {
   e[i]=new Employees();
   e[i].read();
  }
  System.out.println("\n Data are :-");
  for(int i=0;i<5;i++)
  {
   e[i].display();
  }
 }
}