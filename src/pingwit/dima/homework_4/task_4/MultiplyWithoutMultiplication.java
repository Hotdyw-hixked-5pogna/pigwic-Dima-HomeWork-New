package pingwit.dima.homework_4.task_4;

public class MultiplyWithoutMultiplication {
    public static int MultiplyWithoutMultiplication(int a, int b) { // названия методов с маленькой буквы
        // названия переменных с маленькой буквы, а ты сам решал задачу?
        // - Почти, нашел подобную задачу.
        // - давай пока без поисков в интернете. Лучше своими силами, но чтобы ты разобрался
        int result = 0;
        boolean isNegative = false;
        if (a < 0 && b > 0 || a > 0 && b < 0) {
            isNegative = true;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        for (int i = 0; i < b; i++) {
            result += a;
        }
        if (isNegative) {
            result = -result;
        }

        return result;
    }

    public static void main(String[] args) { // метод мейн лучше ставить выше других методов
        int a = 5;
        int b = 4;

        System.out.println("AB = " + MultiplyWithoutMultiplication(a, b));
    }
}

