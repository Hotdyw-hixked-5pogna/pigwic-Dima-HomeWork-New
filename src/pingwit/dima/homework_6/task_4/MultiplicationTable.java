package pingwit.dima.homework_6.task_4;
// отформатируй код
// задача выполнена, попробуй сделать так, чтобы результат красиво выводился, т.е. все столбики были ровными как настоящая таблица
public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10; // 10 -> 9
        int [][] table = new int[size][size];
        //
        for (int i = 0; i < size - 1; i++) { // size - 1 -> size
            for (int j = 0; j < size - 1; j++) { // size - 1 -> size
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < size - 1; i++) { // size - 1 -> size
            for (int j = 0; j < size - 1; j++) { // size - 1 -> size
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
