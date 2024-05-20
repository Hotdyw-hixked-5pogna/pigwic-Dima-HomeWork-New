package pingwit.dima.homework_4.task_2;

public class Amoeba {
    public static void main(String[] args) {
        //todo rename "quantityCells", new vars
        int dailyCells = 1;
        int timeDivision = 24;
        int increaseCell = 2;
        int totalCells = dailyCells;
        for (int i = 0; i <= timeDivision; i += 3) {
            dailyCells = dailyCells * increaseCell;
            totalCells = totalCells + dailyCells;
            System.out.println(dailyCells);
        }
        System.out.println(totalCells);
    }
}
