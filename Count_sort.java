//Non-comparison sorting algorithm.
//good for small numbers (elements in the array)
//take an array of size = largest element + 1
//now, every index in new array will indicate the element in original array
//traverse the original array and as you encounter an element -> increment the value at that particular index = element in new array.
//this new array is called frequency array

import java.util.Arrays;

public class Count_sort {
    public static void main(String[] args) {
        int[] arr = {3,4,3,2,0,0};
        countingSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countingSort(int[] arr){
        int[] frequency_arr = new int[findMax(arr)+1];
        for (int i : arr){
            frequency_arr[i]++;
        }

        int j=0; //starting index of original array
        for(int i=0; i<frequency_arr.length; i++){ //traversing frequency array
            if (frequency_arr[i] != 0){
                for(int k=0; k<frequency_arr[i]; k++){
                    arr[j]=i;
                    j++;
                }
            }
        }
    }

    static int findMax(int[] arr){
        int max = arr[0];
        for(int i : arr){
            if(i>max) max=i;
        }
        return max;
    }
}

//Output :

[0, 0, 2, 3, 3, 4]

//Time Complexity : O(N+M) , N-size of original arr ; M-size of frequency arr
//Auxiliary Space Complexity : O(M) 
