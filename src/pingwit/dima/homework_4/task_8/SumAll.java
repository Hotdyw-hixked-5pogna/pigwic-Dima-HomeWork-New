package pingwit.dima.homework_4.task_8;

public class SumAll {
    public static void main(String[] args) {
//эту строка не нужна
        int sumEven = 0;
        int sumOdd = 0;
        int numbers = 100;
        for (int i = 1; i <= numbers; i++) { // ты можешь считать четные и нечетные числа внутри одного цикла, второй цикл (строки 16-22 не нужен)
            if (i % 2 != 0)
                sumOdd = sumOdd + i;
            { // возможно ты хотел печатать на экран внутри if, тогда эту фигурную скобку необходимо перенести в конец строки 10
                System.out.println(i);
            }
        }
        for (int a = 1; a <= numbers; a++) {
            if (a % 2 == 0)
                sumEven = sumEven + a;
            { // возможно ты хотел печатать на экран внутри if, тогда эту фигурную скобку необходимо перенести в конец строки 17
                System.out.println(a);
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println(sumOdd + sumEven);
    }
}