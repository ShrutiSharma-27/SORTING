//Bubble sort is a comparison sort as we compare adjacent element for sorting.
//With nth pass during bubble sort, the nth largest element comes to the nth last position.
//Also known as Sinking Sort and Exchange Sort.
//i will play a role of counter to do n-1 passes like whatever j is doing it has to do it n-1 times.
//n-1 times because the nth element at 0 index will automatically get seated on the right location.
//j will facilitate internal loop

//Stable sorted algorithm : when the original order is maintained for the values that are equal.
//Unstable sorted algorithm : when the original order is not maintained for the values that are equal.
//Example given was red-black balls with same value.
import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] test_arr = {100,78,-67,90,-1,2,11,3,0};
        BubbleSort(test_arr);
        System.out.println(Arrays.toString(test_arr));
    }

    static void BubbleSort(int[] arr){
        int n = arr.length ;
        boolean swapped ;
        //passes = n-1 times
        for (int i=0 ; i<(n-1) ; i++){ //for particular i, j will run for n-i-1 times to sort.
            swapped = false;
            //for each pass, the max element present in the unsorted part will come at last in that unsorted part
            //we'll not iterate over sorted part at the back
            for (int j=1 ; j<(n-i) ; j++){
                //compare and swap
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true ;
                }
            }
            //it means for this pass you haven't swapped for once so it means array is sorted now
            if (!swapped) break;
        }
    }
}

//space complexity is O(1) as no extra space is needed like copying the array, etc. : these type of algorithms are also
//called as "In-place sorting algorithms"

//time complexity : best case : O(n) : when array is sorted
//                : worst case : O(n^2) : when array is sorted in reverse order