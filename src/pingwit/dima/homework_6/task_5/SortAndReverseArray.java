package pingwit.dima.homework_6.task_5;

public class SortAndReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.print("Оригинальный массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int n = array.length; // n - придумай хорошее название для переменной
        for (int i = 0; i < n / 2; i++) {

            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }
        System.out.print("Инвертированый массив: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}