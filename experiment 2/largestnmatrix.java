import java.util.Scanner;
class largestnmatrix
        {
                public static void main(String ary[])
                        {
                                int n,m,i,j,lar=0;
				int a[][]=new int[20][20];
                                System.out.println("enter the number of rows in the mattrix:");
                                Scanner obj= new Scanner(System.in);
                                m=obj.nextInt();
                                System.out.println("enter the number of columns in the matrix:");
				n=obj.nextInt();
				System.out.println("enter the elementg of the matrix:");
                                for(i=0;i<m;i++)
                                        {
					for(j=0;j<n;j++)
						{
                                                a[i][j]=obj.nextInt();
						}
					lar=a[i][j];
                                        }
				for(i=0;i<m;i++)
					{
					for(j=0;j<n;j++)
						if(a[i][j]>lar)
							lar=a[i][j];
					}
                                       System.out.println("the largest element in the matrix is:"+lar);

                        }
        }


