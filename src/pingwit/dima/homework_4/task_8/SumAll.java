package pingwit.dima.homework_4.task_8;

public class SumAll {
    public static void main(String[] args) {
        int i, a;
        int sumEven = 0;
        int sumOdd = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 != 0)
                sumOdd = sumOdd + i;
            {
                System.out.println(i);
            }
        }
        for (a = 1; a <= 100; a++) {
            if (a % 2 == 0)
                sumEven = sumEven + a;
            {
                System.out.println(a);
            }
        }
        System.out.println(sumOdd);
        System.out.println(sumEven);
        System.out.println(sumOdd + sumEven);
    }
}