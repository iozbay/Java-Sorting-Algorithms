package ınsertionsort;

public class InsertionSort 
{
    public static void insertionSort(int[] arr, int n)
    {
        for(int i=1; i<n; i++)
        {
            for(int j=i; j>0; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
    
    public static void print(int[] arr)
    {
        for(int i=0; i< arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void main(String[] args) 
    {
        int[] arr = {25, 11, 43, 67, 91, 55, 15};
        System.out.println("original array:");
        print(arr);
        System.out.println("\n------------------");

        int n = arr.length;
        insertionSort(arr,n);
        System.out.println("Insertion Sorted array:");
        print(arr);

    }
}
