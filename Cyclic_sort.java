//V.V.V.V.V. important : if unsorted array contains number from 1 to n (or a mention of range from 1 to n) then apply CYCLIC SORT

import java.util.Arrays;

public class Cyclic_sort {
    public static void main(String[] args) {
        int[] test_arr = {5,3,2,4,1};
        CyclicSort(test_arr);
        System.out.println(Arrays.toString(test_arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void CyclicSort(int[] arr){
        int n=arr.length;
        int i=0;
        while (i<n){
            if(arr[i] != (i+1)) swap(arr, arr[i]-1 ,i);
            else i++;
        }
    }
}

//time complexity : worst case : O(n) : in worst case, n-1 swaps and after sorting n comparisons (like is 1 at its correct position, 2, 3..,n)
//space complexity : O(1)