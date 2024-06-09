package pingwit.dima.homework_5.task_3;

import java.util.Scanner;

// сам решал?
public class ButterflyNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер бабочки: ");
        int size = scanner.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= 2 * size; j++) {
                if (j <= i || j > 2 * size - i) {
                    System.out.print(j <= size ? j : 2 * size - j + 1); // лучше не использовать такие сложные конструкции
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i = size; i >= 1; i--) {
            for (int j = 1; j <= 2 * size; j++) {
                if (j <= i || j > 2 * size - i) {
                    System.out.print(j <= size ? j : 2 * size - j + 1); // лучше не использовать такие сложные конструкции
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
