package pingwit.dima.homework_6.task_2;

public class ArrayArithmeticAverage {
    public static void main(String[] args) {
        int[] numbers = {5, 7, 8, 10};
        double result = 0;
        // 4 - если размер массива поменяется, то тебе придется менять число в цикле, подставь вместо 4 numbers.length
        for (int i = 0; i < 4; i++) // всегда добавляй фигурные скобки для циклов и if
            result = result + numbers[i];
        System.out.println("Среднее арифметическое: " + result / 4); // 4 - если размер массива поменяется, то тебе придется менять число в цикле, подставь вместо 4 numbers.length
    }
}
