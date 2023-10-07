// implementaion of merge sort - this has a O(n) time

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        int[] unsorted = {38,27,43,3,9,82,10};
        System.out.println(Arrays.toString(unsorted));
   MergeSort mergeSortMethod = new MergeSort();
   int[] sorted = mergeSortMethod.mergeSort(unsorted);
   System.out.println(Arrays.toString(sorted));
    }

    public static int[] getSliceOfArray(int[] arr,
    int start, int end)
{

// Get the slice of the Array
int[] slice = new int[end - start];

// Copy elements of arr to slice
for (int i = 0; i < slice.length; i++) {
slice[i] = arr[start + i];
}

// return the slice
return slice;
}
    public int[] mergeSort(int[] arr){
       if(arr.length ==1){
        return arr;
       }
      int middle = (arr.length)/2;
      int[] left = getSliceOfArray(arr,0,middle);
      int[] right = getSliceOfArray(arr,middle,arr.length);
      int[] leftSort = mergeSort(left);
      int[] rightSort = mergeSort(right);
      return merge(leftSort, rightSort);
    }

    public int[] merge(int[] left, int[] right){
        int lengthOfArray = left.length + right.length;
        int[] result = new int[lengthOfArray];
        int leftpointer = 0;
        int rightpointer =0;
        int i =0;
        while(leftpointer < left.length & rightpointer < right.length){
            if(left[leftpointer] <= right[rightpointer]){
                result[i] = left[leftpointer];
                leftpointer++;
                i++;
            }
            else{
                result[i] = right[rightpointer]; 
                rightpointer++;
                i++;
            }

        }
        if(leftpointer<left.length){
            for(int j =leftpointer; j<left.length; j++){
                result[i] = left[j];
                i++;
            }
        }
        if(rightpointer<right.length){
            for(int j =rightpointer; j<right.length; j++){
                result[i] = right[j];
                i++;
            }
        }
        return result;

    }
    
}
