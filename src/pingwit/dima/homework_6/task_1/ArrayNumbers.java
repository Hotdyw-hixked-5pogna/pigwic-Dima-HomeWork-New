package pingwit.dima.homework_6.task_1;

import java.util.Scanner;

// очень хорошо
public class ArrayNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Введите " + size + " числа:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sum = 0;
        int smallest = numbers[0];
        int largest = numbers[0];
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
            if (numbers[i] > largest) {
                largest = numbers[i];

            }
        }
        System.out.println("Сумма все чисел:" + sum);
        System.out.println("Наименьшее число:" + smallest);
        System.out.println("Наибольшее число:" + largest);
        scanner.close();
    }
}
