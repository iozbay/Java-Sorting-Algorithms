package bubblesort;

public class BubbleSort 
{
    public static void bubbleSort(int[] arr)
    {
        int temp;
        for(int i=1; i< arr.length; i++)
        {
            for(int j=0; j< arr.length-i ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
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

        bubbleSort(arr);
        System.out.println("Bubble Sorted array:");
        print(arr);

    }
}
