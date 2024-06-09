package pingwit.dima.homework_6.task_8;
// отформатируй код
public class SequenceIdenticalArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 5, 6, 6, 6, 6, 6, 7};
        findLongestIdenticalSequence(array);
    }

    public static void findLongestIdenticalSequence(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Массив пуст или равен нулю");
            return;
        }

        int maxLength = 1;
        int currentLength = 1;
        int startIndex = 0;
        int maxStartIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] == array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStartIndex = startIndex;
                }
                currentLength = 1;
                startIndex = i;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStartIndex = startIndex;
            }
        System.out.println("Количество элементов самой длинной последовательности: " + maxLength);
        System.out.println("Индекс начального элемента последовательности: " + maxStartIndex);
    }
}
