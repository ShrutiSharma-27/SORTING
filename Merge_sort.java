//Merge sort uses recursion.
//Steps : 1.Divide array into 2 parts ; 2.Get both parts sorted by recursion ; 3.Merge 2 sorted parts

import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr1 = {8,5,34,2,0,8,25,1};
        int[] solution = mergeSort(arr1);
        System.out.println(Arrays.toString(solution));
    }

    static int[] mergeSort(int[] arr){
        if (arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0, mid)) ; //mid is excluded
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid, arr.length)) ; //arr.length is excluded

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second){
        int[] combined = new int[first.length + second.length];
        int i=0;
        int j=0;
        int k=0;

        while (i<first.length && j<second.length){
            if (first[i]<second[j]){
                combined[k] = first[i];
                i++;
            }
            else{
                combined[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            combined[k] = first[i];
            i++; k++;
        }

        while(j<second.length){
            combined[k] = second[j];
            j++; k++;
        }
        return combined;
    }
}

//Output : 
//[0, 1, 2, 5, 8, 8, 25, 34]

//time complexity = O(nlogn)

// Recurrennce Relation :
// T(n) = 2T(n/2) + (n-1)
// where (n-1) are the number of comparisons
// Simplified : T(n) = 2T(n/2) + O(n) 
