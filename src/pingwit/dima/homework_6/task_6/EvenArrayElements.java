package pingwit.dima.homework_6.task_6;

public class EvenArrayElements {
    public static void main(String[] args) {
        int[] originalArray = {5, 3, 8, 1, 2, 4};
        int evenCount = 0;
        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }
        int[] evenArray = new int[evenCount];
        int index = 0;
        for (int num : originalArray) {
            if (num % 2 == 0) {
                evenArray[index++] = num;
            }
        }
        System.out.print("Чётный элементы массива: ");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
    }
}
