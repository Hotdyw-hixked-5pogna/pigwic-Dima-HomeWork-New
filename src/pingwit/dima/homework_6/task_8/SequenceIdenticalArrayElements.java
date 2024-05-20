package pingwit.dima.homework_6.task_8;

import java.util.Arrays;


public class SequenceIdenticalArrayElements {
    public static void main(String[] args) {
        int[] array = {0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0,};

        int maxCount = 0;
        int maxElement = 0;
        int maxStartIndex = -1;

        int currentCount = 1;
        int currentElement = array[0];
        int currentStartIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == currentElement) {
                currentCount++;
            }
            else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    maxElement = currentElement;
                    maxStartIndex = currentStartIndex;
                }
                currentElement = array[i];
                currentCount = 1;
                currentStartIndex = i;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxElement = currentElement;
                maxStartIndex = currentStartIndex;
            }
        }
        System.out.println("Количество элементов самой длинной последовательности: " + maxCount);
        System.out.println("Индекс начального элемента последовательности: " + maxStartIndex);
    }
}
