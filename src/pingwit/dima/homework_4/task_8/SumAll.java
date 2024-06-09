package pingwit.dima.homework_4.task_8;

public class SumAll {
    public static void main(String[] args) {
        int sumEven = 0;
        int sumOdd = 0;
        int numbers = 100;
        int totalSum = 0;
        for (int i = 0; i <= numbers; i++) {
            totalSum += i; // totalSum лучше посчитать 1 раз после выхода из цикла сложив четные и нечетные числа
            if (i % 2 == 0) {
                sumEven += i;
            } else {
                sumOdd += i;

                System.out.println(i);
            }
        }
        System.out.println("Сумма нечетных чисел: " + sumOdd);
        System.out.println("Сумма четных чисел: " + sumEven);
        System.out.println("Сумма всех чисел: " + totalSum);
    }
}