package pingwit.dima.homework_5.task_3;

import java.util.Scanner;
// отформатируй код
public class ButterflyNew {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размер бабочки (нечетное число):");
            int n = scanner.nextInt();
            scanner.close();

            if (n % 2 == 0) {
                System.out.println("Пожалуйста введите нечетное число размера бабочки");
                return;
            }
            for (int i = 1; i <= n; i++) { // попробуй решить эту задачу используя только 2 цикла
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                for (int j = 1; j <= 2 * (n - i); j++) {
                    System.out.print("  ");
                }
                for (int j = i; j >= 1; j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
