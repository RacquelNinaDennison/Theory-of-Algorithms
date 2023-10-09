import java.util.Scanner;

public class Kth_smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kthIndex = input.nextInt();
        String trash = input.nextLine();
        String numbers1 = input.nextLine();
        String[] numbers1String = numbers1.split(" ");
        int[] numbers1Array = new int[numbers1String.length];
        int i = 0;
        for (String number : numbers1String) {
            int numberInt = (int) (Integer.parseInt(number));
            numbers1Array[i] = numberInt;
            i++;

        }
        String numbers2 = input.nextLine();
        String[] numbers2String = numbers2.split(" ");
        int[] numbers2Array = new int[numbers2String.length];
        int j = 0;
        for (String number : numbers2String) {
            int numberInt = (int) (Integer.parseInt(number));
            numbers2Array[j] = numberInt;
            j++;

        }
        input.close();
        if (numbers1Array.length > numbers2Array.length) {
            System.out.println(binarySearch(numbers2Array, numbers1Array, kthIndex));
        } else {
            System.out.println(binarySearch(numbers1Array, numbers2Array, kthIndex));
        }
    }

    public static int binarySearch(int[] arrayOne, int[] arrayTwo, int kthIndex) {
        int low = 0;
        int high =arrayOne.length;
        while (low <= high) {
            int middle = (high-low)/2;
            int middle2 = kthIndex - middle-2;
            int lower1 = arrayOne[middle];
            int lower2 = middle2 >= 0 ? arrayTwo[middle2] : Integer.MIN_VALUE; // compare the values to ensure they
                                                                                   // are
                                                                                   // minumim
            int right1 = middle + 1 < arrayOne.length ? arrayOne[middle + 1] : Integer.MAX_VALUE;
            int right2 = middle2 + 1 < arrayTwo.length ? arrayTwo[middle2 + 1] : Integer.MAX_VALUE;
            if (lower1 <= right2 && lower2 <= right1) {
                return Math.max(lower1, lower2);
            } else if (lower1 >= right2) {
                high = middle;

            } else {
                low = middle + 1;
            }

        }
        return arrayTwo[kthIndex - 1];
    }
}