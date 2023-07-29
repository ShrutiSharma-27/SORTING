//Insertion sort is like we're partially sorting the array
//The first element on the RHS is placed on it's correct position on the LHS
//It's like first two elements are sorted then first 3 elements are sorted and so on.
//This sorted side is called LHS
//i=0: it is pass number 1 and it will sort the array till index 1 : loop for i will run from 0 to (n-2)
//i is for outer loop
//j=i+1 and at every step it indicates the index till which the array needs to be sorted
//also it confirms that i can't take value n-2+1 = n-1 as it will make j = n which is index out of bound
//Currently the sorting algorithms we are studying are not good with dealing large data (quick sort and merge sort are there for that purpose)
//Very high possibility that if a language has an inbuilt sorting method then it will use insertion sort in collaboration with other sorting algorithms.

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] test_arr = {100,78,-67,90,-1,2,11,3,0};
        InsertionSort(test_arr);
        System.out.println(Arrays.toString(test_arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void InsertionSort(int[] arr) {
        int n=arr.length;
        for (int i=0 ; i<=(n-2) ; i++){
            for (int j=i+1 ; j>0 ; j--){
                if (arr[j] < arr[j-1]) swap(arr, j, j-1);
                else break;
            }
        }
    }
}

//Output :
//[-67, -1, 0, 2, 3, 11, 78, 90, 100]

//time complexity :
//worst case : O(n^2) : 1+2+3+...+(n-1) comparisons to sort an array of reverse order.
//best case : O(n) : linear : as total comparisons made are n-1 when array is already sorted : this is special about this algorithm

//space complexity : O(1), as it has sorting in place.

//why to use insertion sort ?
//* ADAPTIVE : steps are reduced if array is sorted (if j is not smaller then j-1 then break the loop)
//* Number of swaps reduced as compared to bubble sort.
//* It's a stable algorithm.
//* Used for smaller values of n and works good when array is partially sorted (some parts of it are sorted)
//* It takes part in hybrid sorting algorithm. (used along with combination of quick and merge sort for parts of data)
