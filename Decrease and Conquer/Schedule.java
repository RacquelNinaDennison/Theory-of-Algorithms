import java.util.Arrays;
import java.util.Scanner;

public class Schedule {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();

        int[][] planes = new int[size][2];
        for (int i = 0; i < size; i++) {
            planes[i][0] = input.nextInt();
            planes[i][1] = input.nextInt();
        }

        input.close();

        for (int j = 0; j < size; j++) {
            System.out.println(Arrays.toString(planes[j]));
        }
        BinarySearch(0, planes[size - 1][1], planes, size);

    }

    public static void BinarySearch(int start, int end, int[][] planes, int size) {
        int middle = 0;
        while (start <= end) {
            middle = (start + end - 1) / 2;
            int delays = caculateDelays(middle, planes, size);

            if (delays >= size) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }

        }
        System.out.println(start);

    }

    public static int caculateDelays(int delayTime, int[][] planes, int size) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (planes[i][0] <= planes[i][0] + delayTime && planes[i][0] + delayTime <= planes[i][1]) {
                count++;
            }
        }
        return count;
    }

}
