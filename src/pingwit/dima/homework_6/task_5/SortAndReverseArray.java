package pingwit.dima.homework_6.task_5;

import java.util.Arrays;

public class SortAndReverseArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 8, 1, 2, 4};
        int start = 0;
        int end = array.length - 1;
        Arrays.sort(array);

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        System.out.println("Отсортированый и реверсированый массив: " + Arrays.toString(array));
    }
}