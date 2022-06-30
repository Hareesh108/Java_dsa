public class MergeSort1 {
    public static void conquer(int arr[], int low, int mid, int high) {
        int newArr[] = new int[high - low + 1];

        int idx1 = low;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= high) {
            if (arr[idx1] <= arr[idx2])
                newArr[x++] = arr[idx1++];
            else
                newArr[x++] = arr[idx2++];
        }

        while (idx1 <= mid)
            newArr[x++] = arr[idx1++];

        while (idx2 <= high)
            newArr[x++] = arr[idx2++];

        for (int i = 0, j = low; i < newArr.length; i++, j++) {
            arr[j] = newArr[i];
        }
    }

    public static void divide(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = low + (high - low) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);

        conquer(arr, low, mid, high);
    }

    public static void main(String args[]) {
        int arr[] = { 10, 5, 25, 15, 95, 40, 30 };
        int n = arr.length;
        divide(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}