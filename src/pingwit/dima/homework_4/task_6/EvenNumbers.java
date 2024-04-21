package pingwit.dima.homework_4.task_6;

public class EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 101; i += 2) {
            {
                sum = sum + i;
                System.out.println(i);
            }
        }
        System.out.println(sum);
    }
}