package pingwit.dima.homework_6.task_8;

import java.util.Arrays; // этот импорт не используется, удали

// отформатируй код
public class SequenceIdenticalArrayElements {
    public static void main(String[] args) {
        int[] array = {1}; // если массив пустой {}, то падает ошибка, если массив из одного элемента, например, {1}, то индекс -1. Подумай как это исправить

        int maxCount = 0;
        int maxElement = 0; // эта переменная не используется, можно удалить
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
