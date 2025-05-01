package shellsort;

public class ShellSort 
{
    public static void shellSort(int[] arr, int n) 
    {
        for (int gap = n; gap > 0; gap /= 2) 
        {
            for (int i = gap; i < n; i++) 
            {
                int temp = arr[i];
                int j = i;

                while (j >= gap && arr[j - gap] > temp) 
                {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                arr[j] = temp;
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
        shellSort(arr,n);
        System.out.println("Shell Sorted array:");
        print(arr);

    }
}
