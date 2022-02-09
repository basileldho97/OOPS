import java.util.Scanner;
class findsmallest
        {
                public static void main(String ary[])
                        {
                                int n,small,i;
                                System.out.println("enter the number of element:");
                                Scanner obj= new Scanner(System.in);
                                n=obj.nextInt();
                                int a[]=new int[n];
                                System.out.println("enter the array element:");
                                for(i=0;i<n;i++)
                                        {
                                                a[i]=obj.nextInt();
                                        }
				small=a[0];
				for(i=1;i<n;i++)
					{
						if(small>a[i])
						{
							small=a[i];
						}
					}
                                                System.out.println("\n smallest number:"+small);

                        }
        }


