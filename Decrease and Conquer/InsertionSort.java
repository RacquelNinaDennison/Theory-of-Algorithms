// this sorting method follows the techique that given a set of elements, it assumes that A[n-2] is sorted
// this has a time complexity of O(n) at best 
// and a time complexity of O(n^2) as the worst time complexity 

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort{
    public static void main(String[] args){
        int[] array = {89,45,68,90,24,34,17};
        System.out.println(Arrays.toString(array));
        sortTheArrayPlease(array);
        System.out.println(Arrays.toString(array));
        
        
        
    }

    public static void swop(int[] array , int i , int j){
        int temp = array[i];
        array[i]= array[j];
        array[j]= temp;
    }
    public static void sortTheArrayPlease(int[] array){

        for(int i =0; i< array.length; i++){
            int value = array[i];
            int j = i-1;
            while(j>=0 && array[j]> value){
              
                swop(array, j, j+1);
               
                j--;
            }
            value = array[j+1];
        }

      

    }
    
}