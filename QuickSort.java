package quicksort;

public class QuickSort 
{
    public static void ouickSort(int [] arr , int left , int right)
    {
        int i= left;
        int j = right;
        int pivot = arr[(left+right)/2];
        
        while(i<=j)
        {
            while (arr[i] < pivot)
            {
                i++;
            }
            
            while(arr[j]>pivot)
            {
                j--;
            }
            
            if(i<=j)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
        
        if(left < j)
        {
            ouickSort(arr,left,j);
        }
        
        if(i<right)
        {
            ouickSort(arr,i,right);
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
        int [] arr = {25,11,43,67,91,55,15};
        System.out.println("original array:");
        print(arr);
        System.out.println("\n------------------");
        ouickSort(arr,0 , arr.length -1);
        System.out.println("Quick Sorted array:");
        print(arr);

    }
}
