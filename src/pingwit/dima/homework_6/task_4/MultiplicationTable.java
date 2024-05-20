package pingwit.dima.homework_6.task_4;

public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 10;
        int [][] table = new int[size][size];
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
