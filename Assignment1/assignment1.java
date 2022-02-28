import java.util.Scanner;
class Student
{
    int rn[]=new int[10];
    String name[]=new String[10];
    int pn[]=new int[10];
    int age[]=new int[10];
    double cgpa[]=new double[10];
    public void details()
    {
        int i;
        Scanner imp=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            System.out.println("Enter name of the "+(i+1)+" Student");
            name[i]=imp.next();
            System.out.println("Enter Roll No of the "+(i+1)+" Student");
            rn[i]=imp.nextInt();
            System.out.println("Enter Phone No of the "+(i+1)+" Student");
            pn[i]=imp.nextInt();
            System.out.println("Enter Age of the "+(i+1)+" Student");
            age[i]=imp.nextInt();
            System.out.println("Enter CGPA of the "+(i+1)+" Student");
            cgpa[i]=imp.nextDouble();
            System.out.println();
        }
    }
    public void highest()
    {
        int i,k=0;
        double high=cgpa[0];
        for(i=1;i<10;i++)
        {
            if(cgpa[i]>high)
            {
                high=cgpa[i];
                k=i;
            }
        }
        System.out.println("Name of the Student with highest CGPA is "+name[k]);
    }
    public void phonenumber()
    {
        int i;
        String n1="ANU";
        for(i=0;i<10;i++)
        {
            if(name[i].equals(n1))
            {
                System.out.println("Phone No of the ANU is "+pn[i]);
                break;
            }
        }
    }
    public void rollno()
    {
        int i,k=0,ageys=age[0];
        for(i=1;i<10;i++)
        {
            if(age[i]<ageys)
            {
                ageys=age[i];
                k=i;
            }
        }
        System.out.println("Rollno of youngest student is "+rn[k]);
    }
}
public class assignment1
{
    public static void main(String args[])
    {
        Student obj=new Student();
        obj.details();
        obj.highest();
        obj.phonenumber();
        obj.rollno();
    }
}
