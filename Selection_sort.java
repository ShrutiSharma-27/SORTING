//Selection sort : select an element and put it at its right position.
//Can do either way : pick maximum or minimum element
//Not a stable algorithm
//Use case : it performs well with small lists/arrays

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] test_arr = {100,78,-67,90,-1,2,11,3,0};
        SelectionSort(test_arr);
        System.out.println(Arrays.toString(test_arr));
    }

    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static int Max(int[] arr, int tillIndex){
        int max = arr[0];
        int maxIndex=0;
        for (int j = 0 ; j<=tillIndex ; j++) {//till n-i-1 index
            if (arr[j] > max) {
                max = arr[j];
                maxIndex = j;
            }
        }
        return maxIndex ;
    }

    static void SelectionSort(int[] arr){
        int n = arr.length ;
        for (int i=0 ; i<n-1 ; i++){
            int last = n-i-1; //last index in unsorted array
            swap(arr, Max(arr, last), last);
        }
    }
}

//Output : 
//[-67, -1, 0, 2, 3, 11, 78, 90, 100]

//time complexity is O(n^2) : for worst, average and best case as well
//step 1 : n-1 comparisons (finding max element)
//step 2 : n-2 comparisons (length of unsorted array = n-1 so comparisons needed to find max are n-2)
//           .
//           .
//           1 comparison
//           0 comparison
// total comparisons = sum of above and hence give us O(n^2) time complexity

// space complexity : O(1)
