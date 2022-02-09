import java.util.Scanner;
class findsum
        {
                public static void main(String ary[])
                        {
                                int n,sum=0,i;
                                System.out.println("enter the number of element:");
                                Scanner obj= new Scanner(System.in);
				n=obj.nextInt();
                                int a[]=new int[n];
				System.out.println("enter the array element:");
                                for(i=0;i<n;i++)
                                        {
                                                a[i]=obj.nextInt();
						sum=sum+a[i];
                                        }
                                                System.out.println("\n the sum is:"+sum);

                        }
        }



