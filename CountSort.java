package countSort;

import java.util.Arrays;
import java.util.Scanner;

public class CountSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        System.out.println("Enter array elements");
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println(Arrays.toString(countSort(array)));

    }

    public static int[] countSort(int[] array) {
        int max = Arrays.stream(array).max().getAsInt();
        int[] count = new int[max + 1];
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        int[] sorted = new int[array.length];
        int i = 0;
        for (int j = 0; j <= max; j++) {
            for (int k = 0; k < count[j]; k++) {
                sorted[i++] = j;
            }
        }
        return sorted;
    }

}
