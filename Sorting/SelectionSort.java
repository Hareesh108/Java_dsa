public class SelectionSort {

    void sort(int arr[])
    {
        int size = arr.length;
        int temp,min;
        for(int i=0; i<size; ++i)
        {
            min = i;
            for(int j=i+1; j<size; ++j)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

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
