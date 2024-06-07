package pingwit.dima.homework_6.task_4;

// отформатируй код
// задача выполнена, попробуй сделать так, чтобы результат красиво выводился, т.е. все столбики были ровными как настоящая таблица
public class MultiplicationTable {
    public static void main(String[] args) {

        int[][] table = new int[10][2];

        for (int i = 0; i < 10; i++) {
            table[i][0] = i + 1;
            table[i][1] = (i + 1) * 9;
        }
        System.out.println("Таблица умножения на 9:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d * 9 = %2d\n ", table[i][0], table[i][1]);
        }
    }
}
