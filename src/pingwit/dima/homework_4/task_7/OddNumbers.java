package pingwit.dima.homework_4.task_7;

public class OddNumbers {
    public static void main(String[] args) {
        int sumOddNumbers = 0;
        int numbers = 100;
        for (int i = 0; i < numbers; i++) {
            if (i % 2 != 0) {
                sumOddNumbers = sumOddNumbers + i;
                System.out.println(i);
            }
        }
        System.out.println(sumOddNumbers);
    }
}
