package pingwit.dima.homework_4.task_3;

public class SumNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 257; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}
