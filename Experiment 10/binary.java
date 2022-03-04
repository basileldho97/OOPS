import java.util.Scanner;
class binary 
{
    int binarySearch(int array[], int n, int element ) 
    {
	int low=0,high=n-1,mid;
	while (low <= high) 
    	{
	    mid = (low + high)/ 2;
	    if (array[mid] == element)
		return (mid+1);;
      	    else if (array[mid] < element)
            	low = mid + 1;
      	    else
            	high = mid - 1; 
    	}
    	return -1;
    }
    public static void main(String args[]) 
    {
	binary obj = new binary();
	Scanner input = new Scanner(System.in);
    	int n = array.length;
	System.out.print("Enter the size:");
	int n=input.nextInt();
	int[] array = new int[n];
	System.out.print("Enter the elements:");
	for(int i=0;i<n;i++)
	    array[i] = input.nextInt();
	System.out.println("Enter element to be searched:");
    	int element = input.nextInt();
    	int result = obj.binarySearch(array, n, element);
    	if (result == -1)
      	    System.out.println("Not found");
    	else
	    System.out.println("Element found at index " + result);
    }
}