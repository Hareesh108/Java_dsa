public class InsertionSort {
    
    void sort(int arr[])
    {
        int size = arr.length;
        int key;
        for(int i=0; i<size; ++i)
        {
            key = arr[i];
            int j = i;
            while(arr[i-1] > key && j >= 1)
            {
                arr[i] = arr[j-1];
                j--;
            }
            arr[j] = key;
        }

        for (int i=0; i<size; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        ob.bubbleSort(arr);

    }
}
