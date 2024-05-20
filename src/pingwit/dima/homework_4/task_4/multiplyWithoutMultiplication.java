package pingwit.dima.homework_4.task_4;
public class multiplyWithoutMultiplication {
    public static int multiplyWithoutMultiplication(int A, int B) {
        int result = 0;
        boolean isNegative = false;
        if (A < 0 && B > 0 || A > 0 && B < 0) {
            isNegative = true;
        }
        A = Math.abs(A);
        B = Math.abs(B);
        for (int i = 0; i < B; i++) {
            result += A;
        }
        if (isNegative) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) {
        int A = 5;
        int B = 4;

        System.out.println("AB = " + multiplyWithoutMultiplication(A, B));
    }
}

