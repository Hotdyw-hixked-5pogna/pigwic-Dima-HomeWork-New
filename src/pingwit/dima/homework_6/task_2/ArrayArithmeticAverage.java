package pingwit.dima.homework_6.task_2;

public class ArrayArithmeticAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 8, 10};
        double result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result = result + numbers[i];
        }
        System.out.println("Среднее арифметическое: " + result / numbers.length);
    }
}
