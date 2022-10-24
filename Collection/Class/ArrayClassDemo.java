package Collection.Class;

import java.util.Arrays;

public class ArrayClassDemo {

    public static void main(String[] args) {
        //It is implements on arrays

        int arr[] = {1,2,3,4,5,6,7,8,9};

        int index = Arrays.binarySearch(arr,5);//must be array sorted order
        System.out.println("5 is present index at " + index);

        int arr1[] = {12,55,11,66,4,44};
        Arrays.sort(arr1);
        for(int i : arr1){
            System.out.print(i + " ");
        }

        System.out.println();
        Arrays.fill(arr1,1);// this using when we want in array already have any value define
        for(int i : arr1){
            System.out.print(i + " ");
        }
    }
}
