package pingwit.dima.homework_4.task_9;

public class Rhombus {
    public static void main(String[] args) { // очень неплохо получилось
        int num = 10;
        System.out.println();
        System.out.println("Ромб");
        int z = 0; // z -> давай дадим переменной хорошее название, например, border
        for (int i = 0; i < num / 2; i++) {
            int prob = (num - z) / 2;
            for (int j = 0; j < prob; j++) { // давай еще объединим этот цикл и цикл в строках 14-16, а внутри цикла будет if(), для печати нужного символа
                System.out.print(" ");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();
            z = z + 2;
        }
        // я бы предложил здесь абзац поставить, чтобы визуально отделить
        z = num - 2;
        for (int i = num / 2 + 1; i > 0; i--) {
            int prob = (num - z) / 2;
            for (int j = 0; j < prob; j++) { // давай еще объединим этот цикл и цикл в строках 27-29, а внутри цикла будет if(), для печати нужного символа
                System.out.print(" ");
            }
            for (int k = 0; k < z; k++) {
                System.out.print("*");
            }
            System.out.println();
            z = z - 2;
        }
    }
}