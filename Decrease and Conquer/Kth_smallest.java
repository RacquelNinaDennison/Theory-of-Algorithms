import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kth_smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kth_smallest = input.nextInt();
        String trash = input.nextLine();
        String numbers1 = input.nextLine();
        String[] numbers1String = numbers1.split(" ");
        int[] numbers1Array = new int[numbers1String.length];
        int i=0;
        for (String number : numbers1String) {
            int numberInt = (int)(Integer.parseInt(number));
            numbers1Array[i]=numberInt;
            i++;
           

        }
        String numbers2 = input.nextLine();
        String[] numbers2String = numbers2.split(" ");
        int[] numbers2Array = new int[numbers2String.length];
        int j=0;
        for (String number : numbers2String) {
            int numberInt = (int)(Integer.parseInt(number));
            numbers2Array[j]=numberInt;
            j++;

        }
        System.out.println(Arrays.toString(numbers1Array));
        System.out.println(Arrays.toString(numbers2Array)); 

      
        
    }
}