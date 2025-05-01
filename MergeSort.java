package mergesort;

public class MergeSort {

    public static void merge_sort(int[] arr, int left, int right) {
        if (left < right) {
            int midd = (left + right) / 2;
            merge_sort(arr, left, midd);
            merge_sort(arr, midd + 1, right);
            merge(arr, left, midd, right);
        }

    }

    public static void merge(int[] arr, int left, int midd, int right) {
        int n1 = midd - left + 1;
        int n2 = right - midd;

        int[] a1 = new int[n1];
        int[] a2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            a1[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            a2[j] = arr[midd + 1 + j];
        }

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (a1[i] < a2[j]) {
                arr[k] = a1[i];
                i++;
            } else {
                arr[k] = a2[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = a1[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = a2[j];
            j++;
            k++;
        }

    }

    public static void main(String[] args) 
    {

        int [] arr = {5,6,1,4,2,7};
        System.out.println("Original array:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        merge_sort(arr,0,arr.length-1);
        
        System.out.println("Merge Sorted array:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        
    }
}
