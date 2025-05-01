package selectionsort;

public class SelectionSort 
{
    public static void selectionSort(int[] arr,int n)
    {
        int temp;
        int min;
        for(int i=0; i<n-1; i++)
        {
            min = i;
            for(int j=i; j<n; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            
            temp = arr[i];
            arr[i] = arr[min];
            arr[min]= temp;
        }
        
    }
    public static void print(int[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    
    public static void main(String[] args) {
        int[] arr = {25, 11, 43, 67, 91, 55, 15};
        System.out.println("original array:");
        print(arr);
        System.out.println("\n------------------");
        
        int n = arr.length;
        selectionSort(arr,n);
        System.out.println("Selection Sorted array:");
        print(arr);

    }
}
